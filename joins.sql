create database Activity;
use Activity;
create table Employees( employee_id int primary key,employee_name varchar(19) not null,department_id int not null);
insert into Employees values(1,'john',1);
insert into Employees values(2,'jane',2);
insert into Employees values(3,'mark',1);
insert into Employees values(4,'emily',3);
insert into Employees values(5,'karen',5);
select * from Employees;
create table Departments(department_id int primary key,department_name varchar(10)); 
insert into Departments(department_id,department_name) values(1,'sales'),
(2,'HR'),(3,'It'),(4,'marketing'),(5,null);
select * from Departments;
create table Projects(project_id int primary key,project_name varchar(10) ,department_id int );
insert into Projects values(101,'project A',1),
(102,'project B',2),(103,'project c',3),(104,'project d',4),(105,'project e',null);
select * from Projects;
-- Retrieve the list of employees along with their department names where employees are associated with departments.
SELECT e.employee_id, e.employee_name, d.department_name
FROM Employees e
JOIN Departments d ON e.department_id = d.department_id;
-- Retrieve all employees and their associated department names. If an employee does not belong to a department, show NULL.

SELECT e.employee_id, e.employee_name, d.department_name
FROM Employees e
LEFT JOIN Departments d ON e.department_id = d.department_id;
-- Retrieve all departments and the names of employees in those departments. If a department does not have any employees, show NULL.

SELECT d.department_id, d.department_name, e.employee_name
FROM Departments d
LEFT JOIN Employees e ON d.department_id = e.department_id;
-- Retrieve all possible combinations of employees and projects.
SELECT e.employee_id, e.employee_name, p.Project_id, p.Project_name
FROM Employees e
CROSS JOIN Projects p;
-- Retrieve the list of employees whose department ID is greater than the department ID of 'HR' department.
WITH HR_Department AS (
    SELECT department_id
    FROM Departments
    WHERE department_name = 'HR'
)
SELECT e.employee_id, e.employee_name
FROM Employees e, HR_department hr
WHERE e.department_id > hr.department_id;
-- Retrieve the list of projects along with their department names, where the projects are associated with departments
SELECT p.Project_id, p.Project_name, d.department_name
FROM Projects p
JOIN Departments d ON p.department_id = d.department_id;
-- Find employees who are not assigned to any department
SELECT e.employee_id, e.employee_name
FROM Employees e
WHERE e.department_id IS NULL;
-- Find departments that have no employees

SELECT d.department_id, d.department_name
FROM Departments d
LEFT JOIN Employees e ON d.department_id = e.department_id
WHERE e.employee_id IS NULL;
-- Find all departments along with the number of employees in each department
SELECT d.department_id, d.department_name, COUNT(e.employee_id) AS NumberOfEmployees
FROM Departments d
LEFT JOIN Employees e ON d.department_id = e.department_id
GROUP BY d.department_id, d.department_name;















