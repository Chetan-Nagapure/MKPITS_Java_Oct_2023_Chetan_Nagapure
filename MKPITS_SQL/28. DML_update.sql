-- DML - Data Manipulation Language
-- The SQL command deals with the manipulation of data present in the database belongs to DML OR data manipulation language.
-- it includes some statements -
-- Insert - basicaly use to insert the data(in the form of rows) in the table.
-- Delete - it is used to delete record(not structure) from the table.
-- Update - it is used to update existing data within a table.
-- Lock - table control concurrency.

-- Insert query
create table employee(id int unique primary key auto_increment, name varchar(250) null, profile varchar(250), salary int not null);
insert into employee values(1, "sunil","web devwloper",25000),
 (2,"anil","front-end developer",30000),
 (3,"rajat","backend devel;oper",35000),
 (4,"sachin","core java dveloper",80000);
 select * from employee;

-- Update Query
update employee set salary=60000 where id=2;