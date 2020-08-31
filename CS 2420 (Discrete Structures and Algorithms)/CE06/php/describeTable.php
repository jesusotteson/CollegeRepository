<?php
/*
 * describeTable.php - used to show table layout
 */
$query = "DESCRIBE $db.$tbl;";        /* variable $query to hold SQL statement */

include 'queryResult.php';          /* include file to process $query statement */

while ($row = mysqli_fetch_array($return)) {
    echo "<b>".$row[0]." | </b>";           /* display column headings from table */
}
echo "<br>";	
echo "table $tbl displayed <br>";          /* message displayed if $query statement successful, otherwise error message returned from $query */
echo "<br>";
?>