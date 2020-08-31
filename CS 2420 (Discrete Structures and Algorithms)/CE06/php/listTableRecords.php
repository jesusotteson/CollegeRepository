<?php
/*
 * listTableRecords.php - used to list all table records
 */
echo "<hr><br><h2>List of all records selected</h2><hr>";       /* display heading */

$query = "DESCRIBE $tbl;";           /* variable $query to hold SQL statement */

include 'queryResult.php';          /* include file to process $query statement */

while ($row = mysqli_fetch_array($return)) {
    echo "<b>".$row[0]." | </b>";           /* display column headings from table */
}

echo "<br>";

$query = "SELECT * FROM $tbl;";      /* variable $query to hold SQL statement */

include 'queryResult.php';          /* include file to process $query statement */

while ($row = mysqli_fetch_array($return)) {            /* display each table row returned from select statement */
    echo "".$row[0]."<b> | </b>".$row[1]."<b> | </b>".$row[2]."<b> | </b>".$row[3]."<b> | </b>".$row[4]."<b> | </b>".$row[5]."<b> | </b>".$row[6]."<b> | </b>".$row[7]."<b> | </b>".$row[8]."<b> | </b>".$row[9]."<br><br>";
}
?>