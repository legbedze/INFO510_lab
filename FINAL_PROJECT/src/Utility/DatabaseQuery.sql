show databases;
Use medicaldb
Select *
From patient;

drop table patient;

create table patient(
id int primary key auto_increment,
firstname varchar(50),
lastname varchar(50),
age numeric,
phonenumber varchar(20),
emailAddress varchar(50),
gender varchar(20),
patientType varchar(20),
comment varchar(200),
dateOfBirth varchar(50))

