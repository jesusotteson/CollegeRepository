<?php
/*
 * StateStatsAdd.php used to include all required files for connecting to host, creating, dropping and/or recreating schema/database and table, inserting 
 * records into table, display record count, list all records, and close connection.
 */
require_once 'set_variables.php';          /* set variable values to be used in program to avoid repetition */
require_once 'host_connection.php';     /* connect to MySQL on the host */
//include 'dropSchemaStates.php';         /* commented out until you want to drop and recreate the schema/database (dropping schema/db will drop all tables in schema/db)*/
include 'createSchemaStates.php';      /* comment out after schema/database is created or uncomment to recreate the schema/database */
require_once 'db_connection.php';       /* connect to the schema/database after creation */
require_once 'use_schema.php';          /* select the schema/database for use */
//include 'dropTableStateStats.php';           /* commented out until you want to drop and recreate the table */
include 'createTableStateStats.php';        /* comment out after table is created or uncomment to recreate the table */
include 'insertTableRecords.php';
//include 'sql_insert.php';
include 'getRecordCount.php';             /* get number of records in the table */
include 'listTableRecords.php';            /* create a list by selecting all records from the table that includes both active and inactive records */
include 'statistics.php';                         /* create statistics of records in the table */
//include 'stateTableStats.php';              /* create statistics of records in the table */
//include 'results.php';              /* create statistics of records in the table */

mysqli_close($con);                           /* close the MySQL connection */
?>