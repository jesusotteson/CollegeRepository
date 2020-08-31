<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        // put your code here
        
        $db = "Library";
        $tbl = "statestats";
        

        function connect() {
            $host = "localhost";
            $user = "root";
            $password = "dbpass";
            $con = new mysqli($host, $user, $password);
            if ($con->connect_error) {
                die(mysqli_error($con));
                echo "failed<br>";
            } else {
                echo "Successfully Connected to $host<br>";
            }
            return $con;
        }

        

        function useDatabase($con, $db) {
            $query = "USE $db;";
            if ($con->query($query) === TRUE) {
                echo "Using database: $db successfully<br>";
            } else {
                echo "Error using Database: " . $con->error . "<br>";
            }
        }

        

        function getPopulation($con, $tbl) {
            echo "<hr><br><h2>Population Stats</h2><hr>";       /* display heading */

            $query = "Select Abbr, Name, Capital, Population, TotalSqMiles, LandSqMiles, DateOfStatehood, StateFlower, StateBird, StateTree from $tbl order by Population Desc limit 1;";           /* variable $query to hold SQL statement */
            
            $return = mysqli_query($con, $query) or die(mysqli_error($con));

            while ($row = mysqli_fetch_array($return)) {
                echo "<b>State with largest population: </b><br>";
                echo "" . $row[0] . "<b> | </b>" . $row[1] . "<b> | </b>" . $row[2] . "<b> | </b>" . $row[3] . "<b> | </b>" . $row[4] . "<b> | </b>". $row[5] . "<b> | </b>". $row[6] . "<b> | </b>". $row[7] . "<b> | </b>". $row[8] . "<b> | </b>" . $row[9] . "<b> | </b><br><br>";;        /* query results displayed if $query statement successful, otherwise error message returned from $query */
            }
            
            $query = "Select Abbr, Name, Capital, Population, TotalSqMiles, LandSqMiles, DateOfStatehood, StateFlower, StateBird, StateTree from statestats where Abbr!='DC' order by Population Asc limit 1;";           /* variable $query to hold SQL statement */
            
            $return = mysqli_query($con, $query) or die(mysqli_error($con));

            while ($row = mysqli_fetch_array($return)) {
                echo "<b>State with smallest population: </b><br>";
                echo "" . $row[0] . "<b> | </b>" . $row[1] . "<b> | </b>" . $row[2] . "<b> | </b>" . $row[3] . "<b> | </b>" . $row[4] . "<b> | </b>". $row[5] . "<b> | </b>". $row[6] . "<b> | </b>". $row[7] . "<b> | </b>". $row[8] . "<b> | </b>" . $row[9] . "<b> | </b><br><br>";;        /* query results displayed if $query statement successful, otherwise error message returned from $query */
            }
            
            $query = "SELECT * FROM statestats ORDER BY ABS((Select avg(Population) from statestats) - Population) LIMIT 1;";
            
            $return = mysqli_query($con, $query) or die(mysqli_error($con));

            while ($row = mysqli_fetch_array($return)) {
                echo "<b>State closest to the average population: </b><br>";
                echo "" . $row[0] . "<b> | </b>" . $row[1] . "<b> | </b>" . $row[2] . "<b> | </b>" . $row[3] . "<b> | </b>" . $row[4] . "<b> | </b>". $row[5] . "<b> | </b>". $row[6] . "<b> | </b>". $row[7] . "<b> | </b>". $row[8] . "<b> | </b>" . $row[9] . "<b> | </b><br><br>";;        /* query results displayed if $query statement successful, otherwise error message returned from $query */
            }
        }
        
        
        function getLandSqMiles($con, $tbl) {
            echo "<hr><br><h2>Total Land Square Miles Stats</h2><hr>";       /* display heading */

            $query = "Select Abbr, Name, Capital, Population, TotalSqMiles, LandSqMiles, DateOfStatehood, StateFlower, StateBird, StateTree from statestats order by LandSqMiles Desc limit 1;";           /* variable $query to hold SQL statement */
            
            $return = mysqli_query($con, $query) or die(mysqli_error($con));

            while ($row = mysqli_fetch_array($return)) {
                echo "<b>State with largest Land Square Miles: </b><br>";
                echo "Abbr<b> | </b>Name<b> | </b>Capital<b> | </b>Population<b> | </b>TotalSqMiles<b> | </b>LandSqMiles<b> | </b>DateOfStatehood<b> | </b>StateFlower<b> | </b>StateBird<b> | </b>StateTree<b> | </b><br><br>";        /* query results displayed if $query statement successful, otherwise error message returned from $query */
                echo "" . $row[0] . "<b> | </b>" . $row[1] . "<b> | </b>" . $row[2] . "<b> | </b>" . $row[3] . "<b> | </b>" . $row[4] . "<b> | </b>". $row[5] . "<b> | </b>". $row[6] . "<b> | </b>". $row[7] . "<b> | </b>". $row[8] . "<b> | </b>" . $row[9] . "<b> | </b><br><br>";;        /* query results displayed if $query statement successful, otherwise error message returned from $query */
            }
            
            $query = "Select Abbr, Name, Capital, Population, TotalSqMiles, LandSqMiles, DateOfStatehood, StateFlower, StateBird, StateTree from statestats where Abbr!='DC' order by LandSqMiles Asc limit 1;";           /* variable $query to hold SQL statement */
            
            $return = mysqli_query($con, $query) or die(mysqli_error($con));

            while ($row = mysqli_fetch_array($return)) {
                echo "<b>State with smallest Land Square Miles: </b><br>";
                echo "Abbr<b> | </b>Name<b> | </b>Capital<b> | </b>Population<b> | </b>TotalSqMiles<b> | </b>LandSqMiles<b> | </b>DateOfStatehood<b> | </b>StateFlower<b> | </b>StateBird<b> | </b>StateTree<b> | </b><br><br>";        /* query results displayed if $query statement successful, otherwise error message returned from $query */
                echo "" . $row[0] . "<b> | </b>" . $row[1] . "<b> | </b>" . $row[2] . "<b> | </b>" . $row[3] . "<b> | </b>" . $row[4] . "<b> | </b>". $row[5] . "<b> | </b>". $row[6] . "<b> | </b>". $row[7] . "<b> | </b>". $row[8] . "<b> | </b>" . $row[9] . "<b> | </b><br><br>";;        /* query results displayed if $query statement successful, otherwise error message returned from $query */
            }
            
            $query = "SELECT * FROM statestats ORDER BY ABS((Select avg(LandSqMiles) from statestats) - LandSqMiles) LIMIT 1;";
            
            $return = mysqli_query($con, $query) or die(mysqli_error($con));

            while ($row = mysqli_fetch_array($return)) {
                echo "<b>State closest to the average Land Square Miles: </b><br>";
                echo "Abbr<b> | </b>Name<b> | </b>Capital<b> | </b>Population<b> | </b>TotalSqMiles<b> | </b>LandSqMiles<b> | </b>DateOfStatehood<b> | </b>StateFlower<b> | </b>StateBird<b> | </b>StateTree<b> | </b><br><br>";        /* query results displayed if $query statement successful, otherwise error message returned from $query */
                echo "" . $row[0] . "<b> | </b>" . $row[1] . "<b> | </b>" . $row[2] . "<b> | </b>" . $row[3] . "<b> | </b>" . $row[4] . "<b> | </b>". $row[5] . "<b> | </b>". $row[6] . "<b> | </b>". $row[7] . "<b> | </b>". $row[8] . "<b> | </b>" . $row[9] . "<b> | </b><br><br>";;        /* query results displayed if $query statement successful, otherwise error message returned from $query */
            }
        }
        
        
        function getWaterSqMiles($con, $tbl) {
            echo "<hr><br><h2>Water Square Miles Stats</h2><hr>";       /* display heading */

            $query = "Select Abbr, Name, Capital, Population, TotalSqMiles, LandSqMiles, (TotalSqMiles-LandSqMiles) as WaterSqMiles, DateOfStatehood, StateFlower, StateBird, StateTree from statestats order by (TotalSqMiles-LandSqMiles) Desc limit 1;";           /* variable $query to hold SQL statement */
            
            $return = mysqli_query($con, $query) or die(mysqli_error($con));

            while ($row = mysqli_fetch_array($return)) {
                echo "<b>State with largest Water Square Miles: </b><br>";
                echo "Abbr<b> | </b>Name<b> | </b>Capital<b> | </b>Population<b> | </b>TotalSqMiles<b> | </b>LandSqMiles<b> | </b>WaterSqMiles<b> | </b>DateOfStatehood<b> | </b>StateFlower<b> | </b>StateBird<b> | </b>StateTree<b> | </b><br><br>";        /* query results displayed if $query statement successful, otherwise error message returned from $query */
                echo "" . $row[0] . "<b> | </b>" . $row[1] . "<b> | </b>" . $row[2] . "<b> | </b>" . $row[3] . "<b> | </b>" . $row[4] . "<b> | </b>". $row[5] . "<b> | </b>". $row[6] . "<b> | </b>". $row[7] . "<b> | </b>". $row[8] . "<b> | </b>" . $row[9] . "<b> | </b><br><br>";;        /* query results displayed if $query statement successful, otherwise error message returned from $query */
            }
            
            $query = "Select Abbr, Name, Capital, Population, TotalSqMiles, LandSqMiles, (TotalSqMiles-LandSqMiles) as WaterSqMiles, DateOfStatehood, StateFlower, StateBird, StateTree from statestats where Abbr!='DC' order by (TotalSqMiles-LandSqMiles) Asc limit 1;";           /* variable $query to hold SQL statement */
            
            $return = mysqli_query($con, $query) or die(mysqli_error($con));

            while ($row = mysqli_fetch_array($return)) {
                echo "<b>State with smallest Water Square Miles: </b><br>";
                echo "Abbr<b> | </b>Name<b> | </b>Capital<b> | </b>Population<b> | </b>TotalSqMiles<b> | </b>LandSqMiles<b> | </b>WaterSqMiles<b> | </b>DateOfStatehood<b> | </b>StateFlower<b> | </b>StateBird<b> | </b>StateTree<b> | </b><br><br>";
                echo "" . $row[0] . "<b> | </b>" . $row[1] . "<b> | </b>" . $row[2] . "<b> | </b>" . $row[3] . "<b> | </b>" . $row[4] . "<b> | </b>". $row[5] . "<b> | </b>". $row[6] . "<b> | </b>". $row[7] . "<b> | </b>". $row[8] . "<b> | </b>" . $row[9] . "<b> | </b><br><br>";;        /* query results displayed if $query statement successful, otherwise error message returned from $query */
            }
            
            $query = "SELECT * FROM statestats ORDER BY ABS((Select avg((TotalSqMiles-LandSqMiles)) from statestats) - (TotalSqMiles-LandSqMiles)) LIMIT 1;";
            
            $return = mysqli_query($con, $query) or die(mysqli_error($con));

            while ($row = mysqli_fetch_array($return)) {
                echo "<b>State closest to the average Water Square Miles: </b><br>";
                echo "Abbr<b> | </b>Name<b> | </b>Capital<b> | </b>Population<b> | </b>TotalSqMiles<b> | </b>LandSqMiles<b> | </b>WaterSqMiles<b> | </b>DateOfStatehood<b> | </b>StateFlower<b> | </b>StateBird<b> | </b>StateTree<b> | </b><br><br>";
                echo "" . $row[0] . "<b> | </b>" . $row[1] . "<b> | </b>" . $row[2] . "<b> | </b>" . $row[3] . "<b> | </b>" . $row[4] . "<b> | </b>". $row[5] . "<b> | </b>". $row[6] . "<b> | </b>". $row[7] . "<b> | </b>". $row[8] . "<b> | </b>" . $row[9] . "<b> | </b><br><br>";;        /* query results displayed if $query statement successful, otherwise error message returned from $query */
            }
        }

        function getSums($con, $tbl) {
            echo "<hr><br><h2>Total US Population and Square Miles</h2><hr>";       /* display heading */

            $query = "SELECT Sum(Population) from statestats;";           /* variable $query to hold SQL statement */
            
            $return = mysqli_query($con, $query) or die(mysqli_error($con));

            while ($row = mysqli_fetch_array($return)) {
                echo "<b>Total US Population: </b><br>";
                echo "" . $row[0] . "<b> | </b><br><br>";;        /* query results displayed if $query statement successful, otherwise error message returned from $query */
            }
            
            $query = "SELECT sum(LandSqMiles) from statestats;";           /* variable $query to hold SQL statement */
            
            $return = mysqli_query($con, $query) or die(mysqli_error($con));

            while ($row = mysqli_fetch_array($return)) {
                echo "<b>Total US Land Square Miles: </b><br>";
                echo "" . $row[0] . "<b> | </b><br><br>";;        /* query results displayed if $query statement successful, otherwise error message returned from $query */
            }
            
            $query = "SELECT sum((TotalSqMiles-LandSqMiles)) from statestats;";           /* variable $query to hold SQL statement */
            
            $return = mysqli_query($con, $query) or die(mysqli_error($con));

            while ($row = mysqli_fetch_array($return)) {
                echo "<b>Total US Land Square Miles: </b><br>";
                echo "" . $row[0] . "<b> | </b><br><br>";;        /* query results displayed if $query statement successful, otherwise error message returned from $query */
            }
                       
        }

        function listTableRecords($con3, $tbl) {
            echo "<hr><br><h2>Population per square mile per state: </h2><hr>";       /* display heading */
            
                echo "<b> Abbr | Name | Pop/Mile | Population | TotalSqMiles | LandSqMiles or WaterSqMiles |</b>";           /* display column headings from table */
            

            echo "<br>";
            
            $query2 = "Select Abbr, Name, (Population/LandSqMiles) as PopPerLandMile, Population, TotalSqMiles, LandSqMiles from statestats;";      /* variable $query to hold SQL statement */
            
            $return2 = mysqli_query($con3, $query2) or die(mysqli_error($con3));

            while ($row = mysqli_fetch_array($return2)) { /* display each table row returned from select statement */
                
                echo "" . $row[0] . "<b> | </b>" . $row[1] . "<b> | </b>" . $row[2] . "<b> | </b>" . $row[3] . "<b> | </b>" . $row[4] . "<b> | </b>" . $row[5] . "<b> | </b><br><br>";
            }
            
            echo "<br>";
            
            $query2 = "Select ((Sum(Population))/(sum(LandSqMiles))) as PopPerLandMile from statestats;";      /* variable $query to hold SQL statement */
            
            $return2 = mysqli_query($con3, $query2) or die(mysqli_error($con3));

            while ($row = mysqli_fetch_array($return2)) { /* display each table row returned from select statement */
                echo "<b>Average Population size per land square mile for the entire United States: </b>";
                echo "" . $row[0] . "<b> | </b><br><br>";
            }
            
            echo "<br>";
            
            $query2 = "Select Abbr, Name, (Population/(TotalSqMiles-LandSqMiles)) as PopPerWaterMile, Population, TotalSqMiles, LandSqMiles from statestats;";      /* variable $query to hold SQL statement */
            
            $return2 = mysqli_query($con3, $query2) or die(mysqli_error($con3));

            echo "<b>Average population size per water square mile for each state: </b><br>";
            while ($row = mysqli_fetch_array($return2)) { /* display each table row returned from select statement */
                
                echo "" . $row[0] . "<b> | </b>" . $row[1] . "<b> | </b>" . $row[2] . "<b> | </b>" . $row[3] . "<b> | </b>" . $row[4] . "<b> | </b>" . $row[5] . "<b> | </b><br><br>";
            }
            
            echo "<br>";
            
            $query2 = "Select ((Sum(Population))/(sum((TotalSqMiles-LandSqMiles)))) as PopPerWaterMile from statestats;";      /* variable $query to hold SQL statement */
            
            $return2 = mysqli_query($con3, $query2) or die(mysqli_error($con3));

            while ($row = mysqli_fetch_array($return2)) { /* display each table row returned from select statement */
                echo "<b>Average Population size per water square mile for the entire United States: </b>";
                echo "" . $row[0] . "<b> | </b><br><br>";
            }
        }

        $connection = connect();
        
        useDatabase($connection, $db);
        
        getPopulation($connection, $tbl);
        getLandSqMiles($connection, $tbl);
        getWaterSqMiles($connection, $tbl);
        getSums($connection, $tbl);
        listTableRecords($connection, $tbl);

        mysqli_close($connection);
        
        ?>
    </body>
</html>