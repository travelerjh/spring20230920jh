select Price
from w3schools.products
where  ProductID =1 ;

select Price *6
from w3schools.products
where  ProductID =1 ;


select ProductName , Price *2
from products;

-- 1968-12-08
select LastName ,BirthDate
from employees
where  EmployeeID=1 ;

-- 1968-12-09
select LastName ,BirthDate +1
from employees
where  EmployeeID=1 ;

-- 1968-12-09   마리아 디비 가능 !
select LastName ,adddate(BirthDate , interval  1 day )
from employees
where  EmployeeID=1 ;

select  EmployeeID ,LastName , FirstName
from employees;

select EmployeeID ,
       CONCAT(LastName,'  ',FirstName),
       adddate(BirthDate, interval  1 YEAR)
from employees;


select EmployeeID ,
       CONCAT(LastName,'  ',FirstName),
       adddate(BirthDate, interval  -1 YEAR)
from employees;

-- 예 주문량 *2 결과 조회

select   Quantity*2
from orderdetails;


-- 예 city ,country 고객 테이블 조회
select CONCAT(City , '   ', Country)
from customers;






