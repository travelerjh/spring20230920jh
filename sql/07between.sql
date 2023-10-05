
-- between


select *
from w3schools.products
where  Price > 10  and price < 100;


select *
from w3schools.products
where  Price between 10 and 100;   -- 뒤에는 포함 안시킴

select *
from customers
where CustomerName between 'a' and  'b' ;

-- 예 가격이 30~40  인 상품 조회
select *
from products
where Price between  30 and 40;

-- 예 1998월 2월 에 주문한 주문 조회
select *
from orders
where OrderDate between '1998-02-01' and '1998-02-30';

-- 예 1958년 9월 태어난 직원 조회
select *
from employees
where BirthDate between '1958-09-01' and '1958-09-31' ;


