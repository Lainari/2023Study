# Chp 2. 기본 문법 배우기
 

 ## 2.1 코드 작성 규칙

 ### 세미콜론(Semi-Colon, ;)
 - 한 문장의 끝을 의미
    - 자바스크립트에서는 하나의 명령이 끝날 때 세미콜론을 붙여도 되고 붙이지 않아도 된다
    - 하지만, 일부 명령에서는 가끔 에러가 발생하므로 혹시 모를 에러 발생을 방지하고 통일성을 위해
    - ***모든 명령어*** 뒤에 세미콜론을 붙이는 것이 에러를 방지하는 좋은 습관이다

 ### 주석(Comment, // Comment or /* Comment */)
 - 사람만 알아볼 수 있도록 설명을 작성한 부분
    - 주석은 코드에 영향을 미치지 않는다 (컴퓨터는 무시하고 넘어가게 됨)
    - 코드에 관한 자세한 설명을 작성하거나 특정 코드를 임시로 사용하지 않게 할 때 사용
    - 더 나아가, 다른 사람이 작성한 코드를 볼 때 코드에 관한 별도의 설명이 없으면 코드를 이해하기 어려움
    > 따라서 해당 코드를 이해할 수 있도록 부가 설명해주는 주석을 달아주는 것이 좋다

 ### 들여쓰기(Indent)
 - Default 로는 Tab 인 스페이스 4칸, 또는 2칸으로 정의한다
 - 빈 공간이 다른 의미가 있는 부분의 시작점이라는 것을 다른 사람에게 알려줄 수 있음
 - 코드 실행에는 아무런 문제가 없지만, 코드의 가독성(코드를 읽고 이해하기 쉬운 정도)이 향상 된다
 > 따라서 들여쓰기를 규칙적으로 하기를 권장한다

 ## 2.2 자료형(Data Type)
 - 값의 종류를 의미하며, 값(value)은 프로그램이 조작할 수 있는 데이터를 의미함

 ### 2.2.1 기본 자료형(Primitive Type)
 - String
 - Number(int, float, long, short, double 등)
 - Boolean
 - Undefined

 ### 2.2.2 객체 자료형(Object Type) : 사용자 정의 자료형
 - 배열형
 - null
 - 사용자 정의 객체(Object)

 ### 2.2.3 Symbol 형 (Symbol Type)

 ### 문자열(String)
 - 하나의 글자를 문자라고 하며 문자들이 하나 이상 나열되어 있는 것이 ***문자열***이라고 한다

 > 표현하는 방법
  1. ''(따옴표)   : 보통 주로 사용하는 방법
  2. ""(쌍따옴표) : 따옴표와 같이 주로 사용
  3. ``(백틱) : 내부에 따옴표, 쌍따옴표, 변수(${변수명})를 사용할 수 있다
    - ***탬플릿 문자열***이라고도 하며, 개행(\n), 따옴표, 쌍따옴표 등 입력한 대로 문자열 처리가 가능하다
 - ('', "", ``) : 띄워쓰기도 없이 작성하게 된다면 빈 문자열이라고 함

 > 문자열 내에서 특수한 문자를 표기하기 위해서는 ``(백틱) 이나 ***이스케이프 문자열(\)*** 을 사용한다
  **이스케이프 문자열** (.length 시 return 값은 1, 즉 문자 1개로 취급된다)
  - \n : 줄바꿈
  - \t : 수평탭
  - \b : 벡 스페이스
  - \' : 싱글 쿼테이션(따옴표)
  - \" : 더블 쿼테이션 (쌍따옴표)

 > 문자열의 연결(합치기) : + 연산자 활용
 ```Javascript:Example
"안녕" + "하세요"; // 안녕하세요 
 ```
  - 만약, 문자열끼리의 연산이 아닌 기초자료형(int, float, double, long 등)과 연산하게 된다면?
    - 문자열 + 숫자 => 숫자를 문자열 취급(형 변환)

 > 문자열 -> 숫자 변경
 `parseInt(문자열[,기수]) // 기수 : 표시 진법에 대한 숫자(16진법 - 16, 8진법 - 8)`
 `parseFloat(문자열[.기수]) // [~] 부분은 생략 가능`
 - prompt()를 사용하여 직접 값을 입력할 수 있음
    `typeof parseInt(prompt());`
    - 여기서 prompt(출력문자열) 은 반환 값으로 String 값이 나오는 것을 알 수 있다

 > 문자에 대한 값 : ascii value(unicode 값)
  `문자열`.charCodeAt(); : 해당 문자의 ascii value 값을 return 해주는 메소드
  ```Javascript:Example
    'a'.charCodeAt();
    'A'.charCodeAt();
    'abc'.charCodeAt();
    // 여러 문자가 있을 경우 첫 번째의 문자의 값만 반환

    'abc'.charAt(2);
    // charAt() 메소드를 이용하여 해당 index 번호의 문자를 반환한다

    'abc'.charAt(2).charCodeAt();
    // charAt() 메소드와 CharCodeAt() 메소드를 이용하여 해당 문자 값을 알아낼 수 있다
  ```

 > NaN : Not a Number
 - 숫자가 아님을 나타내는 자바스크립트 리터럴(구체적인 값)

 ### 숫자(Number)
 > 1. 정수
 ```Javascript:Example
 123; // 결과 : 123
 typeof 123; // 결과 : 'number'
 ```

 > 2. 실수(부동소수점)
 ```Javascript:Example
 123.45; // 결과 : 123.45
 5e+4; // 결과 : 5 * 10000 = 50000 -> 지수표기법
 typeof 123.45 // 결과 : 'number'
 ```
 >> 지수표기법(exponential notation) : 매우 큰 숫자나 소수점 아래 자리수가 많을 때 숫자를 표현하는 방식
 - e 뒤에 나오는 숫자만큼 10의 거듭제곱을 하면 원래 숫자가 됨
 - 실수 계산시에는 부동소수점 문제로 인하여 실수 연산에서는 오차가 발생한다
    - 이럴 때는 실수를 정수로 바꿔 계산하고 마지막에 다시 실수로 바꿔 계산을 완료한다

 > 3. 진법표기 숫자
 - 10진수 : 일반적인 숫자 표기
 - 2진수 : 0b(10진수와 구분하기 위해 b를 추가함) + '0' 또는 '1'
 - 16진수 : 0x + '0 ~ 9', 'A ~ F'
 - 8진수 : 0o + '0 ~ 7'

 > 4. 산술 연산자
 - '+' : 덧셈
    - (1) 산술 더하기 : 피연산자가 숫자인 경우
    - (2) 문자열 연결하기 : 피연산자가 ***하나라도*** 문자열이면 문자열로 변경처리
    - (3) 부호 : 단항(피연산자가 하나) 연산
 - '-' : 뺄셈
    - (1) 문자열 - 숫자
        ```Javascript:Example
        'test' - 4; // 결과 : NaN
        '123' - 4; // 결과 : 119 (type : number)
        ```
    - (2) 숫자 - 문자열
        ```Javascript:Example
        4 - '123'; // 결과 : -119 (type : number)
        ```
    - (3) 부호 : 단항(피연산자가 하나) 연산
 - '*' : 곱셈, 여기서부터는 곧바로 문자열을 숫자로 형 변환하여 계산처리함
 - '/' : 나눗셈
 - '%' : 나머지
 - 'a ** b' : a의 b승
 > 연산자 우선순위(Operator Priority)
  - 20 : ()(그룹화)
  - 19 : ., []. new, ()(함수 호출)
  - 18 : new(인수 없이)
  - 17 : ++(후위), --(후위)
  - 16 : !, ~, +(단항), -(단항), ++(전위), --(전위), typeof, void, delete, await
  - 15 : **
  - 14 : *, / , %
  - 13 : +(다항), -(다항)
  - 12 : <<, >>, >>>
  - 11 : <, <=, >, >=, in, instanceof
  - 10 : ==, !=, ===, !==
  - 9 : &
  - 8 : ^
  - 7 : |
  - 6 : &&
  - 5 : !!
  - 4 : ? : (삼항 연산자)
  - 3 : =, +=, -=, **=, *=, /=, %=, <<=, >>=, >>>=, &=, ^=, !=
  - 2 : yield, yield*
  - 1 : ,(쉼표)
  > 같은 레벨의 연산자 : 왼쪽이 더 우선 순위가 높다고 판정
  > 예외 : 단항 연산자와 대입 연산자(=) 는 오른쪽에 있는 것이 더 우선순위가 높다고 판정

