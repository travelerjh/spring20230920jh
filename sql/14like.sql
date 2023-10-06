select *
from w3schools.customers
where CustomerName= 'around the horn';


select *
from customers
where CustomerName like '%the% ';

-- like  는  %  기호과 같이 사용한다.

select *
from customers where  CustomerName like  '%er';


select *
from customers where  CustomerName like  'c%';

select *
from employees
where  FirstName LIKE  '_____';  -- 1개의 문자 아무거나


select *
from employees
where LastName LIKE  '____';  -- 1개의 문자 아무거나

select *
from employees where  LastName like  '_e%';


-- 예 ch로 시작하는 상품명 조회
select *
from products where ProductName like 'ch%';
-- 예 es로 끝나는 상품명 조회
select *
from products where ProductName like  '%es';
-- 예 중간에 use가 들어간 상품명 조회
select *
from products where ProductName like  '%use%';



select *
from customers  ;


select *
from suppliers;



select *
from employees where LastName like ?;