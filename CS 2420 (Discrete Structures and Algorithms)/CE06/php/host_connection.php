<?php
/*
 * host_connection.php - used to make connection to host system
 */

//$con = mysqli_connect($host, $user, $password) or die(mysqli_error($con));      /* SQL command to make connection, returns error message if unsuccessful */
$con = mysqli_connect("localhost","root","dbpass") or die(mysqli($con));

echo "successfully connected to localhost <br>";     /* message displayed if connection successful, otherwise error message returned from MySQL */
?>