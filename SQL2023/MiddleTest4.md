# 미션을 풀어봅시다!

## 테이블은 다음과 같음

* * *
### PROF(교수)
- 교수번호, 교수이름, 직급, 소속학과코드, 주임교수 번호, 지도비(천원단위), 입사일
### STD(학생)
- 학번, 이름, 학과코드, 학년, 전화번호, 주소, 지도교수 번호
### DEPART(학과)
- 학과코드, 학과이름, 학과장 교수번호, 학과 전화번호, 학과사무실 위치
### LECTURE(개설된 강좌 정보)
- 강좌번호, 교수번호, 강의요일, 강의시작시간, 강의실
### COURSE(강좌)
- 강좌번호, 강좌 이름, 시수, 학점
### GRADE(학점)
- 학점, 최저점수, 최고점수
### ENROL(강의등록)
- 강좌번호 ,학번, 수강점수
* * *

## 개인 미션(기초)

### 1. 모든 교수들에 대해 다음과 같은 결과가 나오도록 조회하시오
```
  인출된 모든행 20
  교수명   직급   학과  임용일자
1 홍성현   교수   1001  89/09/01
2 이순신   교수   1002  89/09/01
3 이용신   교수   1003  93/03/01
4 고재우   교수   1004  93/09/01
5 민병관   교수   1005  94/09/01
...
```
- 해당 문제에서는 임용일자를 기준으로 교수들의 교수명, 직급, 학과, 임용일자를 출력된 결과다
- 따라서 해당 문제를 풀 때는 hire_date, 즉 임용일자의 기준을 설정하는 것이 포인트!
- 정답은 다음과 같다
```SQL
SELECT pname AS 교수명, DUTY AS 직급, DEPTNO AS 학과, HIRE_DATE AS 임용일자
FROM prof
ORDER BY hire_date;
```

* * *
### 2. 모든 학생들에 대해 다음과 같은 결과가 나오도록 조회하시오
```
  인출된 모든행 23
  학생정보
1 오형성 학생은 2학년이고 전화번호는 999-5555 이다
2 김석환 학생은 2학년이고 전화번호는 333-1111 이다
...
```
- 해당 문제에서는 학생정보라는 칸 안에 학생이름, 학년, 전화번호를 모두 출력된 결과다
- 열과 문자를 이어주거나 문자와 문자를 이어주는 역할은 '||'를 통해 연결해준다
- 전화번호의 중간에 '-' 문자를 끼우기 위해 전화번호의 앞과 뒤를 잘라서 출력하게 만들어야하는데
- 이때 사용하는 것이 SUBSTR() 함수를 이용한다 
```
SUBSTR('문자열' or 열 이름, 시작 위치, 길이)
--------------------------------------------------------------------
* 시작 위치는 추출 시작 자리 위치를 말하며, 길이는 추출할 길이를 뜻한다
- SUBSTR 함수는 데이터에서 지정된 길이만큼 문자열을 추출할 때 사용
  - 데이터 값이 이미 가공되어 데이터베이스에 저장되어 있는 경우에서
    일부 문자열을 잘라내 또 다시 가공해야 할 때 유용
```
- 해당 SUBSTR() 함수로 전화번호를 자른 결과는 다음과 같다
```SQL
SELECT sname||' 학생은 '||year||'학년이고 전화번호는 '||SUBSTR(stel,1,3)||'-'||SUBSTR(stel,4,4)||' 이다' AS 학생정보
FROM std;
```

* * *
### 3. 2005년도에 입사한  교수의 이름과 임용일짜를 조회하시오.
```
  인출된 모든행 3
  교수명 입사일
1 최현판 05/03/01
2 서철구 05/03/01
3 안태순 05/03/01
```
- 해당 문제에서는 2005년도에 입사한 교수의 이름과 임용일자를 조회하는 문제다
- 따라서 임용일자에 대한 조건을 제시하는 것이 포인트
- 임용일자는 DATE 타입으로 되어있으므로 해당 값을 TO_CHAR 로 변환하도록 하자
```SQL
SELECT pname AS 교수명, hire_date AS 입사일
FROM prof
WHERE TO_CHAR(hire_date, 'YY') = TO_CHAR('05');
```

* * *
### 4. '이소라' 와 '오달중' 학생의 학번을 조회하시오
```
  인출된 모든행 2
  학생명 학번
1 이소라 20040003
2 오달중 20030009
```
- 해당 문제에서는 학생의 학번을 조회하는 대신, 이름에 조건을 제시하는 것이 포인트인 문제이다
- 이소라와 오달중 두 학생의 이름만 조회하면 되니 IN() 연산자를 통해 해당 조건을 맞추도록 한다
```SQL
SELECT sname AS 학생명, sno AS 학번
FROM std
WHERE sname IN('오달중', '이소라');

```
* * *
### 5. 과목이름의 3째 자리가 '구' 인 과목명을 검색하시오(2가지)
```
  인출된 모든행 1
  과목명
1 자료구조
```
- 해당 문제에서는 문자열의 3째 자리가 '구' 인것을 검색해야하므로 과목명에 대한 조건을 거는 것이 포인트이다
- 문자열의 특정 구간부터 잘라서 표출하는 SUBSTR() 함수를 위에서 사용한 경험이 있다. 따라서 SUBSTR() 함수를 사용하면 다음과 같다
```SQL
SELECT cname AS 과목명
FROM course
WHERE SUBSTR(cname, 3, 1) = '구';
```
- 또한 마찬가지로 LIKE 연산자에서 %는 모든 단어를, _ 는 한단어를 찾으므로 앞에 2글자를 _ 로 찾은다음에
- 3번째는 '구'를, 이후에는 어떤것이 와도 무관하니 %를 붙여서 검색한다
- 따라서 검색 결과는 다음과 같다
```SQL
SELECT cname AS 과목명
FROM course
WHERE cname LIKE '__구%';
```