### 불 값
> true / false 를 반환하는 값
- 숫자로 취급하면 '1', '0'으로 반환되며 비교연산의 결과나 논리연산의 결과로서 사용된다

> false로 처리되는 경우
- 0, undefined, null, NaN(Not a Number), '' : 빈문자열

> true로 처리되는 경우
 - false로 처리되는 경우를 제외한 나머지들

```Javascript:Example
// 전부 false 반환
if(0) {console.log('t');}else{console.log('f');};
if(null) {console.log('t');}else{console.log('f');};
if(NaN) {console.log('t');}else{console.log('f');};
if('') {console.log('t');}else{console.log('f');};
'abc' < 5; // 문자'열'은 숫자로 바꾸면 NaN, NaN과의 비교는 false

// NaN 과 NaN 비교 : 이것만 False로 반환
NaN == NaN
NaN === NaN

// -----------------------------------------------------

// 전부 true 반환
if(1) {console.log('t');}else{console.log('f');};
if(12) {console.log('t');}else{console.log('f');};
// 0이 아닌 다른 값이 들어가면 T 반환
if(' ') {console.log('t');}else{console.log('f');};
// 공백(blank)가 들어있어서 반환값은 T
true > false
'b' > 'a';
'ad' > 'ab';
'ab' > 'a';
'3' < 5;  // 문자를 숫자형으로 변환

// null 끼리 비교는 true
null == null
null === null

// undefined 끼리 비교는 true
undefined == undefined
undefined === undefined

```
> == 와 ===
- 공통점 : 값을 비교한다
- 차이점
    - ==  : '값' 만 비교한다
    - === : '자료형'까지 비교한다

