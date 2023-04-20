# Chp 3. SELECT : 데이터 조회의 기본

# 1. SELECT 문의 기본 문법
```SQL
SELECT [DISTINCT] 열 이름 [or 별칭(alias)]
FROM 테이블 이름
[WHERE 조건식]
[ORDER BY 열이름 [ASC or DESC]];
```
## 1) SQL 문 작성 규칙과 특징
 1. SELECT 와 FROM 은 SELECT 문에서 반드시 필수로 작성해야한다
 2. 대문자([])는 선택사항이다
 3. 세미콜론(;)을 통해 SQL 문이 끝났음을 알린다
 4. SQL 문은 대문자와 소문자를 구별하지 않는다
 5. SQL 문은 한 줄 또는 여러 줄로 작성할 수 있다
    - 명령어는 여러 줄로 나눌 수 없다(예 : SEL ECT 라고 쓸 수 없다)
    - 가독성과 편집의 용이성을 위해 내용이 달라지면 줄을 나눈다(권장)
 6. 코드 수준에 따른 들여쓰기는 SQL 문장을 좀 더 읽기 쉽게 한다(권장)
 7. 명령어를 대문자로 작성하고 나머지를 소문자로 작성하면 가독성이 좋다(권장)
 > 권장 규칙은 SQL 사용자들 사이에서 암묵적으로 지키는 규칙일 뿐이다

## 2) 전체 데이터 조회하기
`SELECT * FROM 테이블명;`
 - SELECT 명령어 데이터를 '선택(=조회)' 하는 의미
    - 선택된 데이터를 화면에 출력할 뿐, 실제 데이터 값이 변경되지 않는다
    - 데이터 값을 실제로 조작하는 명령어는 DML 임 (SELECT는 DML)
 ```SQL
 SELECT
    *
 FROM
    employees;
 ```
 - SELECT 명령어 다음에 *(모든 열)를 입력해서 모든 열을 조회함
 - FROM 은 '어느 테이블로부터' 라는 의미로 바로 뒤에 테이블 명을 기술함
 - 따라서 위의 명령문은 "employees 테이블로부터 모든 열을 조회하라' 라는 의미다

## 3) 원하는 열만 조회하고 정렬하기
`SELECT 열이름 FROM 테이블명 ORDER BY 열이름 ASC(기본값)/DESC`
 - ORDER BY 명령어를 통해 오름차순 또는 내림차순 정렬을 할 수있다
 - 열이름을 지정하여 해당 열이름을 기준으로 정렬을 진행한다
 - 열 이름을 ***지정하지 않는다면 에러가 발생하니 꼭 지정하도록 하자!***
    - SELECT ~ FROM ~ 를 작성한 다음 사용 가능하다
 - ORDER BY 이후 아무것도 작성하지않으면 기본값으로 ASC(오름차순)이 반영된다
    - 또는 DESC(내림차순)을 작성하여 내림차순으로 변경할 수 있다

 ### 다음의 문제의 빈칸에 들어갈 말로 올바른 것은?
 > employees 테이블에서 employee_id 와 first_name 과 last_name을 선택한 다음 employee_id 기준으로 내림차순으로 정렬하기
 ```SQL
 SELECT
    employee_id,
    first_name,
    last_name
 FROM
    employees
 [            ]
 ```
 > 시간이 된다면 아래의 문제도 풀어보시길!
 ```SQL
 1. employees 테이블에서 직원의 성과 이름, 직급, 급여를 출력하되, 급여가 높은 순으로 정렬하여 출력하시오.
 2. customers 테이블에서 고객 회사 이름과 주문 횟수를 출력하되, 주문 횟수가 많은 순으로 정렬하여 출력하시오.
 3. products 테이블에서 제품명, 제조사, 가격을 출력하되, 가격이 낮은 순으로 정렬하여 출력하시오.
 4. orders 테이블에서 주문한 고객 회사 이름과 주문 일자를 출력하되, 주문 일자가 빠른 순으로 정렬하여 출력하시오.
 5. employees 테이블에서 직원의 성과 이름, 부서 이름, 입사일을 출력하되, 입사일이 빠른 순으로 정렬하여 출력하시오.
 ```

