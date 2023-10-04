
# select 는 컬럼을 속아낸다 .
# where 는  레코드  속아낸다.

select CustomerID,City,Country
from w3schools.customers;

select *
from customers where CustomerID =1;

select *
from customers where CustomerID =5;


select *
from customers where Country ='USA';

select *
from customers where Country ='Mexico';

select *
from customers where Country='france'; -- 문자열은 작은 따옴표 '' 사용  "" 안됨
                                       -- 숫자형식은 그냥쓰자

# 영국에 사는 고객들 조회   --->7
select *
from customers where Country = 'UK';
-- 1번 카테고리에 속한  상품들 조회   -->12
select *
from products  where  CategoryID = 1;
#OSaka에 있는 공급자들 조회 ---> 1
select *
from suppliers where City='osaka';


# 조합 해보자
# 미국에 사는 고객들의 이름 조회
select CustomerName
from customers where Country='usa';

#영국에 사는 고객의 이름과 , 고객번호조회
select CustomerName,CustomerID
from customers  where Country='uk';


#2번 카테고리에 있는 삼품명과 가격 조회
select CategoryName
from categories  where CategoryName = 2;

# 일본에 있는 공급자의 이름 ,
select SupplierName
from suppliers where  Country ='japan';

# 2번 카테고리의 이름 조회
select CategoryName
from  categories where  CategoryID=2;










SELECT ProductID, ProductName, Unit, Price
FROM products



