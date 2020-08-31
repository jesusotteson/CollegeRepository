-- PurpleBoxDVD create script
-- CS3550 
-- Jesus Otteson


--------------------------------------------- Setup Process for the Database ---------------------------------------------

USE master;  -- must make sure that PurpleBox is not the active database
GO

-- Drop the database if it exists
IF EXISTS(SELECT * FROM sys.sysdatabases where name='PurpleBoxDVD')
	DROP DATABASE PurpleBoxDVD;

-- Create the database
CREATE DATABASE [PurpleBoxDVD]
	ON  PRIMARY
( NAME = N'PurpleBoxDVD', FILENAME =
	N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\PurpleBoxDVD.mdf',
	SIZE = 5120KB , FILEGROWTH = 1024KB )
	LOG ON
( NAME = N'PurpleBoxDVD_log', FILENAME =
N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\PurpleBoxDVD_log.ldf',
SIZE = 2048KB , FILEGROWTH = 1024KB);

GO

-- Attaching the correct database
USE PurpleBoxDVD;

--------------------------------------------- Creating the Tables ---------------------------------------------

---------------------------------------------------
-- Drop tables if they exist
-- Tables must be dropped in order
--------------------------------------------------
IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbUser'
) DROP TABLE pbUser;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbMovieRental'
) DROP TABLE pbMovieRental;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbMovieItem'
) DROP TABLE pbMovieItem;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbUserQuestions'
) DROP TABLE pbUserQuestion;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbMovieReservation'
) DROP TABLE pbMovieReservation;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbMovie'
) DROP TABLE pbMovie;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbQuestion'
) DROP TABLE pbQuestion;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbMovieActor'
) DROP TABLE pbMovieActor;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbMovieDirector'
) DROP TABLE pbMovieDirector;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbMovieGenre'
) DROP TABLE pbMovieGenre;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbMovieKeyword'
) DROP TABLE pbMovieKeyword;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbActor'
) DROP TABLE pbActor;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbKeyword'
) DROP TABLE pbKeyword;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbDirector'
) DROP TABLE pbDirector;

IF EXISTS (
  SELECT * FROM sys.tables WHERE name = N'pbGenre'
) DROP TABLE pbGenre;

