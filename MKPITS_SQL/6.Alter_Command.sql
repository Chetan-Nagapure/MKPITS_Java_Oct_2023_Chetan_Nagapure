
alter table student ADD (city varchar(50)); /*add new column to the table */
select * from student;

alter table student drop column rollNo; /*delete the particular column from table*/
select * from student;

alter table student modify city varchar(100);/*it modify the particular column from table*/
select * from student;





