<?php
/*
 * dropSchemaStates.php - used to drop schema/database prior to recreating schema/database
 */
$query = "DROP DATABASE IF EXISTS $db;";      /* variable $query to hold SQL statement */

include 'queryResult.php';          /* include file to process $query statement */

echo "database $db successfully dropped <br>";       /* message displayed if $query statement successful, otherwise error message returned from $query */
?>