-- or 둘중에 하나만 투루면 투루

select CustomerID, City, Country
from customers
where  City = 'spain';

select CustomerID, City, Country
from customers
where  City = 'madrid';


select CustomerID, City, Country
from customers
where  City = 'madrid' and  Country = 'spain';

select CustomerID, City, Country
from customers
where  City  != 'madrid' and  Country = 'spain';


select CustomerID, City, Country
from customers
where  City  != 'madrid' or  Country != 'spain';

select *
from customers
where not (City ='madrid' and  Country='spain');


select *
from customers
where  Country ='spain' or Country = 'uk';

select *
from customers
where CustomerName >= 'c' and CustomerName <'d';

select *
from employees
where BirthDate >= '1958-01-01';


-- 예 스웨덴이나 이탈리아에 있는 공급자들 조회
select *
from suppliers
where  Country ='sweden' and  Country = 'ltaly';

-- 예 1963 년 8월 생 직원 조회
select *
from employees
where BirthDate >= '1963-08-01' and  BirthDate <= '1963-08-31';

-- 예 가격이 100~ 200 사이의 상품 조회
select *
from products
where  Price >=100 and  Price <=200;

-- 1997년에 주문한 주문 조회
select *
from orders
where OrderDate >= '1997-01-01' and  OrderDate <= '1997-12-31';


-- 여러 연산자 조합 시  ( ) 르 사용해서 우선 순위 정해줄것

-- 10달러 미만 100 달러 이상 조회후 카테고리가 1이친구 찾자
select *
from products
where  ( Price < 10 or Price >= 100 ) and CategoryID = 1 ;













