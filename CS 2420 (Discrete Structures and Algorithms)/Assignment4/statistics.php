
        <?php
        require_once 'DataBaseConnection.php';
        echo '<h2>State with the largest population size.</h2><br>';
        //$select = "SELECT * FROM $db.$tbl";
        $state1 = "SELECT * FROM $db.$tbl ORDER BY Population";
        //if (isset($_POST ['Library'])) {
        //    $state1 = "SELECT * FROM $tbl ORDER BY Population"; // ORDER BY ".$order.";";
       // }
        $return = mysqli_query($con, $state1);
        if (!$return) { // here we check to see if we got a result set
            $message = "Whole query " . $select;
            echo $message;
            die('Invalid query: ' . mysqli_error($con));
        }
        while ($row = mysqli_fetch_array($return)) { // here we are loading the results into the variable row one at a time and printing out the row
            $Abbr = $row ['Abbr']; // you will not we have to use the collum names in the database
            $Name = $row ['Name'];
            $Population = $row ['Population'];
            
            echo "<option value = >$Population - $Abbr $Name</option>";
            
        }
        
        echo '<h2>State with largest land size in square miles.</h2><br>';
        
        $state2 = "SELECT * FROM $db.$tbl ORDER BY LandSqMiles";
        if (isset($_POST ["$db"])) {
            $state2 = "SELECT * FROM $db.$tbl ORDER BY Abbr, LandSqMiles"; // ORDER BY ".$order.";";
        }
        $return2 = mysqli_query($con, $state2);
        if (!$return2) { // here we check to see if we got a result set
            $message = "Whole query " . $select;
            echo $message;
            die('Invalid query: ' . mysqli_error($con));
        }
        while ($row = mysqli_fetch_array($return2)) { // here we are loading the results into the variable row one at a time and printing out the row
            $Abbr = $row ['Abbr']; // you will not we have to use the collum names in the database
            $Name = $row ['Name'];
            $LandSqMiles = $row ['LandSqMiles'];
            
            echo "<option value = >$LandSqMiles - $Abbr $Name</option>";            
        }
        
        $sum = "SELECT SUM(LandSqMiles) AS SumLandSqMiles FROM $db.$tbl";
        $return3 = mysqli_query($con, $sum);
       if (!$return3) { // here we check to see if we got a result set
            $message = "Whole query " . $sum;
            echo $message;
            die('Invalid query: ' . mysqli_error($con));
        }
        
        echo '<h2>Total US land size in square miles.</h2><br>';
        $totalLand;
        while ($row = mysqli_fetch_array($return3)) { // here we are loading the results into the variable row one at a time and printing out the row
          //  $Abbr = $row ['Abbr']; // you will not we have to use the collum names in the database
          //  $Name = $row ['Name'];
            $sumtotal = $row ['SumLandSqMiles'];
            
            echo "<option value = >$sumtotal US total SqMiles</option>"; 
            $totalLand = $sumtotal;
        }
        //total populatiom
        $sum2 = "SELECT SUM(Population) AS SumPopulation FROM statestats";
        $return4 = mysqli_query($con, $sum2);
       if (!$return4) { // here we check to see if we got a result set
            $message = "Whole query " . $sum2;
            echo $message;
            die('Invalid query: ' . mysqli_error($con));
        }
        
        echo '<h2>Total US population size.</h2><br>';
        $totalPop;
        while ($row = mysqli_fetch_array($return4)) { // here we are loading the results into the variable row one at a time and printing out the row
          //  $Abbr = $row ['Abbr']; // you will not we have to use the collum names in the database
          //  $Name = $row ['Name'];
            $sumtotal = $row ['SumPopulation'];
            
            echo "<option value = >$sumtotal US total Population</option>";
            $totalPop = $sumtotal;
        }
        
        echo '<h2>largest population size.</h2><br>';
        $maxpop = "SELECT MAX(Population) AS HighestPopulation FROM statestats";
        $return5 = mysqli_query($con, $maxpop); 
        if (!$return5) { // here we check to see if we got a result set
            $message = "Whole query " . $maxpop;
            echo $message;
            die('Invalid query: ' . mysqli_error($con));
        }
        while ($row = mysqli_fetch_array($return5)) { // here we are loading the results into the variable row one at a time and printing out the row
            // $Abbr = $row ['Abbr']; // you will not we have to use the collum names in the database
            // $Name = $row ['Name'];
            $maxtotal = $row ['HighestPopulation'];
            
           // echo "<option value = >$maxtotal</option>";            
        }
        $maxpopName = "SELECT Name FROM statestats WHERE Population = $maxtotal";
        $return5a = mysqli_query($con, $maxpopName); 
        if (!$return5a) { // here we check to see if we got a result set
            $message = "Whole query " . $maxpopName;
            echo $message;
            die('Invalid query: ' . mysqli_error($con));
        }
        while ($row = mysqli_fetch_array($return5a)) { // here we are loading the results into the variable row one at a time and printing out the row
            //$Abbr = $row ['Abbr']; // you will not we have to use the collum names in the database
            $Name = $row ['Name'];
            //$maxtotal = $row ['HighestPopulation'];       
        }           
         echo "<option value = >$Name  $maxtotal</option>";     
        
        echo '<h2>smallest population size.</h2><br>';
        $minpop = "SELECT MIN(Population) AS LowestPopulation FROM statestats";
        $return6 = mysqli_query($con, $minpop); 
        if (!$return6) { // here we check to see if we got a result set
            $message = "Whole query " . $minpop;
            echo $message;
            die('Invalid query: ' . mysqli_error($con));
        }
        while ($row = mysqli_fetch_array($return6)) { // here we are loading the results into the variable row one at a time and printing out the row
           // $Abbr = $row ['Abbr']; // you will not we have to use the collum names in the database
            //$Name = $row ['Name'];
            $mintotal = $row ['LowestPopulation'];
            
          //  echo "<option value = >$mintotal </option>";            
        }
        $minpopName = "SELECT Name FROM statestats WHERE Population = $mintotal";
        $return6a = mysqli_query($con, $minpopName); 
        if (!$return6a) { // here we check to see if we got a result set
            $message = "Whole query " . $minpopName;
            echo $message;
            die('Invalid query: ' . mysqli_error($con));
        }
        while ($row = mysqli_fetch_array($return6a)) { // here we are loading the results into the variable row one at a time and printing out the row
            // $Abbr = $row ['Abbr']; // you will not we have to use the collum names in the database
            $Name = $row ['Name'];
            //$mintotal = $row ['LowestPopulation'];         
        }
        echo "<option value = >$Name  $mintotal</option>";   
        
        echo '<h2>largest land size in square miles.</h2><br>';
        
        $maxland = "SELECT MAX(LandSqMiles) AS Highestland FROM statestats";
        $return7 = mysqli_query($con, $maxland); 
        if (!$return7) { // here we check to see if we got a result set
            $message = "Whole query " . $maxland;
            echo $message;
            die('Invalid query: ' . mysqli_error($con));
        }
        while ($row = mysqli_fetch_array($return7)) { // here we are loading the results into the variable row one at a time and printing out the row
           // $Abbr = $row ['Abbr']; // you will not we have to use the collum names in the database
           // $Name = $row ['Name'];
            $maxtotal = $row ['Highestland'];
            
            //echo "<option value = >$maxtotal</option>";            
        }
        $maxlandName = "SELECT Name FROM statestats WHERE LandSqMiles =$maxtotal ";
        $return7a = mysqli_query($con, $maxlandName); 
        if (!$return7a) { // here we check to see if we got a result set
            $message = "Whole query " . $maxlandName;
            echo $message;
            die('Invalid query: ' . mysqli_error($con));
        }
        while ($row = mysqli_fetch_array($return7a)) { // here we are loading the results into the variable row one at a time and printing out the row
           // $Abbr = $row ['Abbr']; // you will not we have to use the collum names in the database
           $Name = $row ['Name'];
           // $maxtotal = $row ['Highestland'];       
        }
        echo "<option value = >$Name  $maxtotal</option>";     
        
        echo '<h2>lowest land size in square miles.</h2><br>';
        
        $minland = "SELECT MIN(LandSqMiles) AS Lowestland FROM statestats WHERE Abbr <> 'DC' ";
        $return8 = mysqli_query($con, $minland); 
        if (!$return8) { // here we check to see if we got a result set
            $message = "Whole query " . $minland;
            echo $message;
            die('Invalid query: ' . mysqli_error($con));
        }
        while ($row = mysqli_fetch_array($return8)) { // here we are loading the results into the variable row one at a time and printing out the row
           // $Abbr = $row ['Abbr']; // you will not we have to use the collum names in the database
            //$Name = $row ['Name'];
            $mintotal = $row ['Lowestland'];
            
            //echo "<option value = >$mintotal $Abbr $Name</option>";            
        }
        $minlandName = "SELECT Name FROM statestats WHERE LandSqMiles =$mintotal ";
        $return8a = mysqli_query($con, $minlandName); 
        if (!$return8a) { // here we check to see if we got a result set
            $message = "Whole query " . $minlandName;
            echo $message;
            die('Invalid query: ' . mysqli_error($con));
        }
        while ($row = mysqli_fetch_array($return8a)) { // here we are loading the results into the variable row one at a time and printing out the row
            // $Abbr = $row ['Abbr']; // you will not we have to use the collum names in the database
            $Name = $row ['Name'];
            //$mintotal = $row ['Lowestland'];        
        }
        echo "<option value = >$Name  $mintotal</option>";    
        
         echo '<h2>Average population size per land square mile for the entire United States.</h2><br>';
         
         $superTotal = $totalPop / $totalLand;
         echo $superTotal ." people per square mile";
        ?>