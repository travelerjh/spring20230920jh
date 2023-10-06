
    -- insert into tablename (columnNam1 , cl2)
    -- values ( value1, value2)

insert  into employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes)
    value ( 10 ,'손','흥민','2000-01-01' ,'10'  ,'epl득점왕' );

    insert  into employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes)
        value ( 11 ,'이','강인','2000-01-02' ,'11'  ,'epl득점왕이 되고싶은 남자' );

-- 모든컬럼을 넣을때는 컬럼 명 나열 생략 가능

insert into  employees
    value ( 12 ,'김','민재','2000-01-03' ,'12'  ,'뮌헨이 사랑한 남자' );

-- 특정 컬럼에만 값을 넣을때
insert into employees (EmployeeID,LastName, FirstName)
    value (13 ,'박' ,'지성');
-- 나열된 컴럼명과 값의 순서 갯수가 같아야함

    insert into employees (EmployeeID,LastName, FirstName)
        value (14 ,'차' ,'범근');

insert into employees (EmployeeID) value (15);

insert into  employees(LastName)value ('cha');

    insert into  employees(LastName)value ('park');

insert into  employees (FirstName) value  ('ju');

select *
from employees;

insert into  employees (BirthDate)value  ('1993-06-01');

insert into products(Price) value  (20.1);

    select *
    from products;


-- 예 80 번 상품 입력 all

insert into  products(ProductID, ProductName, SupplierID, CategoryID, Unit, Price)
                values (80 ,'nav' ,3,2, 'lage',23  );

    insert into  products( ProductName, SupplierID, CategoryID, Unit, Price)
    values ('tesla3' ,3, 4, 'lage',23  );

    select *
    from products;



    select *
    from suppliers;

insert into suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone)
values(?,?,?,?,?,?,?,?);



insert into employees ( LastName, FirstName, BirthDate, Photo, Notes) values (?,?,?,?,?)



    select *
    from employees;





