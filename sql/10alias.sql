
-- 별명 , 별칭
-- 조회한 컬럼명을 바꾸고 싶다.
select *
from employees;

select EmployeeID,  LastName
from employees;

--   AS  :  이름을 바꾸고 싶을때 ( 컬럼 , 테이블명 )  생략가능    컬럼명 뒤에 작성한다.

select EmployeeID as id ,LastName as name
from employees;

select EmployeeID  id ,LastName  name
from employees;

select EmployeeID, concat( FirstName, LastName) as fullname
from employees;

-- 예 공급자의 이름& 주소+시티 +나라  , 전화 번호
select SupplierName , CONCAT(Address,City,Country) address , Phone phonenumber
from suppliers;


select *
from products;
select *
from categories;

select p.ProductName, c.CategoryName
from products p JOIN categories c ;

