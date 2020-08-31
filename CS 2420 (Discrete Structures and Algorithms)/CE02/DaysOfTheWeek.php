<!–– Name: Jesus Otteson|||Age: 23 ––>
<html>
    <title>Days of the Week</title>
    <body>
        <?php
        $d = date("D");
        if ($d == "Fri")
            $message = "Have a nice weekend!||\n";
        elseif ($d == "Sun")
            $message = "Have a nice Sunday!||\n";
        else
            $message = "Have a nice day!||\n";

        echo $message;
        ?>
        
        <?php
        $d = date("D");
        switch ($d) {
            case "Mon":
                echo "Today is Monday||\n";
                break;
            case "Tue":
                echo "Today is Tuesday||\n";
                break;
            case "Wed":
                echo "Today is Wednesday||\n";
                break;
            case "Thu":
                echo "Today is Thursday||\n";
                break;
            case "Fri":
                echo "Today is Friday||\n";
                break;
            case "Sat":
                echo "Today is Saturday||\n";
                break;
            case "Sun":
                echo "Today is Sunday||\n";
                break;
            default:
                echo "Wonder which day is this?||\n";
        }
        ?>
        
        <?php
        $a = 0;
        $b = 0;
        for ($i = 0; $i < 5; $i++) {
            $a += 10;
            $b += 5;
        }
        echo ("At the end of the loop a=$a and b=$b;\n" );
        $i = 0;
        $num = 50;
        while ($i < 10) {
            $num--;
            $i++;
        }
        echo ("Loop stopped at i = $i and num = $num\n" );
        ?>
        
    </body>
</html>