## 4) 중복된 출력 값 제거하기
`SELECT DISTINCT 열이름 FROM 테이블명;`
 - DISTINCT 명령어는 중복된 행을 제거한 후 출력
    - 중복된 행을 제거하고 싶은열 앞에 DISTINCT 명령어를 기술한다
 ### 다음의 문제의 빈칸에 들어갈 말로 올바른 것은?
 > employees 테이블에서 job_id를 출력하되, 중복없이 출력하라
 ```SQL
 [    ]
 FROM employees;
 ```
 > 시간이 된다면 아래의 문제도 풀어보시길!
 ```SQL
 1. employees 테이블에서 모든 job titles의 종류를 조회합니다.
 2. orders 테이블에서 주문한 날짜 중 중복되지 않는 모든 날짜를 조회합니다.
 3. products 테이블에서 중복되지 않는 모든 카테고리를 조회합니다.
 ```

## 5) SQL 문을 효율적으로 작성하기 위해 별칭 사용하기
`SELECT 열이름 AS(생략가능) 별칭`
 - 원래 명명된 열 이름 외에 열 이름으로 임의로 바꿔 쓰고자 할 때 사용하는 명령어
 - AS(alias) : 열 이름을 변경할 때 AS 접속사를 사용
    - 단, SELECT 문에 기술할 때는 AS 접속사를 생략하고 별칭을 기술할 수 있음
 - 특징
    1. 열 이름을 임시로 변경하는 데 사용하므로 물리적으로 변경되지 않음
    2. 열 이름 바로 뒤에 AS 를 붙여 사용하여 별칭을 사용할 수 있다
    3. AS 접속사는 생략 가능하지만 별칭 앞 뒤로 공백을 넣을 것
    4. 별칭에 공백, 특수문자, 대소문자 등을 사용하려면 큰따옴표(")로 묶어서 사용
  ### 다음의 문제의 빈칸에 들어갈 말로 올바른 것은?
 > employees 테이블에서 사원번호(employee_id), 성(first_name), 이름(last_name) 출력하되, 중복없이 출력하고 성을 기준으로 오름차순으로 정렬하라
 ```SQL
 [    ]
 FROM employees
 [    ]
 ```
 > 시간이 된다면 아래의 문제도 풀어보시길!
 ```SQL
 1. employees 테이블에서 중복을 제외한 department_name을 department으로 이름을 변경하여 오름차순으로 출력하는 SQL 명령문을 작성해보세요.
 2. orders 테이블에서 중복을 제외한 order_date를 date로 이름을 변경하여 내림차순으로 출력하는 SQL 명령문을 작성해보세요.
 3. products 테이블에서 중복을 제외한 category를 category_type으로 이름을 변경하여 오름차순으로 출력하는 SQL 명령문을 작성해보세요.
 ```

## 6) 데이터 값 연결하기
`[열 이름] || [열 이름] 또는 [열 이름] or '[문자]'`
 - 각 열에 담겨 있는 데이터 값을 하나로 붙이거나 추가 수식을 붙여 출력할 때 사용
- 열과 열을 합쳐서 데이터를 출력 할 때 사용하는 경우에 사용한다
 - 문자를 붙일때는 작은 따옴표를 사용한다
  ### 다음의 문제의 빈칸에 들어갈 말로 올바른 것은?
 > employees 테이블에서 employee_id 를 출력하고 first_name과 last_name을 붙여서 출력하기
 ```SQL
 [    ]
 FROM employees;
 ```
 > 시간이 된다면 아래의 문제도 풀어보시길!
 ```SQL
 1. employees 테이블에서 employee_id를 출력하고, first_name과 last_name을 붙여서 출력 하되,가운데 한 칸을 띄워주기. 다음 열에는 email을 출력하되 @company.com 문구를 붙여서 출력하기
 2. employees 테이블에서 first_name과 last_name을 합쳐서 full_name이라는 새로운 컬럼으로 출력하세요.
 3. departments 테이블에서 department_name과 location_id를 합쳐서 department_location이라는 새로운 컬럼으로 출력하세요.
 4. orders 테이블에서 order_id와 customer_id를 합쳐서 order_customer_id라는 새로운 컬럼으로 출력하세요.
 ```

## 7) 산술 처리하기(데이터 값끼리 계산)
`SELECT [열 이름] 산술 연산자 : +, -, *, / [열 이름]`
 - 데이터를 사전에 가공하거나 리포트를 작성할 목적으로 계산 시 산술 연산자 사용
 - 산술 표현식 : 열 이름, 숫자, 날짜, 산술 연산자 등을 포함할 수 있음
  ### 다음의 문제의 빈칸에 들어갈 말로 올바른 것은?
 > employees 테이블에서 employee_id, salary, salary에 500을 더한 값, 100을 뺀 값, 10%를 추가해서 2로 나눈 값을 출력하시오
 ```SQL
 [    ]
 FROM employees;
 ```
 > 시간이 된다면 아래의 문제도 풀어보시길!
 ```SQL
 1. employees에서 employee_id를 '사원번호', salary를 '급여', salary+500을 '추가급여' salary-100을 '인하급여', (salary*1.1)/2를 '조정급여'로 출력하세요
 2. orders 테이블에서 order_id와 order_total_amount를 더한 값을 total이라는 컬럼으로 출력하세요.
 SELECT order_id + order_total_amount AS total
 FROM orders;
 3. employees 테이블에서 salary와 commission_pct를 곱한 값을 total_compensation이라는 컬럼으로 출력하세요.
 SELECT salary * commission_pct AS total_compensation
 FROM employees;
 4. products 테이블에서 product_price와 product_quantity를 곱한 값을 total_sales라는 컬럼으로 출력하세요.
 SELECT product_price * product_quantity AS total_sales
 FROM products;
 ```

# 2. WHERE 조건 절을 활용한 데이터 검색
```SQL
SELECT 열 이름 <- 출력하려는 열
FROM 테이블 이름 <- 참조하려는 테이블
WHERE 원하는 조건; <- 조건식
```
> 참조하려는 테이블로부터 해당 조건식으로 열을 선택하여 조회한다는 의미
 - 사용자가 원하는 데이터를 조회할 때 사용하는 WHERE 절
 - 조건을 지정해 데이터 값을 **'어디에서 어떻게'** 가져올지를 정함
 - 특징
    1. 조회하려는 조건을 지정할 수 있다
    2. FROM 절 다음에 위치해야한다
    3. 수행될 조건 절에는 비교-SQL-논리 연산자, 열 이름, 표현식, 숫자 문자 등을 사용할 수 있다
 - 연산자의 우선순위(데이터 조회 속도에 영향, 이것은 고급 영역이라 신경 X)
    괄호 > 부정 연산 > 비교 연산 > SQL 연산
    - 논리 연산자는 NOT, AND, OR 순으로 처리 된다

## 1) 비교 연산자
 ### 등호 연산자 =
 > employee_id 가 100인 직원 정보를 출력하시오
 ```SQL
 SELECT [      ]
 FROM employees
 [              ]
 ```
 > employees 테이블에서 first_name이 David인 직원 정보를 출력하시오
  ```SQL
 SELECT [      ]
 FROM employees
 [              ]
 ```

 ### 부등호 연산자 >, >=, <, <=
 > employees 테이블에서 employee_id가 105 이상인 직원 정보를 출력하세요.
 ```SQL
 SELECT [   ]
 FROM employees
 [              ]
 ```
 
## 2) SQL 연산자
 - SQL 연산자는 비교 연산자보다 조금 더 확장된 연산자로 자주 쓰이는 연산자다
 ### BETWEEN 연산자
 `SELECT [열 이름] FROM [테이블 명] WHERE [열이름] BETWEEN [값1] AND [값2];`
 - 두 값의 범위에 해당하는 행을 출력할 때 사용
 - 값1 이상 값2 이하의 값을 조회하라는 의미로 `>=' 와 '<=' 연산자를 함께 사용한 것과 같다
 > employees 테이블에서 salary가 10,000 이상이고 20,000 이하인 직원 정보를 출력하세요
 ```SQL
 [          ]
 FROM employees
 [             ]
 ```

 ### IN 연산자
 `SELECT [열 이름] FROM [테이블 명] WHERE [열이름] IN(값1, 값2, 값3, ...);`
 - 조회하고자 하는 데이터 값이 여러 개일 때 사용
 - = 연산자와 유사한 기능이지만 데이터 값을 여러 개 지정할 수 있는 특징이 있음
    (다중 행 연산자라고도 부름)
 > employees 테이블에서 salary가 10000, 17000, 24000인 직원 정보를 출력하세요
 ```SQL
 [          ]
 FROM employees
 [             ]
 ```

 ### LIKE 연산자
 `SELECT [열 이름] FROM [테이블 명] WHERE [열이름] LIKE '% or _';`
 - 웹 게시판에서 '제목으로', '내용으로' 라는 검색 방법을 선택하고 검색 내용을 넣는 경우를 생각하자
 - 이러한 기능을 구현할 때는 데이터베이스 조작부에 LIKE 연산자를 사용한 SQL 문을 적용한다
 - 조회 조건 값이 명확하지 않을 때 사용. '~와 같다' 라는 의미
 - 조건에는 문자나 숫자를 포함할 수 있다
 - %나 _ 같은 기호 연산자와 함께 사용한다
    - % : 모든 문자
    - _ : 한 글자
 > employees 테이블에서 job_id 값이 AD를 포함하는 모든 데이터를 조회하세요
 ```SQL
 [          ]
 FROM employees
 [             ]
 ```
 > employees 테이블에서 AD를 포함하면서 AD 뒤에 따라오는 문자열이 3자리인 데이터 값을 갖는 직원 정보(job_id)를 조회화세요(AD+3자리 데이터 값)
 ```SQL
 [          ]
 FROM employees
 [             ]
 ```

 ### IS NULL 연산자
 `SELECT [열 이름] FROM [테이블 명] WHERE [열이름] IS NULL;`
 - 데이터 값이 null인 경우를 조회하고자 할 때 사용
    - null 은 값이 지정되지 않아서 알 수 없는 값을 말한다
    - 0이나 공백(space)과는 엄연히 다름(0은 숫자값, 공백은 문자값)
 > employees 테이블에서 manager_id 가 null 값인 직원 정보를 출력해보세요
 ```SQL
 [          ]
 FROM employees
 [             ]
 ```
 > 시간이 된다면 아래의 문제도 풀어보시길!
 ```SQL
 BETWEEN 연산자 예제:
 1. products 테이블에서 product_price가 100에서 500 사이인 제품들을 출력하는 SQL 작성
 2. orders 테이블에서 order_date가 2022년 1월 1일부터 2022년 3월 31일 사이인 주문들을 출력하는 SQL 작성

 IN 연산자 예제:
 1. employees 테이블에서 department_id가 10, 20, 30인 사원들을 출력하는 SQL 작성
 2. orders 테이블에서 customer_id가 'C001', 'C002', 'C003'인 주문들을 출력하는 SQL 작성
 
 LIKE 연산자 예제:
 1. employees 테이블에서 last_name이 'Smith'로 끝나는 사원들을 출력하는 SQL 작성
 2. products 테이블에서 product_name에 'Apple'이라는 단어가 포함된 제품들을 출력하는 SQL 작성

 IS NULL 연산자 예제:
 1. employees 테이블에서 manager_id가 NULL인 사원들을 출력하는 SQL 작성
 2. orders 테이블에서 delivery_date가 아직 지정되지 않은 주문들을 출력하는 SQL 작성
 ```