<?php
/*
 * dropSchema.php - used to drop schema/database prior to recreating schema/database
 */
$query = "DROP DATABASE if exists $db;";      /* variable $query to hold SQL statement */

include 'queryResult.php';          /* include file to process $query statement */

while ($row = mysqli_fetch_array($return)) {
    echo "<b>".$row[0]." | </b>";           /* display column headings from table */
}
echo "<br>";
echo "database $db successfully dropped <br>";       /* message displayed if $query statement successful, otherwise error message returned from $query */
echo "<br>";
?>