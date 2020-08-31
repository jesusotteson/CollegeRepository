<?php

ini_set("display_errors", 1);
ini_set("display_startup_error", 1);
error_reporting(E_ALL);


$servername = "localhost";
$username = "root";
$password = "dbpass";
$db = "Library";

function query($conn, $query) {
    $result = $conn->query($query);
    if ($result === FALSE) {
        echo "Error with querey" . $conn->error;
    }
    return $result;
}

function showResult($result) {
    if ($result->num_rows > 0) {
        while ($row = $result->fetch_array(MYSQLI_NUM)) 
                {
            for ($index = 0; $index < count($row); $index++) {
                echo $row[$index] . " ";
            }
            echo"<br>";
        }
    } else {
        echo "No Results";
    }
    echo "<br>";
}

function get_error($connection) {
    echo "<br>" . $connection->error . "<br>";
}

// Create connection
$conn = new mysqli($servername, $username, $password, $db);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
echo "Connected successfully<br><br><br>";
query($conn, 'use $db');

echo "State with the largest population size: ";
$result = query($conn, "SELECT Name FROM $tbl WHERE Population in (SELECT MAX(Population) FROM $tbl)");
showResult($result);

echo"State with the lowest population size, excluding DC: ";
$result = query($conn, "SELECT Name FROM $tbl WHERE Population in (SELECT MIN(Population) FROM $tbl WHERE Name != 'District Of Columbia')");
showResult($result);

echo"State with the closest average population size: ";
$result = query($conn, "Select name From $tbl Order by ABS(population - (Select AVG(population) From $tbl Where Name != 'District Of Columbia')) Limit 1;");
showResult($result);  

echo"State with largest land size in square miles: ";
$result = query($conn, "SELECT Name FROM $tbl WHERE Landsqmiles in (SELECT MAX(Landsqmiles) FROM $tbl WHERE Name != 'District Of Columbia')");
showResult($result); 

echo"State with smallest land size in square miles: ";
$result = query($conn, "SELECT Name FROM $tbl WHERE Landsqmiles in (SELECT MIN(Landsqmiles) FROM $tbl WHERE Name != 'District Of Columbia')");
showResult($result); 

echo"State with the closest average land size in square miles: ";
$result = query($conn, "Select name From $tbl Order by ABS(Landsqmiles - (Select AVG(Landsqmiles) From $tbl Where Name != 'District Of Columbia')) Limit 1");
showResult($result); 

echo"State with the largest size in square miles of water: ";
$result = query($conn, "Select name From $tbl WHERE (Totalsqmiles - Landsqmiles) = (SELECT MAX(Totalsqmiles - Landsqmiles) FROM $tbl)");
showResult($result);

echo"State with the smallest size in square miles of water: ";
$result = query($conn, "Select name From $tbl WHERE (Totalsqmiles - Landsqmiles) = (SELECT MIN(Totalsqmiles - Landsqmiles) FROM $tbl Where Name != 'District Of Columbia')");
showResult($result);

echo"State with the closest average size in square miles of water: ";
$result = query($conn, "Select name From $tbl Order by ABS((Totalsqmiles - Landsqmiles) - (Select AVG(Totalsqmiles - Landsqmiles) From $tbl Where Name != 'District Of Columbia')) Limit 1");
showResult($result);

echo"Total US population size: ";
$result = query($conn, "SELECT SUM(Population) From $tbl");
showResult($result);

echo"Total US land size in square miles: ";
$result = query($conn, "SELECT SUM(Landsqmiles) From $tbl");
showResult($result);

echo"Total US water size in square miles: ";
$result = query($conn, "SELECT SUM(Totalsqmiles - Landsqmiles) From $tbl");
showResult($result);

echo"Average population size per land square mile for each state: ";
$result = query($conn, "SELECT Name, (Population / Landsqmiles) From $tbl Where Name != 'District Of Columbia'");
showResult($result);

echo"Average population size per land square mile for the entire United States: ";
$result = query($conn, "SELECT AVG(Population / Landsqmiles) From $tbl Where Name != 'District Of Columbia'");
showResult($result);

echo"Average population size per water square mile for each state: ";
$result = query($conn, "SELECT Name, (Population / (Totalsqmiles - Landsqmiles)) From $tbl Where Name != 'District Of Columbia'");
showResult($result);

echo"Average population size per water square mile for the entire United States: ";
$result = query($conn, "SELECT AVG(Population / (Totalsqmiles - Landsqmiles)) From $tbl Where Name != 'District Of Columbia'");
showResult($result);

get_error($conn);
?>