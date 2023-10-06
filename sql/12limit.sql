
-- limit 레코드(행 ,row) 제한

-- 예 를 언제 쓰냐
-- 현실세계 에선  페이즐 나눌떄 사용한다.
-- 레코드가 많은 커스터머 테이블은

-- 0~10
select CustomerID, CustomerName
from customers order by CustomerID limit 0,10;

-- 11~20
select CustomerID, CustomerName
from customers order by CustomerID limit 10,10;

-- 21~30
select CustomerID, CustomerName
from customers order by CustomerID limit 20,10;



-- 예  공급자를 한페이지에 5개씩 보여줄때  공급자번호순  3번째 페이지 조회 코드 작성
select *
from suppliers order by  SupplierID limit  10,5;

-- 하뉴ㅔ이지가 n개의  레코드(행) 을 보여주면
--  m번째 페이지 조회
-- limit (m-1)*n ,n 이다
-- 계산해서 넣어준다



select SupplierID, SupplierName,Address,Country
from suppliers order by  SupplierID ;


select CustomerID,CustomerName
from customers
order by  CustomerID
limit  0, 15;

select count(*)
from customers;








SELECT COUNT(*) FROM customers;







select *
from customers;

select *
from customers
limit 3;

select *
from customers
limit 2;

select *
from employees
order by  BirthDate
limit 2;

select *
from products
order by Price desc
limit 10;

-- 예 가장 어린 3명의 직원 조회
select *
from employees
order by BirthDate desc
limit 3;

-- 예 2번 카테고리에서 가장 저렴함 상품 조회

select *
from products where  CategoryID= 2 order by Price desc  limit 1;


--  limit n : n 개
--  limit n ,m   n 부터 m 개 까지

select ProductName ,Price
from products
order by  Price
limit 1,3;


select ProductName ,Price
from products
order by  Price
limit 3,10;







