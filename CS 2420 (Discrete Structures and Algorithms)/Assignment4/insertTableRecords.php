<?php
/*
 * insertTableRecords.php - used to insert records into table using an array
 */
$newAuth = array(
    array('AL','Alabama','Montgomery',4858979,52419,50744,'1819-12-14','Camellia','Yellowhammer','Southern Pine'),
    array('AK','Alaska','Juneau',738432,663267,571951,'1959-01-03','Forget-me-not','Willow Ptarmigan','Sitka Spruce'),
    array('AZ','Arizona','Phoenix',6828065,113998,113635,'1912-02-14','Saguaro cactus blossom','Cactus Wren','Paloverde'),
    array('AR','Arkansas','Little Rock',2978204,53179,52068,'1836-06-15','Apple blossom','Mockingbird','Pine'),
    array('CA','California','Sacramento',39144818,163696,155959,'1850-09-09','California poppy','California Valley Quail','California Redwood'),
    array('CO','Colorado','Denver',5456574,104094,103718,'1876-08-01','Rocky Mountain columbine','Lark Bunting','Blue Spruce'),
    array('CT','Connecticut','Hartford',3590886,5543,4845,'1788-01-09','Mountain laurel','Robin','White Oak'),
    array('DE','Delaware','Dover',945934,2489,1954,'1787-12-07','Peach blossom','Blue Hen Chicken','American Holly'),
    array('FL','Florida','Tallahassee',20271272,65755,53927,'1845-03-03','Orange blossom','Mockingbird','Cabbage Palmetto'),
    array('GA','Georgia','Atlanta',10214860,59425,57906,'1788-01-02','Cherokee rose','Brown Thrasher','Live Oak'),
    array('HI','Hawaii','Honolulu',1431603,10931,6423,'1959-08-21','Hawaiian hibiscus','Nene','Kukui'),
    array('ID','Idaho','Boise',1654930,83570,82747,'1890-07-03','Syringa, mock orange','Mountain Bluebird','Western White Pine'),
    array('IL','Illinois','Springfield',12859995,57914,55584,'1818-12-03','Violet','Cardinal','White Oak'),
    array('IN','Indiana','Indianapolis',6619680,36418,35867,'1816-12-11','Peony','Cardinal','Yellow Poplar'),
    array('IA','Iowa','Des Moines',3123899,56272,55869,'1846-12-28','Wild prairie rose','Eastern Goldfinch','Oak'),
    array('KS','Kansas','Topeka',2911641,82277,81815,'1861-01-29','Sunflower','Western Meadowlark','Cottonwood'),
    array('KY','Kentucky','Frankfort',4425092,40409,39728,'1792-06-01','Goldenrod','Cardinal','Yellow Poplar'),
    array('LA','Louisiana','Baton Rouge',4670724,51840,43562,'1812-04-30','Magnolia','Eastern Brown Pelican','Baldcypress'),
    array('ME','Maine','Augusta',1329328,35385,30862,'1820-03-15','White pine cone and tassel','Chickadee','Eastern White Pine'),
    array('MD','Maryland','Annapolis',6006401,12407,9774,'1788-04-28','Black-eyed susan','Baltimore Oriole','White Oak'),
    array('MA','Massachussets','Boston',6794422,10555,7840,'1788-02-06','Mayflower','Chickadee','American Elm'),
    array('MI','Michigan','Lansing',9922576,96716,56804,'1837-01-26','Apple blossom','Robin','Eastern White Pine'),
    array('MN','Minnesota','St. Paul',5489594,86939,79610,'1858-05-11',"Pink and white lady''s slipper",'Common Loon','Red Pine'),
    array('MS','Mississippi','Jackson',2992333,48430,46907,'1817-12-10','Magnolia','Mockingbird','Southern Magnolia'),
    array('MO','Missouri','Jefferson City',6083672,69704,68886,'1821-08-10','Hawthorn','Bluebird','Flowering Dogwood'),
    array('MT','Montana','Helena',1032949,147042,145552,'1889-11-08','Bitterroot','Western Meadowlark','Ponderosa Pine'),
    array('NE','Nebraska','Lincoln',1896190,77354,76872,'1867-03-01','Goldenrod','Western Meadowlark','Cottonwood'),
    array('NV','Nevada','Carson City',2890845,110561,109826,'1864-10-31','Sagebrush','Mountain Bluebird','Bristlecone Pine'),
    array('NH','New Hampshire','Concord',1330608,9350,8968,'1788-06-21','Purple lilac','Purple Finch','Paper Birch'),
    array('NJ','New Jersey','Trenton',8958013,8721,7417,'1787-12-18','Purple violet','Eastern Goldfinch','Northern Red Oak'),
    array('NM','New Mexico','Santa Fe',2085109,121589,121356,'1912-01-06','Yucca flower','Roadrunner','Pinyon'),
    array('NY','New York','Albany',19795791,54556,47214,'1788-07-26','Rose','Bluebird','Sugar Maple'),
    array('NC','North Carolina','Raleigh',10042802,53819,48711,'1789-11-21','Flowering dogwood','Cardinal','Pine'),
    array('ND','North Dakota','Bismarck',756927,70700,68976,'1889-11-02','Wild prairie rose','Western Meadowlark','American Elm'),
    array('OH','Ohio','Columbus',11613423,44825	,40948,'1803-03-01','Scarlet carnation','Cardinal','Ohio Buckeye'),
    array('OK','Oklahoma','Oklahoma City',3911338,69898,68667,'1907-11-16','Mistletoe','Scissor-tailed Flycatcher','Eastern Redbud'),
    array('OR','Oregon','Salem',4028977,98381,95997,'1859-02-14','Oregon grape','Western Meadowlark','Douglas fir'),
    array('PA','Pennsylvania','Harrisburg',12802503,46055,44817,'1787-12-12','Mountain laurel','Ruffed Grouse','Eastern Hemlock'),
    array('RI','Rhode Island','Providence',1056298,1545,1045,'1790-05-29','Violet','Rhode Island Red','Red Maple'),
    array('SC','South Carolina','Colombia',4896146,32020,30110,'1788-05-23','Yellow jessamine','Great Carolina Wren','Cabbage Palmetto'),
    array('SD','South Dakota','Pierre',858469,77117,75885,'1889-11-02','Pasque flower','Ring-necked Pheasant','White Spruce'),
    array('TN','Tennessee','Nashville',6600299,42143,41217,'1796-06-01','Purple iris','Mockingbird','Yellow Poplar'),
    array('TX','Texas','Austin',27469114,268581,261797,'1845-12-29','Texas Blue Bonnet','Mockingbird','Pecan'),
    array('UT','Utah','Salt Lake City',2995919,84899,82144,'1896-01-04','Sego lily','American Seagull','Blue Spruce'),
    array('VT','Vermont','Montpelier',626042,9614,9250,'1791-03-04','Red clover','Hermit Thrush','Sugar Maple'),
    array('VA','Virginia','Richmond',8382993,42774,39594,'1788-06-25','American dogwood','Cardinal','Flowering Dogwood'),
    array('WA','Washington','Olympia',7170351,71300,66544,'1889-11-11','Coast rhododendron','Willow Goldfinch','Western Hemlock'),
    array('WV','West Virginia','Charleston',1844128,24230,24078,'1863-06-20','Rhododendron','Cardinal','Sugar Maple'),
    array('WI','Wisconsin','Madison',5771337,65498,54310,'1848-05-29','Wood violet','Robin','Sugar Maple'),
    array('WY','Wyoming','Cheyenne',586107,97814,97100,'1890-07-10','Indian paintbrush','Western Meadowlark','Cottonwood'),
    array('DC','District of Columbia','Washington',672228,68,61,'1791-09-09','American Beauty rose','Wood thrush','Scarlet oak'),
);
//print_r($newAuth);        /* this statement prints the contents of the array variable $newAuth */

echo "<hr><br><h2>Records inserted</h2><hr>";       /* display heading */

foreach ($newAuth as $insertArray) {        /* for loop used to insert each row of array data into table */

    $query = "INSERT INTO $tbl (`Abbr`, `Name`, `Capital`, `Population`, `TotalSqMiles`, `LandSqMiles`, `DateOfStatehood`, "
            . "`StateFlower`,`StateBird`,`StateTree`) VALUES ('$insertArray[0]', '$insertArray[1]', '$insertArray[2]', '$insertArray[3]',"
            . " '$insertArray[4]', '$insertArray[5]', '$insertArray[6]', '$insertArray[7]', '$insertArray[8]', '$insertArray[9]');";         /* variable $query to hold SQL statement */
    
    include 'queryResult.php';          /* include file to process $query statement */

    echo "$insertArray[1] was added<br>";       /* display each record added to table */
    
}
?>