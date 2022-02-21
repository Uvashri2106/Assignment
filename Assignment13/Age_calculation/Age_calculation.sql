create database uva
use uva
create table FindAge(StudentName varchar(255),StudentId int primary key auto_increment,BirthDate date not null)
insert into FindAge values('Sweetly',111,'1997.07.20')
insert into FindAge(StudentName, BirthDate) values('Nandhini','1999.09.07'),('Deepika','1998.06.25')
select *from FindAge
select curdate()
select *,year(curdate())-year(BirthDate)as Age From FindAge