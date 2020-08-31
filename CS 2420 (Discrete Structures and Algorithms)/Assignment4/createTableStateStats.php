<?php
/*
 * createTableStateStats.php - used to create table and define column names and data types
 */
$query = "CREATE TABLE $tbl ("
."Abbr char(2) NOT NULL,"
."Name varchar(20) NOT NULL,"
."Capital varchar(25) NOT NULL,"
."Population int(11) NOT NULL,"
."TotalSqMiles int(11) NOT NULL,"
."LandSqMiles int(11) NOT NULL,"
."DateOfStatehood date NOT NULL,"
."StateFlower varchar(30) DEFAULT NULL,"
."StateBird varchar(30) DEFAULT NULL,"
."StateTree varchar(30) DEFAULT NULL,"
."PRIMARY KEY (Abbr),"
."UNIQUE KEY Abbr_UNIQUE (Abbr)"
.") COMMENT='State statistics';";
//.") ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='State statistics';";

include 'queryResult.php';           /* include file to process $query statement */

echo "table $tbl successfully created <br>";         /* message displayed if $query statement successful, otherwise error message returned from $query */
?>