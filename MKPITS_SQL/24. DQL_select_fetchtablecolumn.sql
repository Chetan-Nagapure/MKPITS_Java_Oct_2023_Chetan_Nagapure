-- DQL - Data Query Lnguage
-- DQL statement is used to perform queries on data.
-- basicaly use to fetch the data from database.
-- SELECT is the command which allows getting the data out of the database to perform operations with it. 
-- which can fetch the table of database and each attribute(eg. column of the table).
use customer;
-- fetching tables from database by select command.
select * from customer_data;
select * from student_data;
-- now fetching indivisual column of table.
select name from student_data;
select age from student_data;