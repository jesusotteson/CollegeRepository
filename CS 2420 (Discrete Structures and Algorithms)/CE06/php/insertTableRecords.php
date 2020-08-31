<?php
/*
 * insertTableRecords.php - used to insert records into table using an array
 */

/*
 * Table: Monsters
Columns:
idMonsters int(11) AI PK 
MonsterName varchar(80) 
MonsterAC int(11) 
HitDice int(11) 
MonsterAttack int(11) 
MonsterDamage varchar(45) 
MonsterMove int(11) 
MonsterTreasure varchar(45) 
MonsterXP int(11) 
Active varchar(1)
 */
//require_once 'DataBaseConnection.php';

foreach ($newMob as $insertArray) {
    $insert = "INSERT INTO $db.$tbl (`MonsterName`, `MonsterAC`, `HitDice`, `MonsterAttack`, `MonsterDamage`, "
            . "`MonsterMove`, `MonsterTreasure`, `MonsterXP`, `Active`) VALUES ('$insertArray[0]', $insertArray[1], $insertArray[2],"
            . " $insertArray[3], '$insertArray[4]', $insertArray[5],'$insertArray[6]',$insertArray[7],'Y')";
    $success = $con->query($insert);
    if ($success == FALSE) {
        $failmess = "Whole query " . $insert . "<br>";
        echo $failmess;
        die('Invalid query: ' . mysqli_error($con));
    } else {
        echo "$insertArray[0] was added<br>";
    }
}

?>