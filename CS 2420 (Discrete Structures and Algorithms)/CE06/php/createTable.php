<?php
/*
 * createTable.php - used to create table and define column names and data types
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
$query = "CREATE TABLE if not exists $db.$tbl ("
  ."idMonsters INT(11) NOT NULL AUTO_INCREMENT,"
  ."MonsterName VARCHAR(80) NULL,"
  ."MonsterAC INT(11) NULL,"
  ."HitDice INT(11) NULL,"
  ."MonsterAttack INT(11) NULL,"
  ."MonsterDamage VARCHAR(45) NULL,"
  ."MonsterMove INT(11) NULL,"
  ."MonsterTreasure VARCHAR(45) NULL,"
  ."MonsterXP INT(11) NULL,"
  ."Active VARCHAR(1) NULL,"
  ."PRIMARY KEY (idMonsters));";

include 'queryResult.php';           /* include file to process $query statement */

while ($row = mysqli_fetch_array($return)) {
    echo "<b>".$row[0]." | </b>";           /* display column headings from table */
}
echo "<br>";
echo "table $tbl successfully created <br>";         /* message displayed if $query statement successful, otherwise error message returned from $query */
?>