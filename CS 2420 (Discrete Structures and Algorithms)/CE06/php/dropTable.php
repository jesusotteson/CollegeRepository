<?php
/*
 * dropTable.php - used to drop table prior to recreate
 */
$query = "DROP TABLE if exists $db.$tbl;";        /* variable $query to hold SQL statement */

include 'queryResult.php';          /* include file to process $query statement */

while ($row = mysqli_fetch_array($return)) {
    echo "<b>".$row[0]." | </b>";           /* display column headings from table */
}
echo "<br>";
echo "table $tbl successfully dropped <br>";          /* message displayed if $query statement successful, otherwise error message returned from $query */
echo "<br>";
?>