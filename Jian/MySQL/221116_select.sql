# 현재 서버에 어떤 데이터베이스가 있는지 조회
SHOW DATABASES;
# employees 데이터베이스 지정
USE employees;
# 현재 데이터베이스에 있는 테이블의 정보를 조회
SHOW TABLE STATUS;
# employees 테이블의 열이 무엇이 있는지 확인 (1)
DESCRIBE employees;
# employees 테이블의 열에 무엇이 있는지 확인 (2)
DESC employees;
# 최종적으로 firts_name과 gender 열의 데이터를 조회
SELECT `first_name`, `gender` FROM employees;