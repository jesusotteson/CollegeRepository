<?php
/*
 * MonstersAdd.php used to include all required files for connecting to host, creating, dropping and/or recreating schema/database and table, inserting 
 * records into table, removing selected records by making records inactive, display record count, list all records, and close connection.
 */
require_once 'set_variables.php';          /* set variable values to be used in program to avoid repetition */
require_once 'host_connection.php';     /* connect to MySQL on the host */
include 'dropSchema.php';         /* commented out until you want to drop and recreate the schema/database (dropping schema/db will drop all tables in schema/db)*/
include 'createSchema.php';      /* comment out after schema/database is created or uncomment to recreate the schema/database */
require_once 'db_connection.php';       /* connect to the schema/database after creation */
require_once 'use_schema.php';          /* select the schema/database for use */
include 'showDatabases.php';        /* display existing database schemas */
include 'dropTable.php';           /* commented out until you want to drop and recreate the table */
include 'createTable.php';        /* comment out after table is created or uncomment to recreate the table */
include 'describeTable.php';        /* display table layout */
include 'tableArray.php';        /* array of table entries layout */
include 'insertTableRecords.php';         /* comment out after records are inserted into the table or you will have duplicate records */
include 'listTableRecords.php';            /* create a list by selecting all records from the table that includes both active and inactive records */
include 'getRecordCount.php';              /* get number of records in the table */
include 'removeTableRecords.php';      /* remove select records from the table - not actually removed, just marked inactive so they can be deleted if desired */
include 'getRecordCount.php';             /* get number of records in the table */
include 'listTableRecords.php';            /* create a list by selecting all records from the table that includes both active and inactive records */

mysqli_close($con);                           /* close the MySQL connection */
?>