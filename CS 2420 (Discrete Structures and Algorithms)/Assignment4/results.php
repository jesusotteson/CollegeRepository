<?php
//Largest population
$query = "SELECT * FROM $db.$tbl WHERE Population=(SELECT MAX(Population) FROM $db.$tbl)";
$success = $con->query($query);
include 'queryResult.php';
$row= mysqli_fetch_array($return);
echo "<p><b><em>State with max population: </b></em>" . $row['Name'] . "</p>";

//Lowest population, excluding DC

//State with the closest average population size

//State with largest land size
$query = "SELECT * FROM Library.statestats WHERE LandSqMiles=(SELECT MAX(LandSqMiles) FROM Library.statestats)";
$success = $con->query($query);
include 'queryResult.php';
$row= mysqli_fetch_array($return);
echo "<p><b><em>State with largest land size in square miles: </b></em>" . $row['Name'] . "</p>";

//State with smallest land size in square miles, excluding DC.
$query = "SELECT * FROM Library.statestats WHERE LandSqMiles=(SELECT MIN(LandSqMiles) FROM Library.statestats WHERE Name!= 'District of Columbia')";
$success = $con->query($query);
include 'queryResult.php';
$row= mysqli_fetch_array($return);
echo "<p><b><em>State with smallest land size in square miles besides DC: </b></em>" . $row['Name'] . "</p>";

//State with the closest average land size in square miles.

//(Calculate the following for water size) The difference between TotalSqMiles and LandSqMiles is WaterSqMiles.
//  State with the largest size in square miles of water.
//$query = "SELECT "
//$query = "INSERT INTO Library.statestats(WaterSqMiles) VALUES(TotalSqMiles-LandSqMiles)";
//$success = $con->query($query);
//include 'queryResult.php';
//$row= mysqli_fetch_array($return);
//echo "<p><b><em>State with the largest size in square miles of water: </b></em>" . $row[0] . "</p>";


//$query = "SELECT *FROM Library.statestats WHERE TotalSqMiles=(SELECT MAX (TotalSqMiles)-LandSqMiles=(SELECT MAX (LandSqMiles)) ";
$success = $con->query($query);
include 'queryResult.php';
$row= mysqli_fetch_array($return);
echo "<p><b><em>State with the largest size in square miles of water: </b></em>" . $row['Name'] . "</p>";
//  State with the smallest size in square miles of water.
//  State with the closest average size in square miles of water.

//Total US population size
$query = "SELECT SUM(Population) FROM Library.statestats";
$success = $con->query($query);
include 'queryResult.php';
$row= mysqli_fetch_array($return);
echo "<p><b><em>Total US population: </b></em>" . $row[0] . "</p>";

//Total US land size in square miles.
$query = "SELECT SUM(LandSqMiles) FROM Library.statestats";
$success = $con->query($query);
include 'queryResult.php';
$row= mysqli_fetch_array($return);
echo "<p><b><em>Total Land Size in square miles: </b></em>" . $row[0] . "</p>";

//Total US water size in square miles.
$query = "SELECT SUM(TotalSqMiles-LandSqMiles) FROM Library.statestats";
$success = $con->query($query);
include 'queryResult.php';
$row= mysqli_fetch_array($return);
echo "<p><b><em>Total Water Size in square miles: </b></em>" . $row[0] . "</p>";

//Average population size per land square mile for each state.
$query = "SELECT AVG(Population+LandSqMiles)/51 FROM Library.statestats";
$success = $con->query($query);
include 'queryResult.php';
$row= mysqli_fetch_array($return);
echo "<p><b><em>Average population size per land square mile for each state: </b></em>" . $row[0] . "</p>";


//Average population size per land square mile for the entire United States.
$query = "SELECT AVG(Population+LandSqMiles) FROM Library.statestats";
$success = $con->query($query);
include 'queryResult.php';
$row= mysqli_fetch_array($return);
echo "<p><b><em>Average population size per land square mile for the entire US: </b></em>" . $row[0] . "</p>";


//Average population size per water square mile for each state.
//$query = "SELECT AVG(Population+WHERE(TotalSqMiles-LandSqMiles) FROM Library.statestats";
//$success = $con->query($query);
//include 'queryResult.php';
//$row= mysqli_fetch_array($return);
//echo "<p><b><em>Average population size per water square mile for each state: </b></em>" . $row[0] . "</p>";

//Average population size per water square mile for the entire United States.



?>     


