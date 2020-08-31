<?php
//Turns Answers in the WhoAmI page into variables
$name = ucwords(strtolower(htmlentities($_POST['Name'])));
$age = $_POST['Age'];
$address = $_POST['Address'];
$state = $_POST['State'];
$sex = $_POST['Sex'];
//Gives the poem a variable name
$file = explode("\n", file_get_contents("PostPage.txt"));
//Turning our age into a year
$currentYear = date(Y);
$yearBorn = $currentYear - $age - 1;
$yearsLived = array();
//Creates a loop to print out the years you've been alive
while ($yearBorn != $currentYear) {
    $yearsLived[] = $yearBorn;
    $yearBorn++;
}

$yearsLived[] = $currentYear;
//Lets the page know what color to be based on sex
if ($sex == "Male") {
    $background = "#99ccff";
} else {
    $background = "#ff99cc";
}
?>

<html>
    <head>
        <meta charset="utf-8">
        <title>Who You Are</title>
        <style>
            h2 {
                display: block;
                padding: 8px 16px;
            }
        </style>
    </head> 
    <?php
    //Prints out my variables
    printf("<body style='background-color: %s;'>", $background);
    printf("<h2 class='text-center'>Who You Are?</h2>");
    printf("<div class='container' style='font-size:16px;'>");
    printf("<p>Your Name is: <b>%s</b></p>", $name);
    printf("<p>Your Age: <b>%d</b></p>", $age);
    printf("<p>Your Address: <b>%s</b></p>", $address);
    printf("<p>Your State: <b>%s</b></p>", $state);
    printf("<p>Your Sex: <b>%s</b></p>", $sex);
    echo( "</div>");
    ?>
    <br>
    <h2>How long have you been alive?</h2>
    <?php
    //Prints out my years lived
    echo implode(", ", $yearsLived);
    ?>
    <br>
    <h2>A poem as requested: </h2>
    <?php
    //Prints out the poem
    echo implode("\n", $file);
    ?>
</body>  
</html>