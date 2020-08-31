<?php ?>
<html>
    <head>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="style.css" rel="stylesheet">
    </head>
    <body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">
        <!-- nav-bar start -->
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#" >Jp Otteson</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown" id="dropdown1">
                            <a href="#" class="dropdown-toggle" 
                               data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" >Assignments & Exercises
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu" id="dropdown-menu1">
                                <li><a href="http://ec2-18-221-40-179.us-east-2.compute.amazonaws.com/Assignment1/WhoAmI.php">Assignment 1</a></li>
                                <li><a href="http://ec2-18-221-40-179.us-east-2.compute.amazonaws.com/Assignment2/contactsForm.php">Assignment 2</a></li>
                                <li><a href="http://ec2-18-221-40-179.us-east-2.compute.amazonaws.com/Assignment3/contactsForm.php">Assignment 3</a></li>
                                <li><a href="http://ec2-18-221-40-179.us-east-2.compute.amazonaws.com/ecommerc                      3/Login.php">CE13</a></li>
                                <li><a href="http://ec2-18-221-40-179.us-east-2.compute.amazonaws.com/CE14/CE14.php">CE14</a></li>
                            </ul>
                    </ul>
                </div>
            </div>          
        </nav>
        <!-- nav-bar end -->
        <br><br>
        <br><br>
        <div class="col-lg-3">
            <img class="img-responsive img-rounded" src="images/disneyland.jpg" style="width:350px;height: 450px;">
        </div>
        <div class="col-lg-6" style="font-size: 16px;">
            <h3>About Me</h3>
            <p>My name is Jp, I like programming, video games, and just hanging out in general.</p>
            <p>I am currently focused on programming and making little games to improve different coding languages.</p>
            <p>I anticipate either creating my own programs or working for companies to program whatever they might need me to do.</p>
        </div>
        <div class="col-lg-3">
            <img class="img-responsive img-rounded" src="images/cruise.jpg" style="width: 350px;height: 450px;">
        </div>
        <br><br>
    </body>
</html>