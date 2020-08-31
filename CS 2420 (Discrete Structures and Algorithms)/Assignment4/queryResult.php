<?php
/*
 * queryResult.php - used to process SQL statements, stops the program and returns an error message if statements are unsuccessful
 */
$return = mysqli_query($con, $query) or die (mysqli_error($con));

?>