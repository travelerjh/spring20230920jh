
-- 기본적으로 오름차순
-- desc 내림 차순

select *
from employees;

-- 생일 순으로
select *
from employees
order by  BirthDate;

-- 생일 순으로
select *
from employees
order by  4
;

select EmployeeID, LastName, BirthDate
from employees
order by  BirthDate;

select EmployeeID, LastName, BirthDate
from employees
order by  3;

select *
from products
order by  CategoryID;

-- 내림 차순

select *
from products
order by  CategoryID desc, Price asc ;


select *
from products
order by  CategoryID ,Price,ProductID;

select *
from products
order by  4,6;


--  예 고객을 국가명 오름차순으로 조회
select *
from customers
order by  Country ;

-- 예 가격이 비싼 상품이 먼저 조회되도록 코드 작성
select *
from products
order by  Price desc ;

-- 예 가장 어린 직원이 먼저 조회도도록 작성
select *
from employees
order by BirthDate desc ;