---------------------------------------------------
-- Create Tables
---------------------------------------------------
CREATE TABLE pbUser (
	pbUser_id int IDENTITY(1,1) NOT NULL,
	UserID nvarchar(9) NOT NULL,
	userFirstName NVarchar (25) NOT NULL,
	userLastName NVarchar (50) NOT NULL,
	userPassword NVarchar (255) NOT NULL,
	userPhoneNumber NVarchar (10) NOT NULL,
	userPhoneNumber2 NVarchar (10),
	userType NVarchar (1) NOT NULL,
	customerType NVarchar (1) NOT NULL,
	banStatus NVarchar (1) NOT NULL,
	fees money,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbMovieRental (
	pbUser_id int NOT NULL,
	pbMovieItem_id int NOT NULL,
	rentalDate dateTime NOT NULL,
	returnDate dateTime,
	dueDate dateTime NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbMovieItem (
	pbMovieItem_id int IDENTITY(1,1) NOT NULL,
	pbMovie_id int NOT NULL,
	copyNumber int NOT NULL,
	movieType NVarchar(1) NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbUserQuestion (
	pbUser_id int NOT NULL,
	pbQuestion_id int NOT NULL,
	Answer NVarchar(255) NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbMovieReservation (
	pbMovie_id int NOT NULL,
	pbUser_id int NOT NULL,
	reservationDate dateTime NOT NULL,
	movieType NVarchar(1) NOT NULL,
	reservationStatus NVarchar(1) NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbMovie (
	pbMovie_id int IDENTITY(1,1) NOT NULL,
	movieID NVarchar(15)  NOT NULL,
	movieTitle NVarchar(255) NOT NULL,
	lastUpdatedBy NVarchar(25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbQuestion (
	pbQuestion_id int IDENTITY(1,1) NOT NULL,
	Question NVarchar(255) NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbMovieActor (
	pbMovie_id int NOT NULL,
	pbActor_id int NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbMovieDirector (
	pbMovie_id int NOT NULL,
	pbDirector_id int NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbMovieGenre (
	pbMovie_id int NOT NULL,
	pbGenre_id int NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbMovieKeyword (
	pbMovie_id int NOT NULL,
	pbKeyword_id int NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbActor (
	pbActor_id int IDENTITY(1,1) NOT NULL,
	actorFirstName NVarchar(25) NOT NULL,
	actorLastName NVarchar(50) NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbKeyword (
	pbKeyword_id int IDENTITY(1,1) NOT NULL,
	Keyword NVarchar(25) NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbDirector (
	pbDirector_id int IDENTITY(1,1) NOT NULL,
	directorFirstName NVarchar(25) NOT NULL,
	directorLastName NVarchar(50) NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);

CREATE TABLE pbGenre (
	pbGenre_id int IDENTITY(1,1) NOT NULL,
	genre NVarchar(25) NOT NULL,
	genreDescription NVarchar(255) NOT NULL,
	lastUpdatedBy NVarchar (25) NOT NULL,
	lastUpdatedDate dateTime
);
--------------------------------------------- SET Primary, Foreign and Alternate Keys ---------------------------------------------

-- Primary key Constraints
---------------------------------------------------
ALTER TABLE pbUser
	ADD CONSTRAINT PK_pbUser PRIMARY KEY CLUSTERED (pbUser_id);

ALTER TABLE pbMovieRental
	ADD CONSTRAINT PK_pbMovieRental PRIMARY KEY CLUSTERED (pbUser_id, pbMovieItem_id, rentalDate);

ALTER TABLE pbMovieItem
	ADD CONSTRAINT PK_pbMovieItem PRIMARY KEY CLUSTERED (pbMovieItem_id);

ALTER TABLE pbUserQuestion
	ADD CONSTRAINT PK_pbUserQuestion PRIMARY KEY CLUSTERED (pbUser_id, pbQuestion_id);

ALTER TABLE pbMovieReservation
	ADD CONSTRAINT PK_pbMovieReservation PRIMARY KEY CLUSTERED (pbMovie_id, pbUser_id, reservationDate, movieType);

ALTER TABLE pbMovie
	ADD CONSTRAINT PK_pbMovie PRIMARY KEY CLUSTERED (pbMovie_id);

ALTER TABLE pbQuestion
	ADD CONSTRAINT PK_pbQuestion PRIMARY KEY CLUSTERED (pbQuestion_id);

ALTER TABLE pbMovieActor
	ADD CONSTRAINT PK_pbMovieActor PRIMARY KEY CLUSTERED (pbActor_id, pbMovie_id);

ALTER TABLE pbMovieDirector
	ADD CONSTRAINT PK_pbMovieDirector PRIMARY KEY CLUSTERED (pbMovie_id, pbDirector_id);

ALTER TABLE pbMovieGenre
	ADD CONSTRAINT PK_pbMovieGenre PRIMARY KEY CLUSTERED (pbMovie_id, pbGenre_id);

ALTER TABLE pbMovieKeyword
	ADD CONSTRAINT PK_pbMovieKeyword PRIMARY KEY CLUSTERED (pbKeyword_id, pbMovie_id);

ALTER TABLE pbActor
	ADD CONSTRAINT PK_pbActor PRIMARY KEY CLUSTERED (pbActor_id);

ALTER TABLE pbKeyword
	ADD CONSTRAINT PK_pbKeyword PRIMARY KEY CLUSTERED (pbKeyword_id);

ALTER TABLE pbDirector
	ADD CONSTRAINT PK_pbDirector PRIMARY KEY CLUSTERED(pbDirector_id);

ALTER TABLE pbGenre
	ADD CONSTRAINT PK_pbGenre PRIMARY KEY CLUSTERED(pbGenre_id);

-- Foreign Key Constraint
---------------------------------------------------
ALTER TABLE pbMovieRental
	ADD CONSTRAINT FK_pbMovieRental_pbUserID 
	FOREIGN KEY (pbUser_id) REFERENCES pbUser(pbUser_id);

ALTER TABLE pbMovieRental
	ADD CONSTRAINT FK_pbMovieRental_pbMovieItemID 
	FOREIGN KEY (pbMovieItem_id) REFERENCES pbMovieItem(pbMovieItem_id);

ALTER TABLE pbMovieItem
	ADD CONSTRAINT FK_pbMovieItem_pbMovieID 
	FOREIGN KEY (pbMovie_id) REFERENCES pbMovie(pbMovie_id);

ALTER TABLE pbUserQuestion
	ADD CONSTRAINT FK_pbUserQuestion_pbUserID
	FOREIGN KEY (pbUser_id) REFERENCES pbUser(pbUser_id);

ALTER TABLE pbUserQuestion
	ADD CONSTRAINT FK_pbUserQuestion_pbQuestionID
	FOREIGN KEY (pbQuestion_id) REFERENCES pbQuestion(pbQuestion_id);

ALTER TABLE pbMovieReservation
	ADD CONSTRAINT FK_pbMovieReservation_pbMovieID
	FOREIGN KEY (pbMovie_id) REFERENCES pbMovie(pbMovie_id);

ALTER TABLE pbMovieReservation
	ADD CONSTRAINT FK_pbMovieReservation_pbUserID
	FOREIGN KEY (pbUser_id) REFERENCES pbUser(pbUser_id);

ALTER TABLE pbMovieActor
	ADD CONSTRAINT FK_pbMovieActor_pbMovieID
	FOREIGN KEY (pbMovie_id) REFERENCES pbMovie(pbMovie_id);

ALTER TABLE pbMovieActor
	ADD CONSTRAINT FK_pbMovieActor_pbActorID
	FOREIGN KEY (pbActor_id) REFERENCES pbActor(pbActor_id);

ALTER TABLE pbMovieDirector
	ADD CONSTRAINT FK_pbMovieDirector_pbMovieID
	FOREIGN KEY (pbMovie_id) REFERENCES pbMovie(pbMovie_id);

ALTER TABLE pbMovieDirector
	ADD CONSTRAINT FK_pbMovieDirector_pbDirectorID
	FOREIGN KEY (pbDirector_id) REFERENCES pbDirector(pbDirector_id);

ALTER TABLE pbMovieGenre
	ADD CONSTRAINT FK_pbMovieGenre_pbMovieID
	FOREIGN KEY (pbMovie_id) REFERENCES pbMovie(pbMovie_id);

ALTER TABLE pbMovieGenre
	ADD CONSTRAINT FK_pbMovieGenre_pbGenreID
	FOREIGN KEY (pbGenre_id) REFERENCES pbGenre(pbGenre_id);

ALTER TABLE pbMovieKeyword
	ADD CONSTRAINT FK_pbMovieKeyword_pbKeywordID
	FOREIGN KEY (pbKeyword_id) REFERENCES pbKeyword(pbKeyword_id);

ALTER TABLE pbMovieKeyword
	ADD CONSTRAINT FK_pbMovieKeyword_pbMovieID
	FOREIGN KEY (pbMovie_id) REFERENCES pbMovie(pbMovie_id);

-- Alternate key Constraint
---------------------------------------------------
ALTER TABLE pbUser
	ADD CONSTRAINT AK_pbUser_UserID UNIQUE(UserID);

ALTER TABLE pbMovieItem
	ADD CONSTRAINT AK_pbMovieItem_pbMovie_id UNIQUE(pbMovie_id);

ALTER TABLE pbMovieItem
	ADD CONSTRAINT AK_pbMovieItem_copyNumber UNIQUE(copyNumber);

ALTER TABLE pbMovieItem
	ADD CONSTRAINT AK_pbMovieItem_movieType UNIQUE(movieType);

ALTER TABLE pbMovie
	ADD CONSTRAINT AK_pbMovie_movieID UNIQUE(movieID);

ALTER TABLE pbQuestion
	ADD CONSTRAINT AK_pbQuestion_Question UNIQUE (Question);

ALTER TABLE pbActor
	ADD CONSTRAINT AK_pbActor_actorFirstName UNIQUE (actorFirstName);

ALTER TABLE pbActor
	ADD CONSTRAINT AK_pbActor_actorLastName UNIQUE (actorLastName);

ALTER TABLE pbKeyword
	ADD CONSTRAINT AK_pbKeyword_Keyword UNIQUE (Keyword);

ALTER TABLE pbDirector
	ADD CONSTRAINT AK_pbDirector_directorFirstName UNIQUE (directorFirstName);

ALTER TABLE pbDirector
	ADD CONSTRAINT AK_pbDirector_directorLastName UNIQUE (directorLastName);

ALTER TABLE pbGenre
	ADD CONSTRAINT AK_pbGenre_genre UNIQUE (genre);