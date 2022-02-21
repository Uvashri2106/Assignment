use college_management
create table course_details(StudentName varchar(255),StudentId int not null primary key,CourseName varchar(255),City varchar(255))
insert into course_details values('Aashika',101,'Java','Coimbatore'),('Kalaivani',102,'Python','Hyderabad'),
('Usha',103,'.net','Chennai'),('Latha',104,'CCNA','Banglore')
Select *from course_details
delete from course_details where StudentId=011