## 조별 미션(기초)

* * *
### 6. 교수들의 연간지도비를 10% 인상한 결과를 조회하시오
- 단, 지도바가 NULL 인 교수는 100으로 간주하여 계산할 것
```
  인출된 모든행 20
  교수명  지도비  인상지도비
1 홍성현  300     3960
2 이순신  250     3300
...
```
- 해당 문제는
```SQL
SELECT pname AS 교수명, NVL(dsal, 100) AS 지도비, (NVL(dsal, 100) * 1.1)*12 AS 인상지도비
FROM prof;
```

* * *
### 7. 95년에서 99년도에 입사한 교수의 이름과 입사일을 조회하시오
```
  인출된 모든행 8
  교수명 입사일
1 문병인 95/03/01
2 오태수 95/03/01
...
```
- 해당 문제는
```SQL
SELECT pname AS 교수명, hire_date AS 입사일
FROM prof
WHERE hire_date BETWEEN '950101' AND '991231';
```

* * *
### 8. 2002~2004년도에 입학한 학생 이름, 학번, 주소를 조회하시오.
```
  인출된 모든행 21
  학생명 학번      거주지
1 오형성 20040001  대구
2 김석환 20040002  안동
...
```
- 해당 문제는
```SQL
SELECT sname AS 학생명, sno AS 학번, saddr AS 거주지
FROM std
WHERE SUBSTR(sno, 1, 4) BETWEEN '2002' AND '2004';
```

* * *
### 9. '대구'에 거주하는 3학년과 '경산'에 거주하는 학생들의 학년, 이름, 거주지역을 조회하시오.
```
  인출된 모든행 4
  학생명 학년 거주지
1 강태효  2   경산
2 김성종  3   대구
...
```
- 해당 문제는
```SQL
SELECT sname AS 학생명, year AS 학년, saddr AS 거주지
FROM std
WHERE (saddr = '대구' AND year = 3) OR (saddr = '경산');
```

* * *
### 10. 2000년대에 입사한 교수의 이름, 입사일자를 조회하시오.
```
  인출된 모든행 7
  교수명 입사일자
1 홍금인 01/03/01
2 김병철 01/03/01
...
```
- 해당 문제는
```SQL
SELECT pname AS 교수명, hire_date AS 입사일자
FROM prof
WHERE hire_date BETWEEN '20000101' AND '20091231';
```

* * *
### 11. 과목이름이 ‘어’를 포함하는 모든 과목명을 검색하시오.
```
  인출된 모든행 2
  과목명
1 C_언어
2 DB_언어
```
- 해당 문제는
```SQL
SELECT cname AS 과목명
FROM course
WHERE cname LIKE '%어%';
```

* * *
## SQL 활용 연습문제

### 12. 성이 '이' 또는 '박'인 학생중에서 '대구'와 '경산'에 거주하지 않는 학생의 이름, 주소를 조회하시오
```
  학생명 거주지
1 이숙자 서울
2 이태련 서울
3 박고라 구미
4 박산민 서울
```

```SQL
SELECT sname AS 학생명, saddr AS 거주지
FROM std
WHERE (sname LIKE '이%' OR sname LIKE '박%') AND saddr NOT IN('대구', '경산');
```

* * *
### 13. 학생이 3명 이상 거주하는 지역(주소)과 인원수를 조회하시오
```
거주지 인원수
대구  9
경산  3
서울  6
```

```SQL
SELECT saddr AS 거주지, COUNT(*) AS 인원수
FROM std
GROUP BY saddr
HAVING COUNT(*) >= 3;
```

* * *
## 개인 미션(활용)

### 14. 지도비가 150 이상이고 250 이하인 교수의 학과번호, 이름, 지도비를 학과번호별로 조회하시오
- 단, 학과번호 기준으로 오름차순 정렬할 것
```
  학과번호 교수명 지도비
  1001    서철구  200
  1001    오태수  180
  1002    김기수  180
  ...
  (null) 안태순   190
```
- 해당문제는
```SQL
SELECT deptno AS 학과번호, pname AS 교수명, dsal AS 지도비
FROM prof
GROUP BY deptno, pname, dsal
HAVING dsal BETWEEN 150 AND 250
ORDER BY deptno;
```

