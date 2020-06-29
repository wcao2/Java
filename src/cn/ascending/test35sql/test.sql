
CREATE TABLE classgrade (
    stu_id int,
    classroom int,
    grade int
);

insert into classgrade values (0001,1,86);
insert into classgrade values (0002,1,95);
insert into classgrade values (0003,2,89);
insert into classgrade values (0004,1,83);
insert into classgrade values (0005,2,86);
insert into classgrade values (0006,3,92);
insert into classgrade values (0007,3,86);
insert into classgrade values (0008,1,88);

select * from classgrade;

-- https://zhuanlan.zhihu.com/p/109419890

-- rank函数：相同值排名相同，下一排名根据之前的记录个数而定  The same value ranks the same, the next ranking depends on the number of previous records
-- dense_rank函数：相同值排名相同，排名连续不间断   The same value ranks the same, the ranking is continuous
-- row_number函数：不管值是否相同，依次连续排名	Regardless of whether the values are the same, rank consecutively

-- Query the results ranked by grade in each class
select *,
       rank() over(partition by classroom order by grade desc) as "ranking"
from classgrade;

select *,
       rank() over (order by grade desc) as "ranking",
       dense_rank() over (order by grade desc) as "dense_rank", --个人觉得比较合理
       row_number() over (order by grade desc) as "row_num"
from classgrade;

--!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!查出指定位置的
select * from (select *,
       rank() over (order by grade desc) as "ranking",
       dense_rank() over (order by grade desc) as "dense_rank",
       row_number() over (order by grade desc) as "row_num"
from classgrade) as a where a.row_num in (7,8);


--在上面的班级表（class）中，查询每个班级中学生成绩最大值所在行的数据???????????????????????????
--way1
select * from classgrade as a where grade in (select max(grade) from classgrade as b where b.classroom=a.classroom);
--way2
select * from (
              select *,
				   rank() over(partition by classroom order by grade desc) as "ranking"
			  from classgrade
) as a
where a.ranking ='1';
--查询各个班级成绩前两名的记录 ?????????????????????????????????????????????
select * from (
              select *,
                     rank() over(partition by classroom order by grade desc) as "ranking"
              from classgrade
) as a
where a.ranking <=2;


-- where cannot take aggregation function, having could, having 只是对aggregation function进行操作
-- select account_type,count(*) as total from account group_by account_type having count(*)>1;

-- ===================================================

CREATE TABLE eDetails (
    id int,
    full_name varchar(30),
	 manager_id int,
	date_of_joining date default CURRENT_DATE
);

CREATE TABLE eSalary (
    employee_id int,
    salary int,
    project varchar(40)
);

INSERT INTO eDetails(id,full_name,manager_id,date_of_joining) values(121,'John Snow',321,'01/31/2014');
INSERT INTO eDetails(id,full_name,manager_id,date_of_joining) values(321,'Walter White',986,'01/30/2015');
INSERT INTO eDetails(id,full_name,manager_id,date_of_joining) values(421,'Kuldeep Rana',876,'11/27/2016');
select * from eDetails;

INSERT INTO eSalary(employee_id,salary,project) values(121,8000,'P1');
INSERT INTO eSalary(employee_id,salary,project) values(321,10000,'P2');
INSERT INTO eSalary(employee_id,salary,project) values(421,12000,'P1');
select * from eSalary;

-- Write a query to fetch only the first name(string before space) from the FullName column of eDetail.
SELECT split_part(full_name, ' ',1) as first_name
FROM  eDetails;

-- Write a SQL query to fetch all the Employees who are also managers from eDetail
SELECT * from eDetails e inner join eDetails m on e.id=m.manager_id;

-- Write a SQL query to fetch all employee records from eDetail who have a salary record in eSalary.
select * from eDetails e where e.id in (select employee_id from eSalary);
SELECT * FROM eDetails E WHERE EXISTS (SELECT * FROM eSalary S WHERE  E.id = S.employee_id);

-- Write a SQL query to fetch top n records  ?????????????????????????????????????????????
SELECT * FROM eSalary ORDER BY salary DESC LIMIT 2;

--Write SQL query to find the 3rd highest salary from table without using TOP/limit keyword

SELECT salary
FROM eSalary Emp1
WHERE 3 = ( -- 3意思是当数到第三个时候
                SELECT COUNT( DISTINCT ( Emp2.Salary ) )-- 因为可能有一样的工资 所以用Distinct
                FROM eSalary Emp2
                WHERE Emp2.Salary >= Emp1.Salary -- EMP2在前面默认降序
            )

SELECT COUNT( DISTINCT ( Emp2.Salary ) )
                FROM eSalary Emp2, eSalary Emp1
                WHERE Emp2.Salary >= Emp1.Salary

-- What is the difference between DROP and TRUNCATE commands?
-- What do you mean by “Trigger” in SQL?
-- What is the difference between ‘HAVING’ CLAUSE and a ‘WHERE’ CLAUSE?
-- What are the differentset operators available in SQL?
-- Write an SQL query to find names of employee start with ‘A’?

-- find only mangers from Employee table
select e.* from Employee e join Manager m on e.empId=m.empId;
select e.* from Employee e, Manager m where e.empId=m.empId;





















