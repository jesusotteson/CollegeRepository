<?php
/*
 * queryResult.php - used to process SQL statements, stops the program and returns an error message if statements are unsuccessful
 */
//$con = mysqli_connect("$db_host","$db_username","$db_pass") or die ("could not connect to mysql"); 

//mysqli_select_db($myConnection, "mrmagicadam") or die ("no database");
$return = mysqli_query($con, $query) or die (mysqli_error($con));

?>