* * *
## Mission SQL 활용(조별)

### 15. 9월달에 임용된 교수이름과 입사일자를 조회하시오
```
  인출된 모든행 5
  교수명 입사일자
1 홍성현 89/09/01
2 이순신 89/09/01
...
```
- 해당문제는
```SQL
  SELECT pname AS 교수명, hire_date AS 입사일자
  FROM prof
  WHERE TO_CHAR(hire_date, 'MM') = TO_CHAR('09');
```

* * *
### 16. 모든 교수의 이름, 임용일자(입사일자), 근무개월수(정수형으로 반올림), 임용요일을 검색하시오
- 단, 요일 순으로 정렬
```
  인출된 모든행 20
  교수명 임용일자 근무개월수 임용요일
1 이용신 93/03/01   349      월요일
2 장민주 99/03/01   277      월요일
...
```
- 해당 문제는
```SQL
    SELECT pname AS 교수명, hire_date AS 임용일자, ROUND((SYSDATE - hire_date) / 30) AS 근무개월수, TO_CHAR(hire_date, 'DAY') AS 임용요일
    FROM prof
    ORDER BY TO_CHAR(hire_date-1, 'D');
```

* * *
### 17. 2000년 이전에 입사한 교수에 대해 임용일로부터 6개월 이후의 날짜와 첫 번째 토요일을 검색하시오
```

```
- 
```SQL
SELECT pname AS 교수명, hire_date AS 임용일, ADD_MONTHS(hire_date, 6) AS "6개월 이후의 날짜", NEXT_DAY(ADD_MONTHS(hire_date, 6), '토요일') AS "첫 토요일"
FROM prof
WHERE TO_CHAR(hire_date, 'YYYY') <= '2000';
```

* * *
### 18. 임용된 년도의 2월의 마지막 날짜가 28일이 아닌 교수의 이름, 임용일자, 2월의 마지막 날짜를 검색하시오
```

```
-
```SQL
    SELECT pname AS 교수명, hire_date AS 임용일, LAST_DAY(ADD_MONTHS(TRUNC(hire_date, 'YEAR'), 1)) AS "2월 마지막 날짜"
    FROM prof
    WHERE TO_CHAR(LAST_DAY(ADD_MONTHS(TRUNC(hire_date, 'YEAR'), 1)),'DD') <> '28';
```

* * *
### 19.  ‘이순신’ 교수의 임용날짜에 7일 7시간을 더한 날짜를 다음과 같은 형식으로 출력하시오.
- “9월 10일, 2020년 19시 ”
```
```
- 
```SQL
    SELECT pname AS 교수명, TO_CHAR(((hire_date + 7)) + (7 / 24), 'MONTH dd"일," YYYY"년" HH24"시"') AS 변경일자
    FROM prof
    WHERE pname = '이순신'
```

* * *
### 20. 성이 ‘이’, ‘김’, ‘송’인 학생 중 이름의 세번째가 ‘수’ 인 학생의 이름과 학년을 조회하시오
- 단, 이름 순으로 정렬 할 것
```
```
- 
```SQL
SELECT sname AS 학생명, year AS 학년
FROM std
WHERE (sname LIKE '이%' OR sname LIKE '김%' OR sname LIKE '송%') AND SUBSTR(sname, 3, 1) = '수';
```

* * *
### 21.  ‘_’가 있는 과목명에서 ‘_’를 제거한 이름을 조회하시오.
```
```
- 
```SQL
    SELECT cname AS 과목명, REPLACE(cname, '_') AS 새과목명
    FROM course
    WHERE length(cname) > length(REPLACE(cname, '_'));
```

* * *
### 22.  성이 '김'인 모든 학생의 숫자를 검색하시오.
```
```
- 
```SQL
    SELECT COUNT(sname) AS "김씨인 학생 수"
    FROM std
    GROUP BY SUBSTR(sname, 1, 1)
    HAVING SUBSTR(sname, 1, 1) LIKE '김%';
```

* * *
### 23. 과목이름과 본인의 이름을 연결한 결과와 결과에서 본인의 성이 5번째인 과목을 검색하시오.
```
```
- 
```SQL
    SELECT cname||'김종율' AS 연결한결과 , cname AS 과목명
    FROM course
    WHERE SUBSTR(cname||'김종율',5,1) = '김'
```

* * *
### 24. 년도별로 입학한 학생수를 조회하시오.(많은데서 적은 순으로 정렬 )
```
```
- 
```SQL
    SELECT SUBSTR(sno, 1, 4) AS 입학년도, COUNT(SUBSTR(sno, 1, 4))AS 학생수
    FROM std
    GROUP BY SUBSTR(sno, 1, 4)
    ORDER BY COUNT(SUBSTR(sno, 1, 4)) DESC;
```

* * *
### 25. 평균점수가 가장 높은 과목의 점수와 가장 낮은 과목의 점수를 조회하시오.
```
```
- 
```SQL
    SELECT MAX(AVG(merits)) AS 최고평균, MIN(AVG(merits)) AS 최저평균
    FROM enrol
    GROUP BY cno;
```