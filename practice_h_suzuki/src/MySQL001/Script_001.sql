INSERT INTO moeiwast_eiwatest_DB01.test01_Suzuki(INT_NUM,NAME_STR
,DBL_NUM,CREATE_DATE) VALUES (20563132,'旧旧木気鈴広','831.512','2087/12/31');

SELECT * FROM moeiwast_eiwatest_DB01.test_table;

UPDATE moeiwast_eiwatest_DB01.test_table SET NAME_STR = '新新新鈴
木広気' WHERE INT_NUM = '20563132' ORDER BY CREATE_DATE DESC;

SELECT * FROM moeiwast_eiwatest_DB01.test_table;
