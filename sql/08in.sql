select *
from w3schools.customers;


select *
from customers where Country in('uk','spain','italy');


-- 예  카테고리 3,4 에 속한 상품들
select *
from products where CategoryID in (3,4);

-- 예 1996년 7월 4일 5일에 주문한 주문들
select *
from orders where OrderDate in ('1996-07-04','1996-07-05');

-- 예  london 이나  madrid ,sevilla 에 있는 고객들
select *
from customers
where  City in('london','madrid','sevilla');

