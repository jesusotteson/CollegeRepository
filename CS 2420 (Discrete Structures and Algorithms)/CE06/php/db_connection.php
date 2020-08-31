<?php
/*
 * db_connection.php - used to connect to schema/database
 */
$db_selected = mysqli_select_db($con, $db) or die (mysqli_error($con));

while ($row = mysqli_fetch_array($return)) {
    echo "<b>".$row[0]." | </b>";           /* display column headings from table */
}
echo "<br>";
echo "database $db successfully connected <br>";       /* message displayed if connection successful, otherwise error message returned from MySQL */
?>