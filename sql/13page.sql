


-- page 
-- 29
--  전체 검색
select count(*)
from suppliers;

-- 1페이지에 10개의 행을 보여준다면
-- 총 3페이지가 있겟다 .

-- count(*) : records 의 수   : 마지막 페이지의 수는
--  1~10 개면                  :  1
-- 11~20 개면                  :  2
-- 21~30 개면                  :  3
-- 31~40 개면                  :  4
--  n  개면                    :  n+1

--  레코드가 n개 이고 페이지당 10개 씩 보여줄 떄 마지막 페이지 번호는 ?
--  ( n-1 ) / 10 +1











