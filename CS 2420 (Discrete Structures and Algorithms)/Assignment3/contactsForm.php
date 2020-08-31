<html>
    <head>
        <title></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="../bootstrap/js/bootstrap.js" type="text/javascript"></script>
        <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="../style.css" rel="stylesheet">
        <script src="validate.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container-fluid text-center">
            <h3>Address Book</h3>
        </div>
        <div class="container-fluid">
            <form action="contactsBook.php" method="post" name="form">
                <table class="table table-responsive text-center">
                    <tr>
                        <td>First Name</td>
                        <td>
                            <input type="text" name="fName">
                        </td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td>
                            <input type="text" name="lName">
                        </td>
                    </tr>
                    <tr>
                        <td>Phone Number</td>
                        <td>
                            <input type="text" name="phone">
                        </td>
                    </tr>
                    <tr>
                        <td><input class="btn btn-primary" type="submit" value="Search" name="requestType" onclick="return(searchverify());"> </td>
                        <td><input class="btn btn-primary" type="submit" value="Update" name="requestType" onclick="return(verify());"></td>
                        <td><input class="btn btn-primary" type="submit" value="Create"  name="requestType" onclick="return(verify());"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>