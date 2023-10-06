SELECT * From w3schools.customers;

select CustomerName,Country
from w3schools.customers where Country= 'germany';

select CustomerName,Country
from w3schools.customers where not Country= 'germany';


-- 예제   1번 카테고리에 속하지 않는 상품들 조회

select *
from products where not CategoryID =1;


-- 예제   2번  제팬에 있지 않는 공급자 조회
select *
from suppliers where  not  Country= 'japan';


select *
from products ;


select CustomerID, CustomerName,Address,City,Country from customers;




