SET DEFINE OFF;

UPDATE HHS_WHRSC_HR.TYPE_VALUES SET DISP_ORDER = 10 WHERE TYPE_NAME = 'rybCodeList' AND TYPE_VALUE = 'Green';
UPDATE HHS_WHRSC_HR.TYPE_VALUES SET DISP_ORDER = 20 WHERE TYPE_NAME = 'rybCodeList' AND TYPE_VALUE = 'Yellow';
UPDATE HHS_WHRSC_HR.TYPE_VALUES SET DISP_ORDER = 30 WHERE TYPE_NAME = 'rybCodeList' AND TYPE_VALUE = 'Red';

commit;