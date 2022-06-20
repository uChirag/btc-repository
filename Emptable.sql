create database btc_db3;
use btc_db3;
create table EmployeeDetails(EmpNo numeric(4), Ename varchar(30), Job varchar(50), HireDate date, MGR numeric(4), Salary numeric(6,2), Comm numeric (6), DeptNo numeric(2) );
desc EmployeeDetails;

insert into EmployeeDetails values(7369, 'Smith', 'Clerk', '1980-12-17', 7902, 800, 0, 20);
insert into EmployeeDetails values(7499, 'Allen', 'Salesman', '1981-02-20', 7698, 1600, 300, 30);
insert into EmployeeDetails values(7521, 'Ward', 'Salesman', '1981-02-22', 7698, 1250, 500, 30);
insert into EmployeeDetails values(7566, 'Jones', 'Manager', '1981-04-02', 7839, 2975, 0, 20);
insert into EmployeeDetails values(7654, 'Martin', 'Salesman', '1981-09-28', 7698, 1250, 1400, 30);
insert into EmployeeDetails values(7698, 'Blake', 'Manager', '1981-05-01', 7839, 2850, 0, 30);
insert into EmployeeDetails values(7782, 'Clark', 'Manager', '1981-06-09', 7839, 2450, 0, 10);
insert into EmployeeDetails values(7788, 'Scott', 'Analyst', '1987-04-19', 7566, 3000, 0, 20);
insert into EmployeeDetails values(7839, 'King', 'President', '1981-11-17', 0, 5000, 0, 10);
insert into EmployeeDetails values(7844, 'Turner', 'Salesman', '1981-09-08', 7698, 1500, 0, 30);
insert into EmployeeDetails values(7876, 'Adams', 'Clerk', '1987-05-23', 7788, 1100, 0, 20);
insert into EmployeeDetails values(7900, 'James', 'Clerk', '1981-12-03', 7698, 950, 0, 30);
insert into EmployeeDetails values(7902, 'Ford', 'Analyst', '1981-12-03', 7566, 3000, 0, 20);
insert into EmployeeDetails values(7934, 'Miller', 'Clerk', '1982-01-23', 7782, 1300, 0, 10);

select * from EmployeeDetails;
