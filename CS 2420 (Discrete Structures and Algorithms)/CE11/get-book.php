<?php
//provide your hostname, username and dbname
$host = "localhost"; 
$username = "root";  
$password = "dbpass";
$db = "Library";  
$table = "book_mast";
$book_result = $_POST["book"];
$search = "SELECT * FROM $table WHERE book_name = '$book_result';";
$conn = new mysqli($host, $username, $password, $db);
$result = $conn->query($search);
$row = mysqli_fetch_array($result, MYSQLI_NUM);
if($result->num_rows > 0){
    
    echo "<h3>Results</h3>" 
    . "<ul> <li>Book ID:</li><li>$row[0]</li><li>Book Name:</li><li>$row[1]</li><li>ISBN:</li><li>$row[2]</li><li>Category ID:</li><li>$row[3]</li><li> Author ID:</li>"
    . "<li>$row[4]</li><li>Publication ID:</li><li>$row[5]</li><li>Date of Publication:</li><li>$row[6]</li><li>Published Language:</li><li>$row[7]</li><li>Number of Pages:</li>"
    . "<li>$row[8]</li><li>Price:</li><li>$row[9]</li></ul>";
    
}
mysqli_close($conn);
?>
