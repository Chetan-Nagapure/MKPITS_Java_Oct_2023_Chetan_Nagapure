use customer;
alter table student_data
add column email varchar(250);
--  DEFAULT VALUE QUERY
alter table student_data
add column password varchar(250) default 'pass2123';