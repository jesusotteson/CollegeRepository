<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Who Am I?</title>
        <!–– Small style sheet for quick edits -->
        <style>
            li {
                display: block;
                color: #000;
                padding: 8px 16px;
                text-decoration: none;
            }
            h2 {
                display: block;
                padding: 8px 16px;
            }
            input[type=submit] {
                background-color: #4CAF50;
                border: none;
                color: white;
                padding: 16px 32px;
                text-decoration: none;
                margin: 4px 2px;
                cursor: pointer;
                box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);}
            input[type=submit]:hover{
                box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
            }
        </style>
    </head>

    <body>
        <h2>Who Are You?</h2>
        <div id="form_container">
            <form method = "post" action = "WhoYouAre.php">
                <div class="container text-center" style="max-width: 30%;">
                    <ul class="appnitro">
                        <!–– Allows the user to enter info and gives it a name to be turned into variables in the next page -->
                        <li class="first">Name:</li>
                        <li class="text"><input type="text" name="Name"></li>
                        <li class="first">Age:</li>
                        <li class="text"><input type="text" name="Age"></li>
                        <li class="first">Address:</li>
                        <li class="text"><input type="text" name="Address"></li>
                        <li class="first">State:</li>
                        <li class="text"><input type="text" name="State"></li>
                        <li class="first">Sex:</li>
                        <li class="radio">
                            <!–– Lets you pick male or female as your sex-->
                            <input type="radio" value="Male" name="Sex">Male
                            <input type="radio" value="Female" name="Sex">Female</li>
                        <li><input type="submit" name="Create" value="Submit"></li>                
                    </ul>
                </div>
            </form>
        </div>
    </body>
</html>