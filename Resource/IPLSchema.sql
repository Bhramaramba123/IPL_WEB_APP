#######################################################################
#Create DATABASE
#######################################################################
CREATE DATABASE IF NOT EXISTS ipldb;






#######################################################################
#Create Tables
#######################################################################
CREATE TABLE IF NOT EXISTS IPLDB.players(
id int(10) unsigned NOT NULL AUTO_INCREMENT,
firstName varchar(50) NOT NULL,
secondName varchar(50) NOT NULL,
Age int(10) NOT NULL,
gender varchar(50) NOT NULL,
place varchar(50) NOT NULL,
primaryRole varchar(50) NOT NULL,
isCaptain boolean NOT NULL,
isWicketKeeper boolean NOT NULL,
franchasie varchar(50) NOT NULL,
PRIMARY KEY (id)
);




CREATE TABLE IF NOT EXISTS members(
id int(10) unsigned NOT NULL AUTO_INCREMENT,
fname varchar(50) NOT NULL,
lname varchar(50) NOT NULL,
age int(10) NOT NULL,
place varchar(50) NOT NULL,
gender varchar(50) NOT NULL,
role varchar(50) NOT NULL,
franchasie varchar(50) NOT NULL,
PRIMARY KEY (id)
);



CREATE TABLE IF NOT EXISTS teams(
id int(10) unsigned NOT NULL AUTO_INCREMENT,
totalSix int(10) NOT NULL,
netRunRate float(50) NOT NULL,
isKnockOut boolean NOT NULL,
franchasie varchar(50) NOT NULL,
PRIMARY KEY (id)
);