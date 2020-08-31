<?php
/*
 * MonstersAdd.php used to include all required files for connecting to host, creating, dropping and/or recreating schema/database and table, inserting 
 * records into table, removing selected records by making records inactive, display record count, list all records, and close connection.
 */
require_once 'set_variables.php';          /* set variable values to be used in program to avoid repetition */
require_once 'host_connection.php';     /* connect to MySQL on the host */
require_once 'db_connection.php';       /* connect to the schema/database after creation */
require_once 'use_schema.php';          /* select the schema/database for use */
include 'sql_insert.php';   /* comment out after table is created or uncomment to recreate the table */

mysqli_close($con);                           /* close the MySQL connection */
?>