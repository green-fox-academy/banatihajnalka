USE movies;

CREATE TABLE IF NOT EXISTS movies (
mID INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(100) NOT NULL,
year INT,
director VARCHAR(100));

INSERT INTO movies (title, year, director)
VALUES 
("Gone with the Wind", 1939, "Victor Fleming"),
("Star Wars", 1977, "George Lucas"),
("The Sound of Music",1965,"Robert Wise");

CREATE TABLE IF NOT EXISTS reviewer (
rID INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100) NOT NULL);
