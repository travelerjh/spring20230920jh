#select  : 데이터 조회;
#테이블 형식으로
#행 row 같은 말
# 테이블을 모아놓은것을   스키마 = 데이타 베이스  라고 한다

select *from w3schools.customers;
select *from w3schools.employees;

# w3shools 안써도 된다.
select *from w3schools.orderdetails;
select *from orderdetails;

select *from orderdetails;
select * from employees;
select * from categories;
select * from orders;
select * from products;
select * from shippers;
select * from suppliers;
select * from customers;

# 컬럼과 행이 있다 .

# select  column명
# from   table 명  ;

select CustomerName, CustomerID,Country from customers;
select * from customers;

select LastName,FirstName,BirthDate
from employees;

select ProductName,Unit,Price
from products;

select SupplierName,Address,Country
from suppliers;


# 고객테이블의 국가 컬럼 조회   91개
select Country
from customers;
# 중복 코드 제거 하고싶으면 distinct   21 개
select distinct Country
from customers;

#애도 91개
select Country ,City
from customers;

#애는 69개 나옴  왜 ?  distint 사용해서
select distinct Country ,City
from customers;

# count  행수(row)
# 91
select count( customers.Country)
from  customers;
# 21
select count( distinct customers.Country)
from  customers;

#  전체 행의수
select count(*)
from customers ;
#9
select count(*)
from employees;
#77
select count(*)
from products;

# 공긍자들이 있는 나라수  16
select  count( distinct Country)
from suppliers;
# 주문 건수    830
select count(orders.CustomerID)
from orders;
#몇개의 카테고리가 있는지 조회    8
select count( *)
from categories;
#고객이 있는 도시의 수   91 --> 중복 제거 69
select count( distinct City)
from customers;


# select 는 컬럼을 속아낸다 .
# where 는 레코드  속아낸다.






