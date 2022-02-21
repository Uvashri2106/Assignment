use uvaoffice
create table Employees(ManagerName varchar(255), ManagerId int not null primary key auto_increment, DepartmentName varchar(255), Salary int, HireDate date)
insert into Employees value('Ajith',1,'Front End',85000,'2019-08-08')
insert into Employees(ManagerName,DepartmentName,Salary,HireDate)value('Gopi','Testing',95000,'2017-01-07'),('Keerthika','Quality',75000,'2020-09-06')
select*from Employees
update Employees set HireDate='2019-08-04' where ManagerName='Ajith'
select ManagerName,DepartmentName,Salary,datediff(now(),HireDate)/365>5 as Experience from Employees