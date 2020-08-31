<?php
require_once ('db_connection.php');
?>
<html>
    <head>
        <title></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="../bootstrap/js/bootstrap.js" type="text/javascript"></script>
        <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="../style.css" rel="stylesheet">
    </head>
    <body>  
        <?PHP
        $fName = htmlentities($_POST['fName']);
        $lName = htmlentities($_POST['lName']);
        $phone = $_POST['phone'];
        $relation = $_POST['relation'];
        $request = $_POST['requestType'];
        print <<< HTML
        <table class='table table-striped'>
            <thead>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Phone</th>
                 </tr>
            </thead>
            <tbody>
HTML;
        switch ($request) {
            case "Search":
                $sql1 = "SELECT * FROM Family WHERE fName = '$fName' and lName = '$lName'";
                $result = $link->query($sql1);
                if (!$result) {
                    die($conn->error);
                }
                if (!$result) {
                    echo 'The information you requested could not be displayed. Please try again later.';
                } else
                if (mysqli_num_rows($result) == 0) {
                    echo '<tr><td>No Contact found.</td></tr></tbody></table>';
                } else {
                    while ($row = $result->fetch_assoc()) {
                        echo '<tr>'
                        . '<td>' . $row['fName'] . '</td>'
                        . '<td>' . $row['lName'] . '</td>'
                        . '<td>' . $row['phone'] . '</td>'
                        . '</tr></tbody></table>';
                    }
                }
                break;
            case "Create":
                $sql2 = "INSERT INTO Family (fName, lName, phone) VALUES('$fName', '$lName', '$phone')";

                $result2 = $link->query($sql2);
                if (!$result2) {
                    die($link->error);
                }
                if (!$result2) {
                    echo "User could not be created.";
                } else {
                    echo "User successfully created!";
                }
                break;
            case "Update":

                $sql3 = "UPDATE Family SET fName = '$fName', lname = '$lName', phone = '$phone'";
                          
                $result3 = $link->query($sql3);
                if (!$result3) {
                    die($link->error);
                }
                if (!$result3) {
                    echo "User could not be updated.";
                } else {
                    echo "Successfully Updated!";
                }
                break;
        }
        ?>
    </body>
</html>