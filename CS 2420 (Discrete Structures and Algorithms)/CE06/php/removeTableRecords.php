<?php
/*
 * removeTableRecords.php - removes selected records from the table by marking the records as inactive
 */

$query = "SELECT COUNT(*) FROM $tbl;";           /* variable $query to hold SQL statement */

include 'queryResult.php';          /* include file to process $query statement */
$count = 0;
while ($row = mysqli_fetch_array($return)) {
    $count = $row[0];        /* query results displayed if $query statement successful, otherwise error message returned from $query */
}

echo "<br><h2>Now removing</h2><br><hr>";
for ($i = 0; $i < $count; $i+=2) {
    $update = "UPDATE $db.$tbl SET `Active`='N' "
            . "WHERE `MonsterName`='" . $newMob[$i][0] . "'";
    $success = $con->query($update);
    if ($success == FALSE) {
        $failmess = "Whole query " . $update . "<br>";
        echo $failmess;
        die('Invalid query: ' . mysqli_error($con));
    } else {
        echo $newMob[$i][0]." was removed<br>";
    }
}
echo "<br>This is who is left<hr>";
$search = "SELECT * FROM $db.$tbl where Active = 'Y' Order by $ord";

$return = $con->query($search);

if (!$return) {
    $message = "Whole query " . $search;
    echo $message;
    die('Invalid query: ' . mysqli_error($con));
}
echo "<table><th>Name</th><th>AC</th><th>Hit Dice</th><th>XP</th>";
while ($row = $return->fetch_assoc()) {
    echo "<tr><td>Name: " . $row['MonsterName'] 
            . "</td><td> AC: " . $row['MonsterAC'] 
            . "</td><td> HD:". $row['HitDice']
            ." </td><td> XP:".$row['MonsterXP']."</td></tr>";
}
echo "</table>";
//mysqli_close($con);
?>