 -- where 절 사용하기
 -- delete  사용하기

 --  !!! where 절 꼭 사용 하자 !!!
-- 지우는건 진짜 조심해서 하자 

 select *
 from employees;

 select *
 from employees where LastName ='손';
delete from employees where LastName ='손 ';

-- 지우기 전 where 절로 지울 레코드 인지 확인
-- !!!!!!!!!! 눈 !!!!!!!!!!!!!!!11  으로 확인

 select *
 from employees where FirstName ='김';

delete from employees where FirstName ='김';


 select *
 from employees;


 select *
 from employees where EmployeeID BETWEEN  15 and 20;


 Delete  from employees where EmployeeID >15 ;

 
 
 