package gov.hhs.batch.caphr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import gov.hhs.batch.EmailService;
import gov.hhs.batch.Properties;

@Component
public class CapHRJobListener  extends JobExecutionListenerSupport{

	private static final Logger log = LoggerFactory.getLogger(CapHRJobListener.class);
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	private Properties properties;
	@Autowired
	private EmailService emailService;

	private String jobName;
	private String exitStatus;	
	private String exitDescription;

	@Value("${send.email.notification}")
	private boolean sendEmailNotification;

	@Autowired
	public CapHRJobListener(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//Callback before a job executes.
	@Override
	public void beforeJob(JobExecution jobExecution) {
		this.jobName = jobExecution.getJobInstance().getJobName();
		log.info("JOB " + this.jobName +" STARTED. Execution Status: "+ jobExecution.getStatus());
	}

	//Callback after completion of a job. Called after both both successful and failed executions.
	@Override
	public void afterJob(JobExecution jobExecution) {
		String interfaceName = properties.getCaphrInterfaceName();
		this.jobName = jobExecution.getJobInstance().getJobName();
		this.exitStatus = jobExecution.getExitStatus().getExitCode().toString().replace("exitCode=", " "); 	
		this.exitDescription = jobExecution.getExitStatus().getExitDescription().toString().replace("exitDescription=", " ");

		log.info(interfaceName + ": " + jobName + ": " + exitStatus + ": " + exitDescription);
		if (sendEmailNotification) {
			emailService.sendCapHREmail(interfaceName, jobName, exitStatus, exitDescription);
		}
	}



}
