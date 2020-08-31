<?php
/***
 * use_schema.php - for setting the schema/database to use for tables
 */
$query = "USE $db;";

include 'queryResult.php';          /* include file to process $query statement */

while ($row = mysqli_fetch_array($return)) {
    echo "<b>".$row[0]." | </b>";           /* display column headings from table */
}
echo "<br>";
echo "using database $db <br>";       /* message displayed if $query statement successful, otherwise error message returned from $query */
?>