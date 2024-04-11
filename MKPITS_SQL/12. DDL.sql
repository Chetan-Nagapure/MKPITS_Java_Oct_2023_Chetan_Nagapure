use customer;
create table student_info(roll_num int unique primary key auto_increment, name varchar(250) null, address varchar(250) null, age int not null, mobile long default(1234567890));