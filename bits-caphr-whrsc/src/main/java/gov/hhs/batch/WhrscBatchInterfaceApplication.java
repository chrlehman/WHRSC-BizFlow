package gov.hhs.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WhrscBatchInterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhrscBatchInterfaceApplication.class, args);
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
	       return new PropertySourcesPlaceholderConfigurer();
	    }
}
