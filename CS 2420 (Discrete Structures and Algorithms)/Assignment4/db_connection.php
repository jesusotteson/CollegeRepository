<?php
/*
 * db_connection.php - used to connect to schema/database
 */
$db_selected = mysqli_select_db($con, $db) or die (mysqli_error($con));

echo "database $db successfully connected <br>";       /* message displayed if connection successful, otherwise error message returned from MySQL */
?>