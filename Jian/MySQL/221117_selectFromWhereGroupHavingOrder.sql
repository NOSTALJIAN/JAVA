# sqlDB의 구매 테이블(buytbl)에서 사용자(userID)가 구매한 물품의 개수
USE sqldb;
# 과정 1
SELECT userID, amount FROM buytbl ORDER BY userID;
# 과정 2
SELECT userID, SUM(amount) FROM buytbl GROUP BY userID;

# 별칭(AS) 사용
SELECT userID AS '사용자 아이디', SUM(amount) AS '총 구매 개수'
	FROM buytbl GROUP BY userID;

# 구매액의 총합을 출력
SELECT userID AS '사용자 아이디', SUM(price*amount) AS '총 구매 개수'
	FROM buytbl GROUP BY userID;

# 전체 구매자가 구매한 물품의 개수의 평균
USE sqldb;
SELECT AVG(amount) AS '평균 구매 개수' FROM buytbl;

# 각 사용자 별로 한 번 구매 시 물건을 평균 몇 개 구매했는지 평균을 계산
SELECT userID, AVG(amount) AS '평균 구매 개수' FROM buytbl GROUP BY userID;

# 가장 큰 키와 가장 작은 키의 회원 이름과 키를 출력
# 과정 1
SELECT name, MAX(height), MIN(height) FROM usertbl GROUP BY Name;
# 과정 2
SELECT name, height
	FROM usertbl
	WHERE height = (SELECT MAX(height) FROM usertbl)
		OR height = (SELECT MIN(height) FROM usertbl);

# 휴대폰이 있는 사용자의 수를 카운트
SELECT COUNT(*) FROM usertbl;

# 휴대폰이 있는 회원만 카운트
SELECT COUNT(mobile1) AS '휴대폰이 있는 사용자' FROM usertbl;

# 사용자별 총 구매액
USE sqldb;
SELECT userID AS '사용자', SUM(price*amount) AS '총 구매액'
	FROM buytbl
	GROUP BY userID;

# 총 구매액이 1,000 이상인 사용자만 구하기
# 과정 1,000
SELECT userID AS '사용자', SUM(price*amount) AS '총 구매액'
	FROM buytbl
	WHERE SUM(price*amount) > 1000
	GROUP BY userID;
# 과정 2
SELECT userID AS '사용자', SUM(price*amount) AS '총 구매액'
	FROM buytbl
	GROUP BY userID
	HAVING SUM(price*amount) > 1000;

# 총 구매액이 1,000 이상인 사용자를 구매액이 적은 사용자 순으로 나열
SELECT userID AS '사용자', SUM(price*amount) AS '총 구매액'
	FROM buytbl
	GROUP BY userID
	HAVING SUM(price*amount) > 1000
	ORDER BY SUM(price*amount);

# 분류 별 합계 및 그 총합을 구하기
SELECT num, groupName, SUM(price*amount) AS '비용'
	FROM buytbl
	GROUP BY groupName, num
	WITH ROLLUP;

# 소합계 및 총합만 구하기
SELECT groupName, SUM(price*amount) AS '비용'
	FROM buytbl
	GROUP BY groupName
	WITH ROLLUP;