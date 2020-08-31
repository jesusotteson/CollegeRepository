<?php
/*
 * dropTableStateStats.php - used to drop table prior to recreate
 */
$query = "DROP TABLE IF EXISTS $tbl;";        /* variable $query to hold SQL statement */

include 'queryResult.php';          /* include file to process $query statement */
	
echo "table $tbl successfully dropped <br>";          /* message displayed if $query statement successful, otherwise error message returned from $query */
?>