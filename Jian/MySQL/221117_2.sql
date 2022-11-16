# WHERE 조건 없이 검색
USE sqldb;
SELECT * FROM usertbl;

# WHERE 사용해서 검색
SELECT * FROM usertbl WHERE name = '김경호';

# 관계 연산자의 사용
-- 1970년 이후에 출생하고 신장이 182 이상인 사람의 아이디와 이름을 조회
SELECT userID, Name FROM usertbl WHERE birthYear >= 1970 AND height >= 182;
-- 1970년 이후에 출생했거나, 신장이 182 이상인 사람의 아이디와 이름을 조회
SELECT userID, Name FROM usertbl WHERE birthYear >= 1970 OR height >= 182;

# BETWEEN... AND와 IN() 그리고 LIKE
-- 키가 180 ~ 183인 사람을 조회
SELECT name, height FROM usertbl WHERE height >= 180 AND height <= 183;
SELECT name, height FROM usertbl WHERE height BETWEEN 180 AND 183;
-- 지역이 '전남', '경남', '경북'인 사람의 정보를 확인
SELECT name, addr FROM usertbl WHERE addr='전남' OR addr='경남' OR addr='경북';
SELECT name, addr FROM usertbl WHERE addr IN ('전남', '경남', '경북');
-- 문자열의 내용을 검색
SELECT name, height FROM usertbl WHERE name LIKE '김%';
SELECT name, height FROM usertbl WHERE name LIKE '_종신';

# ANY/ALL/SOME 그리고 서브쿼리(SubQuery, 하위쿼리)
-- 김경호보다 키가 크거나 같은 사람의 이름과 키를 출력
SELECT name, height FROM usertbl
	WHERE height > (SELECT height FROM usertbl WHERE name = '김경호');
-- 지역이 '경남' 사람의 키보다 키가 크거나 같은 사람을 추출
SELECT name, height FROM usertbl
	WHERE height = ANY (SELECT height FROM usertbl WHERE addr = '경남');
SELECT name, height FROM usertbl
	WHERE height IN (SELECT height FROM usertbl WHERE addr = '경남');

# 원하는 순서대로 정렬하여 출력: ORDER BY
-- 오름차순 정렬
SELECT name, mDate FROM usertbl ORDER BY mDate;
-- 내림차순 정렬
SELECT name, mDate FROM usertbl ORDER BY mDate DESC;
-- 키가 큰 순서로 정렬하되 만약 키가 같을 경우에 이름 순으로 정렬
SELECT name, height FROM usertbl ORDER BY height DESC, name ASC;

# 중복된 것은 하나만 남기는 DISTINCT
-- 회원 테이블에서 회원들의 거주지역이 몇 군데인지 출력
SELECT addr FROM usertbl;
-- ORDER BY 사용해서 출력
SELECT addr FROM usertbl ORDER BY addr;
-- DISTINCT 사용해서 출력
SELECT DISTINCT addr FROM usertbl;

# 출력하는 개수를 제한하는 LIMIT
-- employees DB 사용
-- 회사 입사일이 오래된 직원 5명의 emp_no(사원번호)를 알아내보자
USE employees;
SELECT emp_no, hire_date FROM employees
	ORDER BY hire_date ASC;
-- 제일 앞 5건만 출력
USE employees;
SELECT emp_no, hire_date FROM employees
	ORDER BY hire_date ASC
	LIMIT 5;
-- LIMIT 시작, 개수 형태로 출력
SELECT emp_no, hire_date FROM employees
	ORDER BY hire_date ASC
	LIMIT 0, 5;
-- LIMIT 개수 OFFSET 시작 형식으로 출력
SELECT emp_no, hire_date FROM employees
	ORDER BY hire_date ASC
	LIMIT 5 OFFSET 0;

# 테이블을 복사하는 CREATE TABLE ... SELECT
-- buytbl을 buytbl2로 복사
USE sqldb;
CREATE TABLE buytbl2 (SELECT * FROM buytbl);
SELECT * FROM buytbl2;
-- 지정한 일부 열만 복사
CREATE TABLE buytbl3 (SELECT userID, prodName FROM buytbl);
SELECT * FROM buytbl3;