drop table statestats;
CREATE TABLE `statestats` (
  `Abbr` char(2) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Capital` varchar(25) NOT NULL,
  `Population` int(11) NOT NULL,
  `TotalSqMiles` int(11) NOT NULL,
  `LandSqMiles` int(11) NOT NULL,
  `DateOfStatehood` date NOT NULL,
  `StateFlower` varchar(30) DEFAULT NULL,
  `StateBird` varchar(30) DEFAULT NULL,
  `StateTree` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Abbr`),
  UNIQUE KEY `Abbr_UNIQUE` (`Abbr`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='State statistics';
