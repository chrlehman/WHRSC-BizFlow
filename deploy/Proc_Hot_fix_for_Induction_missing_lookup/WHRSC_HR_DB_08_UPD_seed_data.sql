SET DEFINE OFF;


	INSERT INTO HHS_WHRSC_HR.TYPE_VALUES (TYPE_NAME, TYPE_VALUE,CONDITION_2) VALUES ('oPDivList','ACL',';ALL;');
	INSERT INTO HHS_WHRSC_HR.TYPE_VALUES (TYPE_NAME, TYPE_VALUE,CONDITION_2) VALUES ('oPDivList','OIG',';ALL;');

	INSERT INTO HHS_WHRSC_HR.OPDIV_AFFILIATION (OPDIV,AFFILIATION, AFFILIATION_CODE) VALUES('ACL','ACL','ACL');

COMMIT;