```Javascript:Example
    '1' == 1;
    '1' === 1;
    1 != '1';
    1 !== '1';
```
- 자료형까지 비교해주는 === 연산자를 사용하는 것이 바람직하다!

> 비교연산자
- '>'   : 보다 크다
- '<'   : 보다 작다
- '>='  : 보다 크거나 같다
- '<='  : 보다 작거나 같다
- '=='  : 와 같다(값이)
- '===' : 와 같다(자료형과 값이)
- '!='  : 와 같지 않다(값이)
- '!==' : 와 같지 않다(자료형과 값이)

> 논리 연산자
- '&&(AND)' : ~하고
- '||(OR)'  : ~이거나
- '!(NOT)'  : ~이지 않다 


### 무한 값(Infinity)
 - 무한이라는 수를 표현하는 값이며, 숫자를 0으로 나눈 결과
 - 음수를 0으로 나눌 경우 -Infinity 값이 나온다
 - 사칙연산을 하더라도 결과 값이 Infinity가 나오는 특징을 가지고 있지만, 무한 값끼리 계산 시 NaN 결과가 나온다

 ### 빈 값 사용하기

 > Null
 - 값이 없다
 - 데이터 타입을 'Object' 를 지님
 - falsy value 취급 (null == false; // 결과 : false, null == true; // 결과 : false)

 > Undefined
 - 값이 없다
 - 데이터 타입을 'Undefined' 를 지님
 - falsy value 취급 (undefined == false; // 결과 : false, undefined == true; // 결과 : false)

 ```Javascript:Example
    typeof null; // 결과 : object    <-- javascript 의 유명한 버그
    typeof undefined; // 결과 : undefined <-- 따라서 undefined 를 사용하는 것이 바람직함

    null == false; // 결과 : false
    null == true; // 결과 : true

    undefined == false; // 결과 : false
    undefined == true; // 결과 : false
 ```

 > JS : undefined 를 기본값으로 취급, 빈값 표현은 undefined 로 권장됨


 ## 2.3 변수(Variable)

 ### 변수(Variable) 이란?
 - 변하는 수라는 뜻이며 프로그램 실행 시 값을 임시로 저장하는 데이터 장소를 뜻함
 > 관례 : 변수는 선언과 초기화 후에 사용하는 것을 권장한다

 ### 선언(Declaration)
 - 변수를 만드는 행위
 - 선언은 다음과 같이 진행된다
 `var(let, const) 변수명 = 식;`
 - var, let, const 으로 시작하는 명령을 선언문이라고 하고, 변수명을 지정한다
 - 그 다음 변수를 선언함과 동시에 값을 대입하는 행위를 하는데, 이를 ***초기화(initialization)***이라한다

  > [함수 Scope : var]
   - var : 변수를 선언하는 선언문의 일종
   - 변수(Variable)의 줄임말로, 이해하기 어려운 특성 떄문에 const 와 let 을 사용하여 변수를 선언한다
   - var로 변수를 선언하면 특별히 ***변수문(Variable Statement)***이라고 한다
   - 특성
      - 같은 변수명으로 여러번 선언 가능
      - 예약어(아래 후술)나 다름 없는 이름으로 변수명으로 사용할 수 있다
   
   > [블록 Scope : let, const]
   - let : 선언문의 일종
   - const : 상수(Constant)의 줄임말, 변하지 않는 수라는 뜻으로 값이 바뀌지 않는다
      - 그러니 const로 선언한 상수에 값을 쓰게 되면 에러가 발생한다
      - 하지만 특이하게도 나중에 배우는 객체의 내부 값에는 상수의 개념이 적용되지 않는다
      - 따라서 const도 변수라고도 부르지만 앞으로 나올 특성을 가진 변수라고 생각하자
      - 또한 const로 선언문을 사용할 경우 초기화 하지 않으면 에러가 발생한다(값 변경이 안되기 때문)

 > 변수 저장 : 변수의 이름과 값은 컴퓨터의 메모리에 저장된다
   - 메모리는 힙(Heap)과 스택(Stack)으로 구성되어 있는데, 두 메모리는 다음의 특징을 갖는다
      - 힙(Heap) 메모리는 프로그래머가 직접 공간을 할당, 해제하는 메모리 공간
      - 스택(Stack) 메모리는 프로그램이 자동으로 사용하는 임시 메모리 영역 <지역 및 매개 변수가 저장되는 영역>
        함수 호출이 완료되면 사라진다
   - 메모리에 저장된 변수를 호출하려면 해당 변수의 이름을 호출하면 그 변수의 값을 불러올 수 있다
   - 만약 값을 대입하지 않은 변수를 호출하게 되면 ***undefined***가 출력된다

 > 변수 선언 : 이름 지정
   - 변수명은 변수의 값이 무엇인지 알려주는 역할을 하기 때문에 자세하게 짓기를 권장하고 있다
   - 제약사항 : 특수문자는 $와 _만 사용할 수 있으며, 숫자로 시작해서는 안 된다
   - 또한 변수명으로 사용할 수 없는 단어인 ***예약어(Reserved word)***가 있다
      - let, null, var, if, case, default, do, false, ... 등
      - JS의 키워드라고 생각하자

 > 변수 수정 : 값을 변경한다
   - 변수의 정의가 변하는 수라면, 값을 변경할 수 있단 뜻이다
   ```Javascript
   let change = '바꿔 봐';
   ```
   - 따라서 해당 변수의 값을 바꾼 결과를 확인해보면
   ```Javascript
   change = '바꿨다';
   change;
   // 결과 : "바꿨다"
   ```
   - 처음 let으로 변수를 선언할 떄는 결괏값이 undefined 이지만 변수의 값을 바꿀 때는 결과로 바꾼 값이 나오는데
     이는 let의 역할 때문이다. let이 없을 때는 코드가 ***식***이라서 대입한 값이 결과값으로 출력되지만
     let이 앞에 붙는 순간 선언문이 된다
     여기서 ***문(statement)***이라는 개념이 되는데 이는 식과 다르게 결괏값이 없고 식의 자리에 사용할 수 없다
      - 문(Statement) : 해당하는 문장에 대한 실행
      - 식(Expression) : [실행과 결과]를 모두 일컬는 말

 ## 2.4 조건문

 ### 조건문 : if
 - 조건문 : 주어진 조건에 따라 코드를 실행하거나 실행하지 않는 문
 - if 뒤에 나오는 소괄호 안에 조건(식)을 넣고, 다음 줄에 실행문을 넣으면 된다
 - 조건식이 참인 값이면 내부의 실행문이 실행되고 거짓인 값이면 실행문이 실행되지 않는다
 - 실행 문장이 하나인 경우에는 중괄호는 생략 가능하지만, 권장하지 않는다
 ```Javascript:형식
 if(조건식)
   실행문;
 // 둘 이상의 실행문들인 경우 중괄호로 묶기
 if(조건식){
   실행문1;
   실행문2;
   실행문3;
 }
 ```
 - 또한 이러한 조건문으로 변수의 값을 바꿀 수 있다
 ```Javascript:예시
 let value = '사과'; 
 let condition = true;
 if(condition){
   value = '바나나';
 }
 console.log(value);
 // 결과 : 바나나
 ```

 - else를 사용하거나 else if 를 사용하여 여러 방향으로 분기할 수 있다
 ```Javascript:else & else if
 // else 이용
 if(조건식){
   // 조건식이 참인 값일 때 실행
   실행문;
 }else{
   // 조건식이 거짓일 때 실행
   실행문;
 }

 // else if 문 이용
 if(조건식){
   실행문;
 }else if(조건식2){
   실행문;
 }else if(조건식3){
   실행문;
 } else if ... // else if를 여러 개 사용할 수 있다
 else{
   실행문;
 }
 ```

 - 중첩 조건문(Nested Condition Statement)
   - 조건문 내부에 조건문이 존재하는 경우
   - 상당히 복잡해지므로 최소화된 if 문을 사용하도록!!

 ### 조건문 : switch 문
 - 조건이 충족되면 실행된다는 if문과 같은 성질을 갖고 있음
 ```Javascript:Switch 문
 switch(조건식){ // 이 조건식의 값이 case의 비교 조건 식 값과 일치(==)하면 해당 실행문이 실행 됨
 // 보통 조건식에 변수를 넣고
    case 비교 조건식: // 비교 조건식에는 변수와 비교할 값을 넣음
       실행문;
 }

 // 예시
 let Value = 'A';
 switch(value){
    case 'A':
       console.log('A');
 }
 // 결과 : A
 ```
 - case를 여러 번 사용하여 else if 문처럼 여러 방향으로 분기할 수 있으나, 이 경우 특수한 상황이 발생한다
 > switch 문은 일치하는 case를 발견하면 일치 여부와 상관없이 그 아래 case 들의 실행문을 모두 실행함!
    - 이러한 현상을 막기 위해 각각의 case에 break 문을 사용하여 case에서 빠져 나오도록 한다
 ```Javascript:예시
 let value = 'B';
 switch(value){
    case 'A':
       console.log('A');
       break;
    case 'B':
       console.log('B');
       break;
    case 'C':
       console.log('C');
       break;
    // 결과 B
 }
 ```
 - 어떠한 case도 일치하지 않을 때 실행하는 case 도 만들 수 있다(else 역할)
    - ***default***라는 특수 예약어 사용
    - else 의 역할을 하지만 else와 다른 점은 ***default는 어디에나 위치할 수 있음***
 ```Javascript:switch-default
 let value = 'F';
 switch(value){
    case 'A':
       console.log('A');
       break;
    case 'B':
       console.log('B');
       break;
    case 'C':
       console.log('C');
       break;
    default:
       console.log('아무것도 일치하지 않음')
    // 결과 '아무것도 일치하지 않음'
 }
 ```
 ```Javascript:switch & if문 비교
 let fruit = '사과';

 // if문
 if(fruit === '사과'){
     console.log('사과입니다!');
 }else if(fruit === '배'){
     console.log('배입니다!');
 }else if(fruit === '포도'){
    console.log('포도입니다!');
 }else{
    console.log('뭔지 모르겠습니다!');
 }

 // switch 문
 switch(fruit){
    default:
       console.log('뭔지 모르겠습니다!');
       break;
    case '사과':
       console.log('사과입니다!');
       break;
    case '배':
       console.log('배입니다!');
       break;
    case '포도':
       console.log('포도입니다!');
       break;
 }
 ```
 > 위의 예문 같은 결과 값이 나오므로 우리는 if 문과 switch 문을 바꿔가며 사용할 수 있어야 한다 


 ### 조건문 : 조건부 연산자 사용하기
 - if 문과 switch 문 외에도 분기 처리에 사용하는 식 (삼항 연산자라고도 부름)
 `조건식 ? '참일 때 실행되는 식' : '거짓일 때 실행되는 식'`
 > 조건부 연산자는 문이 아니라 식이므로 결과값이 나온다! : boolean
 - 해당 조건부 연산자를 if 문과 비교하여 사용해보는 연습을 합시다!
 ```Javascript:3항 연산자
 // 3항 연산자의 경우
 let condition = true;
 let value = condition ? '참' : '거짓'; // return 참
 console.log(value); // 참 

 // if문의 경우
 if(condition){
    value = '참';
 }else{
    value = '거짓';
 }
 console.log(value); 
 
 // 중첩 조건문의 경우
 let condition1 = true;
 let condition2 = false;  
 
 // 3항 연산자의 경우
 let value = condition1 ? condition2 ? '둘 다 참' : 'condition1만 참' : 'condition1이 거짓';
 console.log(value); 
 
 // if문의 경우
 if(condition1){
    if(condition2){
       value = '둘 다 참'
    }else{
       value = 'condition1만 참';
    }
 }else{
    value = 'condition1이 거짓';
 }

 // 또 다른 예시
 let condition1 = false;
 let condition2 = true;
 let value = condition1 ? 'condition1이 참' : condition2 ? 'condition2가 참' : '둘 다 거짓';
 console.log(value);

 if(condition1){
    value = 'condition1이 참';
 }else if(condition2){
       value = 'condition2가 참';
    }else{
       value = '둘 다 거짓';
    }
 ```
 > 위와 같은 예제를 통해 if문을 switch문, 조건부 연산자로 바꿀 수 있는 능력을 키울 수 있다
 - 다음의 퀴즈를 한번 풀어볼까요
 ```Javascript:퀴즈퀴즈
 let condition = true;
 let value = '';
 if(condition){
    value = '참';
 }else{
    value = '거짓';
 }
 ```
 > switch 문의 경우는 아래와 같습니다
 ```Javascript:switch 문
 let condition = true;
 let value = '';
 switch(condition){
    case true:
       value = '참';
       break;
    case false:
       value = '거짓';
       break;
 }
 ```
 > 조건부 연산자의 경우는 아래와 같습니다
 ```Javascript:조건부 연산자
 let condition = true;
 let value = condition ? : '참' : '거짓';
 ``` 

 ## 2.5 반복문

 ### 반복문 : while 문
 ```Javascript:while문
 while(조건식){
    실행문1;
    [실행문2;
    ...]
 }
 ```
 - while 문은 조건식이 참인 동안 반복해서 실행문을 실행합니다
 - 조건식이 참인 동안 계속 반복하게 되므로 무한 반복되는 상황을 방지해야한다
    - 따라서 조건식을 false로 만들게 유도한다
 ```Javascript:while문 무한반복 방지
 // 무한반복 상황
 while(true){
    console.log('Hello, World!');
    // 결과 : (...) Hello, World! -> 웹 비정상동작 : 웹 프로그램 종료해야함
 } 
 
 // 무한반복 방지
 let i = 1;
 while(i<=100){
    console.log('Hello, World!');
    i++;
 } // 결과 : (100) Hello, World!
 ```
 - 위처럼 무한 반복을 멈추기 위해 실행문의 범위를 지정하여 false를 유도하게 만든다
 - 이때 변수에 값을 넣어 범위를 지저앟ㄹ 때 1보다는 0을 많이 넣는다
    - 그 이유는 프로그래밍에서는 숫자를 0부터 세기 때문이다(index원리)

 ### 반복문 : do while문
 - while 문과 비슷하나 조건에 상관없이 ***일단 한번은 실행***하고 추후 반복은 조건을 판단하고 실행
 ```Javascript:do-while
 do{
    실행문;
    ...
    맨마지막 -> 조건식의 값 변화에 영향을 끼치는 문장;
 }while(조건식);
 ``` 

 ### 반복문 : for문
 ```Javascript:for문
 for(시작; 조건식; 종료식){
    실행문;
    ...;
 }
 ```
 > for 문의 소괄호에는 세 가지 요소가 들어감
 1. 시작(식과 변수 선언)
 2. 조건식 : while 의 조건식과 동일
 3. 종료식 : 조건식의 값 변화에 영향을 끼치는 문장
 - 이러한 구조를 통해 for 문이 반복되는 순서를 알 수 있다. while문과 순서를 비교해보자
 ```Javascript:for & while
 for(let i = 0; i < 100; i++){
    console.log('Hello, for!');
 } // i 를 선언하고, 조건식을 비교한다. 이때 조건식이 참일 경우 실행문이 동작되고 종료식을 실행하고
 // 이 과정을 조건문이 거짓이 될 때까지 반복한다

 let i = 0;
 while(i < 100){
    console.log('Hello, while!');
    i++;
 }
 // i 를 먼저 따로 선언한다. while 문안의 조건식을 비교하고 참일 경우 아래의 실행문을 실행하는 과정을 반복
 // 이후 조건식이 거짓일 경우 while 문이 종료된다
 ```

 > while 문과 for 문의 차이점을 알았으니 퀴즈를 풀어봅시다!
 ```Javascript:1부터 100까지 출력하기 - for & while
 //while
 let i = 0;
 while(i < 100){
    console.log(i + 1);
    i++;
 } 

 // for
 for(let i = 0; i < 100; i++){
    console.log(i + 1);
  }
  ```

 ### break문 과 continue문
 앞에서 switch 에서 사용한 break 문과 continue 문을 알아봅시다
 - break 문
   - break의 의미는 중단한다는 의미로, 실행 block 을 중단하는 문장이라는 뜻을 가진다
      - 실행의 범위 : break 문이 속해있는 block 하나만 중단
      `for()for(){break}`
      - 내부의 for문은 break 문으로 실행이 중단되지만 외부의 for문으로 다시 반복된다
      - break 문은 조건문 뿐만 아니라 반복문에서도 사용된다
 - continue 문
   - break문과 마찬가지로 중단의 의미를 갖는다
   - 하지만 break문과 다르게 continue문은 실행되면 조건문 검사를 실행하게 된다
      - continue 문 아래의 문장들은 무시되고 바로 조건문 검사를 진행하게 됨

 ### 중첩 반복문 사용하기
 - 반복문 안에 반복문이 들어있는 경우를 말함
 - 반복문이 두 번 이상 중첩될 수도 있고, 중첩 횟수가 증가할 수록 코드도 점점 어려워진다
    - 보통 구구단 예제로서 많이 사용된다
 ```Javascript:중첩 반복문으로 구구단을 출력해봅시다
 // 구구단을 출력하되, 결과에 짝수가 하나도 나오지 않게 해봅시다! : continue 사용
 for(let multiply1 = 1; multiply1 < 10; multiply1++){
    if(multiply1 % 2 == 0){
       continue;
    }
    for(let multiply2 = 1; multiply2 < 10; multiply2++){
       console.log(multiply1 + ' * ' + multiply2 + ' = ' + (multiply1 * multiply2));
    }
 }
 ```


 ## 2.6 객체
 - **객체(object)** 는 자료형의 일종으로 다양한 값을 모아 둔 또 다른 값을 칭한다
    - 종류 : **배열(array)**, **함수(function)**, 배열이나 함수가 아닌 객체

 ### 배열(Array)
 - 다양한 값을 나열할 수 있는 데이터를 집합적으로 관리할 수 있는 데이터 타입을 칭한다
 - 나열 가능한 데이터는 다음과 같습니다
    - 배열, 객체, 프리미티브 타입, Null, Undefined, Infinity, NaN
 - 배열은 데이터의 중복이 가능하며, 순서에 구애받지 않습니다
 - 또한 배열은 요소와 인덱스로 구성되어 있습니다
    - 요소(Element) : 배열에 저장되는 하나의 데이터
    - 인덱스(Index) : 특정한 요소의 저장 위치
 - 배열을 이용하는 순서는 선언과 정의로부터 시작됩니다
   1. 선언/정의
   - 대괄호 사용 `배열명 = [요소1, 요소2, ... ]`
   - `Array()` 사용 : Array 객체의 생성자
   - `new Array(숫자)` : 빈 배열을 숫자만큼 생성
   - `new Array(요소1, 요소2, ...)` : 요소를 바로 빈배열에 넣어 생성하는 방법
   - 예제를 통해 한번 생성해봅시다
   ```Javascript:Array Example
   var Num = 10;
   Array(num); // 빈 배열을 Num 만큼 생성

   const fruits = [`🍇`,`🍈`,`🍉`,`🍊`,`🍋`,`🍌`];
   // 결과 (6) ['🍇', '🍈', '🍉', '🍊', '🍋', '🍌']

   const fruits1 = new Array(6);
   // 결과 (6) [empty × 6]

   const fruits2 = new Array(`🍇`,`🍈`,`🍉`,`🍊`,`🍋`,`🍌`);
   // (6) ['🍇', '🍈', '🍉', '🍊', '🍋', '🍌']
   ```
   - 배열 내에 배열 요소가 저장되도록 할 수 있는데 이를 이중 배열(이차원 배열)이라고 합니다
   - 배열 안에 배열 요소가 더 들어갈수록 한층의 차원이 증가되어 다중 배열(다차원 배열)이 됩니다
   2. 사용
   > 배열의 요소 개수(배열의 크기) 구하기
   - 앞에서 만든 배열의 요소 개수를 구하는 방법으로, 배열 이름 뒤에 `.length`를 붙이면 됩니다
   ```Javascript
   const everything = ['사과', 1, undefined, true, '배열', null];
   console.log(everything.length);
   // 결과 : 6

   // 빈 값도 유효한 값이기 때문에 요소 개수를 셀 때 포함됩니다
   const emptyValue = [null, undefined, false, '', NaN];
   console.log(emptyValue.length);

   // 결과 : 5
   ```
   > 배열의 맨마지막 요소의 인덱스
   - 배열의 크기는 항상 `배열명.length`크기를 가지고 있으므로 마지막 요소의 인덱스는 `배열명.length-1`가 된다
   ```Javascript:배열의 요소 찾기
   const arr = [1, 2, 3, 4, 5];
   // 해당 배열의 마지막에서 세 번째 요소를 찾으시오
   console.log(arr.length-3);
   // 결과 : 3
   ```

   > 배열 요소 : 읽기, 쓰기, 수정, 삭제
   - 배열 요소 읽기
      `배열명[인덱스]`
   - 배열 요소 쓰기
      `배열명[인덱스] = 쓸 값`
   - 배열 요소 수정
      `배열명[인덱스] = 쓸 값`
   - 배열 요소 삭제
      `delete 배열명[인덱스]`
      - 해당 요소를 empty 화 -> 배열의 길이가 줄지 않는 특징을 가짐
   
   > 배열의 추가 : 배열의 길이가 변경됨
   - 맨 마지막에 추가
      `배열명[배열명.length] = 추가값`
      `배열명.push(추가값)`
   - 맨 앞에 추가
      `배열명.unshift(추가값)`
   - 예시
   ```Javascript:Array Example
   const target = ['a','b','c','d','e'];
   target.push('f'); // target[target.length] = 'f';
   target.unshift('aa');
   console.log(target);

   // 결과 : target=['aa','a','b','c','d','e','f']
   ```
   > const 인데 수정 가능한 이유가 뭘까?
   - 앞에서 **상수 만들기**에서 const가 엄밀히 상수가 아니라고 했는데, 이는 바로 여기서 확인했듯이
     const에 객체(배열, 함수, 객체 리터럴)가 대입되면 객체 내부의 속성이나 배열의 요소는 수정할 수 있기 때문이다

   > 배열의 삭제 : 배열의 길이가 변경됨
   - 맨 마지막 삭제
      `배열명.pop()`
   - 맨 앞에 삭제
      `배열명.shift()`
   
   > 배열의 삽입과 삭제를 동시에 하는 .splice()
   `배열명.splice(시작 index[, 삭제 요소 갯수[, 추가할 요소들]])`
   - 해당 splice 의 요소를 하나씩 구현해보면 다음과 같은 의미를 갖는다
      `배열명.splice(시작 index)` : 시작 index 에서 배열 끝까지 삭제
      `배열명.splice(시작 index, 삭제 요소 갯수)` : 시작 index에서 지정한 갯수만큼 삭제
      `배열명.splice(시작 index, 삭제 요소 갯수, 추가할 요소들)` : 시작 index에서 지정한 갯수만큼 삭제하고, 추가요소 삽입
   
   > 배열의 검색 .includes(), indexOf(), lastIndexOf()
   `배열명.includes(검색할 요소)` : 반환값으로 boolean을 갖는다
      - 해당 요소가 있는지에 대해 참, 거짓의 결과를 반환
   `배열명.indexOf(검색할 요소)` : 반환값으로 index 값을 갖는다
      - 맨 처음부터 검색하여 검색에 성공한 최초의 인덱스를 반환
      - 찾지 못했다면 -1 값을 반환한다
   `배열명.lastIndexOf(검색할 요소)` : 반환값으로 index 값을 갖는다
      - 맨 마지막부터 검색하여 검색에 성공한 최초의 인덱스를 반환한다
      - 찾지 못했다면 -1 값을 반환한다
   
   > 배열의 반복
   - for 문 사용
   ```Javascript:Array Repeat
   const fruits = ['apple','banana','pineapple','watermelon'];
   for(let i = 0; i < fruits.length; i++){
      console.log(fruits[i]);
   }
   ```
   - for ~ in 문 사용
   ```Javascript:Array Repeat
   const fruits = ['apple','banana','pineapple','watermelon'];
   for(let i in fruits){ // fruits 배열에 있는 원소를 i 에 대입하여 해당 반복문을 구동
      console.log(fruits[i]);
   }
   ```
   - 이러한 반복 기능은 다른 기능을 추가하여 반복문을 활용할 수 있다
   ```Javascript:퀴즈퀴즈
   const arr = ['가','라','다','라','마','라'];
   // 위의 배열의 '라'를 모두 제거하세요. indexOf 와 splice를 사용해봅시다!
   let findWordIndex = arr.indexOf('라'); // indexOf로 찾을 원소의 index 번호를 확인한다
   while(findWordIndex > -1){ // 해당 원소가 없다면 -1 를 반환하니 그 값 보다 이상인 경우는 삭제를 진행한다
      arr.splice(findWordIndex, 1); // 하나의 원소를 지우는 splice()
      findWordIndex = arr.indexOf('라'); // 제거한 다음 다음 원소의 index 번호를 확인한다
      // 없다면 -1 반환으로 반복문이 제거된다
   }
   console.log(arr); // 결과 확인
   ```

 ### 함수(Function)
 - 특정한 작업을 수행하는 코드들의 집합(자판기)
 - 함수의 구성
   1. 정의/선언
      - **함수 선언문**
      ```Javascript
      function 함수명(파라미터 리스트){ // 함수의 시그니처, 함수의 헤더
         // 중괄호 부분 ; 함수의 바디
      }
      ```
      - **함수 표현식(function expression)**
      `const 상수명 = function(파라미터 리스트) {};`
         - 이름없는 선언문이라고 하며, 호출할 때는 `상수명(아듀면트리스트)` 로 실행한다
      - ***화살표 함수(arrow function)***
      `const 상수명 = (파라미터리스트) => {};`
      총 3가지 방식으로 함수를 만드는 행위를 함수를 **선언한다(declare)**라고 한다

   2. 호출 : 호출 시 반드시 결과를 반환하는 특징을 가짐
      - `함수명(아규먼트리스트)`
      - `상수명(아규먼트리스트)`

   3. 파라미터와 아규먼트
      - 파라미터(Parameter) : 가인수
         - 함수 선언 시 함수 시그니쳐에 나오는 인수
      - 아규먼트(Argument) : 실인수
         - 함수 호출시 사용하는 인수
   
   4. 반환 : 맨 마지막에 실행되는 작업
      - 함수나 작업의 종료를 의미하며 사용 방법은 다음과 같다
      `return [데이터(변수, 리터널)]` (생략 가능)
      - 만약 반환(Return)을 명시하지 않은 경우 `return undefined;` 인 결과가 나옴
      - 함수에서 호출한 곳의 그 다음으로 실행 순서가 이동된다

   5. 함수내의 사용 변수 : Scope(생명주기)
      - 전역 변수(Global Variable) : 함수 내부와 외부 두 곳에서 사용 가능하다
      - 지역 변수(Local Variable) : 함수 내에서만 사용 가능하다
         - 파라미터는 지역 변수로 취급된다
   
   6. 순수 함수
      - 파라미터와 지역변수/상수 만으로 구현한 함수를 말한다
   
   7. 함수선언과 화살표 함수를 비교해보자
   ```Javascript:Compare Function
      function add1(x,y){ return x + y; }
      const add2 = function(x, y){ return x + y; }
      const add3 = (x, y) => { return x + y };
      const add4 = (x, y) => x+y;
      // add4 : 함수 실행문이 return만 존재하는 경우 중괄호와 return을 생략할 수 있다

      const add4 = (x, y) => (x+y);
      const not = x => !x; // 파라미터가 하나인 경우에는 소괄호도 생략 가능하다
   ```
   - 주의 사항 : this의 의미
      - 화살표 함수 내에서는 인수(arguments)를 사용할 수 없다!

 ## 2.7 객체 리터럴

 ### Object Literal
 - 객체(Object) 는 어떤 특성을 가지는 대상에 대한 여러 변수를 하나의 데이터로 묶은 것이다
 1. 정의 / 선언 / 초기화
   ```Javascript
      const 객체명 = {     // 키1:값1, 키2:값2, ... , 키n:값n 형태를 보임
      속성명1:속성값1,    // property(속성)
      속성명2:속성값2,
      ...
      속성명n:속성값n[,] // 마지막 콤마(,) 생략 가능
      }

      속성명 : 문자열로 지정
      속성값 : 모든 Data type들

      * 속성값이 함수인 경우 : 메서드(Method) : 객체내에 정의된 함수
      ** console.log(문자열) 분석

      // console = 객체
      // log = console 객체의 메서드
      // parameter 가 문자열로 들어간다
      // 실행효과는 화면에 argument로 들어온 문자열을 출력한다
   ```
 2. 사용법
   (1) `.`연산자 이용법
      - 읽기 : `객체명.속성명`
      - 쓰기/수정 : `객체명.속성명 = 값`
      - `객체명.속성명(인수들)`
   (2) 연관배열 이용법
      ```Javascript
         연관배열 이용법
         - 객체명['속성명']
         - 읽기 : 객체명['속성명']
         - 쓰기/수정 : 객체명['속성명'] = 값
         * 메소드 호출 불가
            - 속성 삭제
            - delete 객체명.속성명;
            - delete 객체명['속성명'] ??? (찾아보세용)

         - 연관배열(Associated Array)
         - 연상배열??? (찾아보세용)
         - 연관배열의 index : 문자열
      ```
 3. 객체간 비교/참조/복사
   - 비교
   ```Javascript
      * 객체간 비교
      {} == {}, {} === {} ==> false
      ------------------------------------------
      console.log({} == {}); // 결과 false
      console.log({} === {}); // 결과 false
   ```
   - 참조
   ```Javascript
      - 참조(Reference)
      * 객체에 대한 변수는 해당 객체의 참조값을 저장
      * 참조값 : 메모리(heap 메모리)에서의 주소값
      * primitive type의 변수 : 리터럴 값 저장
      - let a = 'jit';
      - 메모리(stack 메모리)에 값 저장시키고 변수로 별명처럼 사용

      - 객체의 복사
      - 단순 대입으로는 불가
      - const a = {}; const c = a;
      - 참조값의 복사로 a, c는 같은 객체를 참조하고 있음, 객체의 복사가 아님
      - clone()이용 복사해야 함
   ```