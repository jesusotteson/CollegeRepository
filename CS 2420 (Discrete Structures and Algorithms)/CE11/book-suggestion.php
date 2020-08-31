<?php

$host = "localhost"; 
$username = "root";  
$password = "dbpass";
$db = "Library";  
$table = "book_mast";
$book_name = $_POST["book_name"];
$search = "SELECT book_name FROM $table WHERE book_name LIKE '$book_name%';";
$conn = new mysqli($host, $username, $password, $db);



$result = $conn->query($search);

while($row = mysqli_fetch_array($result)){
    echo "<p>".$row['book_name']."</p>";
}

?>
