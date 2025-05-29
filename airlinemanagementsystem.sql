create database airlinemanagementsystem;
 
use airlinemanagementsystem;
create table login(
  username varchar(20),
 password varchar(20));
 insert into login values('Sagar Chauhan', 'AlphaC');

 

create table passenger (name varchar(20), nationality varchar(20), phone varchar(15), address varchar(50), 
aadhar varchar(20), gender varchar(20));

 

create table flight(f_code varchar(20), f_name varchar(20), source varchar(40), destination varchar(40),Taxes_and_Fees varchar(20));
INSERT INTO flight VALUES("1001", "AI-1212", "Delhi", "Mumbai", "1500");
INSERT INTO flight VALUES("1002", "AI-1453", "Delhi", "Goa", "2000");
INSERT INTO flight VALUES("1003", "AI-1112", "Mumbai", "Chennai", "1800");
INSERT INTO flight VALUES("1004", "AI-3222", "Delhi", "Amritsar", "1300");
INSERT INTO flight VALUES("1005", "AI-1212", "Delhi", "Ayodhya", "1700");
INSERT INTO flight VALUES("1006", "AI-4545", "Bangalore", "Kolkata", "2500");
INSERT INTO flight VALUES("1007", "AI-5467", "Mumbai", "Hyderabad", "1600");
INSERT INTO flight VALUES("1008", "AI-7890", "Kolkata", "Chennai", "2100");
INSERT INTO flight VALUES("1009", "AI-6578", "Delhi", "Lucknow", "1400");
INSERT INTO flight VALUES("1010", "AI-9087", "Goa", "Pune", "2200");
INSERT INTO flight VALUES("1011", "AI-1213", "Delhi", "Jaipur", "1200");
INSERT INTO flight VALUES("1012", "AI-1444", "Mumbai", "Ahmedabad", "1500");
INSERT INTO flight VALUES("1013", "AI-1675", "Chennai", "Delhi", "1800");
INSERT INTO flight VALUES("1014", "AI-2789", "Bangalore", "Mumbai", "2300");
INSERT INTO flight VALUES("1015", "AI-3298", "Hyderabad", "Delhi", "1900");
INSERT INTO flight VALUES("1016", "AI-4321", "Delhi", "Kolkata", "2100");
INSERT INTO flight VALUES("1017", "AI-5432", "Mumbai", "Goa", "1600");
INSERT INTO flight VALUES("1018", "AI-6543", "Chennai", "Bangalore", "2000");
INSERT INTO flight VALUES("1019", "AI-7654", "Delhi", "Pune", "1700");
INSERT INTO flight VALUES("1020", "AI-8765", "Kolkata", "Hyderabad", "2200");



 

create table reservation(PNR varchar(15), TICKET varchar(20), aadhar varchar(20), name varchar(20), nationality varchar(30), flightname varchar(15), flightcode varchar(20), src varchar(30), des varchar(30), ddate varchar(30));

 
create table cancel(pnr varchar(20), name varchar(40), cancelno varchar(20), fcode varchar(20), ddate varchar(30));
SHOW TABLES;
 
Select * from  login;
Select * from  flight;
Select * from reservation;
Select * from   passenger;
select * from cancel;
Select * from   passenger;
 