<?php
/*
$sql = file_get_contents('StateStatsCreate.sql');

$query = $db->exec($sql);

include 'queryResult.php';          /* include file to process $query statement */
/*
echo "table $tbl successfully created <br>";         /* message displayed if $query statement successful, otherwise error message returned from $query */

//$sql = file_get_contents('StateStatsInsert.sql');

//$query = $db->exec($sql);
$query = \file_get_contents('createTable.sql');

include 'queryResult.php';          /* include file to process $query statement */

echo "<hr><br><h2>Table created</h2><hr>";       /* display heading */

$query = \file_get_contents('insertTable.sql');

include 'queryResult.php';          /* include file to process $query statement */

echo "<hr><br><h2>Records inserted</h2><hr>";       /* display heading */