<?php
/*
 * getRecordCount.php - used to get number of table records
 */
echo "<hr><br><h2>Record count</h2><hr>";       /* display heading */

$query = "SELECT COUNT(*) FROM $tbl;";           /* variable $query to hold SQL statement */

include 'queryResult.php';          /* include file to process $query statement */

while ($row = mysqli_fetch_array($return)) {
    echo "Number of records: " . $row[0]."<br>";        /* query results displayed if $query statement successful, otherwise error message returned from $query */
}
?>