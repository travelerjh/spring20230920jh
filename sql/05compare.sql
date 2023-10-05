-- < 작다   > 크다   >= 크거나 작다   <= 작거나 같다
-- 숫자 말고도  문자 ,날짜형식  여러가지 형식에도 사용 가능

select *
from customers
where  CustomerID <'3'; -- 문자형식도 가능


select *
from products
where Price  < 10;

select *
from products
where Price > 10;

select *
from products
where Price =10 ;

select *
from products
where not  Price = 10 ; -- 같지 않다.

select *
from products
where Price != 10; -- 같지 않다.


select *
from products
where Price <> 10; -- 같지 않다.

select *
from products
where Price >=10 ;

select *
from products
where Price <=10 ;

