use college_management
create table college_details(CollegeName varchar(255),CollegeCode int not null primary key,
City varchar(255),Country varchar(255))
describe table college_details;
insert into college_details values('Anna University',1001,'Chennai','India')
insert into college_details values('Sathyabama University',1002,'Delhi','India'),('SRM University',1003,'Banglore','India')
alter table college_details add State varchar(255)
Select *from college_details
update college_details set State='TamilNadu' where CollegeCode=1001
select *from college_details
delete from college_details where CollegeCode=1002
select *from college_details
update college_details set State='Karnataka' where CollegeCode=1003
select *from college_details

