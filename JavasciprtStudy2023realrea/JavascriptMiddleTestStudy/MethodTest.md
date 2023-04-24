# 자바스크립트 메소드 예제 문제 풀기

## Chp 1 ~ 2.

### 1. typeof 연산자
> "안녕하세요" 이 문자가 문자열인지 확인하는 연산자로 옳은 것은?

### 2. 문자열 안에서 따옴표 사용하기
> 문자열안에 작은 따옴표를 사용할 때 사용하는 방법을 console 창에서 확인해봐라(3가지)

### 3. 문자열 여러 줄로 나타내기
> 문자열 내에서 문자들을 여러 줄에 걸쳐 나타내는 방법을 기술하라

### 4. 문자열 합치기
> 문자열 "안녕" 과 문자열 "하세요"를 연결하되, 중간에 공백을 포함하여 합쳐라

### 5. 숫자 자료형
> 숫자 자료형의 타입을 나열한 것이다. 이들의 표기법끼리 연결하라
- 2진법, 8진법, 10진법, 지수표기법, 음수표기법, 16진법
- 0b11, 0x1c, 0o15, 10, , -1, 5e4

### 6. 문자열을 숫자로 바꾸기
> 프롬프트로 값을 입력하여 해당 값을 숫자형 타입으로 표출하는 코드를 작성하라(typeof, prompt(), parseInt() 또는 parseFloat 사용)

### 7. parseInt 다른 기수법 적용하기
> 111 를 2진법, 8진법, 16진법으로 표기하는 명령어를 작성하라

### 8. NaN 알아보기
> 다음의 코드 결과를 작성하라
> 1) parseInt(prompt()) // abc 입력
> 2) typeof parseInt('hello ')

### 9. 무한 값 알아보기
> 다음의 코드 결과를 작성하라
> 2 / 0;
> typeof Infinity
> Infinity - 100
> Infinity - Infinity
> 0 / 0

### 10. 문자와 숫자 더하기
> 다음의 코드 결과를 작성하라
> '문자열' + 0
> '1' + 0
> '문자열' - 0
> '9' - 5

### 11. 연산자의 우선순위
> 연산자의 우선순위를 생각하여 3 ** 2 + 1 를 27의 결과로 만들어라

### 12. 실수 계산시 주의점
> 해당 연산의 결과는 0.3이 나오지 않는다. 이 결과가 0.3이 나오기 위해 바꿔라 : 0.1 + 0.2

### 13. 불 값
> 다음의 코드 결과를 작성하라
> NaN == NaN;
> NaN != NaN;
> true > false;
> '3' < 5;
> 'abc' < 5;

### 14. == 와 === 의 차이점
> ==와 ===의 차이점은 (    ) 까지 비교 한다. 빈칸에 들어갈 말은?

### 15. 불 값으로 형 변환
> 다음 연산의 결과가 true가 되게 만들어라(복수정답 있음, 연산자만 추가 또는 수정)
> 5 + 4 * 3 === 27;

### 16. undefined 알아보기
> 다음 코드 결과를 작성하라
> typeof undefined, !!undefined, undefined == false, undefined == 0, undefined == '' 

### 17. null 알아보기
> 다음 코드 결과를 작성하라
> typeof null, undefined == null, undefined === null, !!null, null == false, null == 0, null == ''
> 또한, 값이 null 인지를 확인할 때 어떤 연산자를 써야하는가?

### 18. 변수 정의
> 값을 저장하고 저장한 값을 불러올 수 있게 하는 것이 ( a ) 이며, ( a )를 만드는 행위를 ( b )라고 한다

### 19. 변수명 짓기
> 변수명 앞에 들어갈 수 없는 이름은?
> 1) $button, 2) _value, 3) !ok, 4) $if 5) 123value

### 20. 상수 만들기
> ( a )는 ( b )의 줄임말로 ( b ) 는 변하지 않는 수라는 뜻이다

### 21. var 사용하기
> a와 b라는 변수에 어떠한 값 1, 2이 들어있습니다. 두 변수의 값을 서로 바꿔보세요

### 22. if문
> 다음 중첩 if문을 if - else 문으로 바꿔라
```Javascript
let first = true;
let second = false;
if(first){
  console.log('첫 번째 조건 충족!');
  if(second){
    console.log('두 번째 조건도 충족!');
  }else{
    console.log('두 번째 조건은 불충족!');
  }
}else{
  console.log('첫 번째 조건 불충족!');
}
```

### 23. switch 문으로 분기하기
> 다음 코드 결과에서 'B' 만 출력되게 수정하라
```Javascript
let value = 'B';
switch(value){
  case 'A':
    console.log('A');
  case 'B':
    console.log('B');
  case 'C':
    console.log('C');
}
```
> 위 코드에서 만약 세 조건을 만족하지 못헀을 때 기본적으로 출력하게 만드는 명령어는?

### 24. switch <-> if 문
> 다음 switch 문을 if문으로 바꿔라
```Javascript
var fruit ='사과';
switch(fruit){
  default:
    console.log('뭔지 모르겠습니다');
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

### 25. 조건부 연산자 사용하기
> 다음 if문을 조건부 연산자로 바꿔라
```Javascript
if(5 > 0){
  console.log('참입니다.');
}else{
  console.log('거짓입니다.');
}

let condition = true;
let value = '';
if(condition){
  value = '참';
}else{
  value = '거짓';
}
```

### 26. if문, switch문, 조건부 연산자
> 다음 if 문을 switch 문과 조건부 연산자로 바꿔 보세요
```Javascript
let condition = true;
let value = '';
if(condition){
  value ='참';
}else{
  value ='거짓';
}
```

### 27. while 문 사용
> while 문을 사용하여 Hello, World! 를 100번 출력하는 코드를 작성하시오

### 28. for 문 사용
> for 문을 사용하여 Hello, World! 를 100번 출력하는 코드를 작성하시오

### 29. while -> for 문 변경
> 다음 while 문을 for 문으로 변경하시오
```Javascript
let i = 0;
while (i < 100){
  console.log(i + 1);
  i++;
}
```

### 30. 짝수만 출력하는 반복문
> 1부터 100까지 짝수만 출력하는 while문과 for 문을 작성하시오

### 31. 짝수 구구단 작성
> 짝수의 구구단만 출력하는 while 문과 for 문을 작성하시오

### 32. 홀수 구구단 작성
> 홀수의 구구단만 출력하는 while 문과 for 문을 작성하되, continue 문을 사용하라

### 33. 객체
> ( a )는 자료형의 일종으로 다양한 값을 모아 둔 또다른 값이며, ( a )의 종류는 크게 ( b ), ( c ), 그 외 나머지로 나눌 수 있다

### 34. 배열과 인덱스
> arr 라는 배열이 있고, 해당 배열은 1, 2, 3, 4, 5 라는 원소를 갖는다. 이때 마지막에서 세 번째 원소를 찾아라

### 35. 배열.unshift(parameter) : parameter를 index 0번에 추가하여 배열의 길이가 1 증가한다
> target 배열이 '나', '다', '마' 라는 원소를 갖고 있고 첫 번째 인덱스 자리에 '가'를 넣는 작업을 진행하라

### 36. 배열.push(parameter) : parameter를 index 마지막 번째에 추가하여 배열의 길이가 1 증가한다
> target 배열이 '가', '나', '다' 라는 원소를 갖고 있고 마지막 번째 인덱스 자리에 '라' 를 넣는 작업을 진행하라

### 37. 배열.pop() : 배열의 마지막 요소가 제거된다
> target 배열이 '가', '나', '다', '라', '마' 라는 원소를 갖고 있고 마지막 번째 인덱스를 제거하는 작업을 진행하라

### 38. 배열.shift() : 배열의 첫 번째 요소가 제거된다
> target 배열이 '아', '가', '나', '다', '라' 라는 원소를 갖고 있고 첫 번째 인덱스를 제거하는 작업을 진행하라

### 39. 배열.splice(start_index, delete_words, insert_word) : 배열의 start 요소부터 delete words 수만큼 제거되고 insert 단어를 삽입한다
> target 배열이 '가', '나', '바', '사', '마' 라는 원소를 갖고 있고 3번째 원소부터 2개 원소를 제거하고 '다', '라' 를 삽입하라

### 40. 배열.includes(parameter) : 배열에 parameter 값이 있다면 true, 없다면 false 값을 return 한다
> target 배열이 '나', '다', '라' 라는 원소를 갖고 있고 첫 번째 원소에 '가' 를 넣고 마지막 원소에 '마' 를 넣은 다음 2번째 원소에서 2개 원소를 제거해라
> 제거한 다음 target 배열에 '다' 원소가 있는지 확인하고 다시 첫 번째, 마지막 요소를 제거하여 결과를 확인하라

### 41. 배열.indexOf(parameter) : 배열에 parameter 값의 index 번호를 앞에서 검색하여 return 한다. parameter 값이 없다면 -1을 return 한다
> target 배열이 '가', '나', '다', '가' 원소를 갖고 있고 '가' 와 '라' 를 앞에서 검색하여 그 index 번호를 구한다

### 42. 배열.lastIndexOf(parameter) : 배열에 parameter 값의 index 번호를 뒤에서 검색하여 return 한다. parameter 값이 없다면 -1을 return 한다
> target 배열이 '가', '나', '다', '가' 원소를 갖고 있고 '가' 와 '라' 를 뒤에서 검색하여 그 index 번호를 구한다

### 43. 배열 반복
> target 배열이 '가', '나', '다' 원소를 갖고 있다. 이 배열의 첫 번째 index 와 마지막 index에 각각 '라' 를 추가한다
> target 배열의 첫 번째 원소로부터 3가지의 원소를 제거한 다음, 각 원소를 '마', '바', '사' 로 교체한다
> 다음, 첫 번째 원소와 마지막 원소를 제거한 다음 '가' 원소가 있는지 확인한다
> '라' 원소를 앞과 뒤에서 검색하여 '라' 원소가 2가지가 있는지 확인한 다음 마지막으로 target 배열의 원소를 하나씩 호출하는 반복문까지 완성하라

### 44. 배열 메소드 활용
> 다음 배열에서 '라' 를 모두 제거하세요. indexOf 와 splice 를 사용하세요.
> const arr = ['가', '라', '다', '라', '마', '라'];

### 45. 함수
> 함수 a, b, c 를 호출하면 'hello' 를 표현하는 함수를 작성하시오. (3가지 방법)

### 46. return 값
> 함수 a, b, c 를 호출하면 각각 10, 20, 30 을 반환하는 함수를 작성하시오. (3가지 방법)

### 47. parameter와 argument
> 함수 a 의 인자 값을 매개변수로 하여 해당 값을 콘솔 창에 표현하는 함수를 작성하시오. (3가지 방법)

### 48. 함수 응용
> 매개변수로 x, y, z을 받아 곱한 값을 반환하는 multiply 함수를 만드시오. (3가지 방법)

### 49. 객체 리터럴 : 속성
> 학생 정보를 담는 객체 student 에 name, age, grade 를 선언하고 해당 값을 각각 선언하라

### 50. delete 키워드 : 객체 속성 제거
> 자동차 정보를 담는 객체 car 에 brand, name, speed, gear를 선언하고 해당 값을 각각 선언 후 gear 를 제거해라

### 51. 객체 간의 참조 관계
> 다음과 같이 객체 안에 객체가 있을 때, '조' 값에 접근하는 방법을 설명하시오.
```Javascript
const zerocho = {
  name : {
    first : '현영',
    last : '조',
  },
  gender : 'm'
};
```






> 정답
1. 어떠한 값의 데이터 타입(자료형)을 확인하는 연산자 typeof를 활용하여 확인한다
 : typeof "안녕하세요" => 결과 : string

2. 문자열 안에서 따옴표 사용하는 방법은 다음과 같다
 - 큰따옴표(") 안에서 작은 따옴표(')를 사용 : "'"
 - 템플릿 리터럴(백틱)을 으로 묶기 : `'`
 - 따옴표를 이스케이핑 : \'

3. 문자열 내에서 문자들을 여러 줄에 걸쳐 나타내는 방법은 다음과 같다
 - 템플릿 리터럴(백틱) 내에서 줄바꿈을 사용 :
   `안녕
   하세요`
 - 이스케이프 문자와 n을 더해 개행문자로 표현 : '안녕\n하세요'

4. 문자열 합치는 방법으로 + 연산자를 활용한다. : "안녕" + " 하세요" ,"안녕 " + "하세요", "안녕" + " " + "하세요"

5. 2진법 0b11(3) , 8진법 0o15(13), 10진법 10, 16진법 0x1c(28), 지수표기법 5e4(50000, e4는 10의 4승), 음수표기법 -1

6. typeof (parseInt(prompt())) 또는 typeof (parseFloat(prompt()))

7. parseInt(111, 2), parseInt(111, 8), parseInt(111, 16)

8. 1) NaN(Not a Number), 2) Number

9. 1) Infinity, 2) Number 3) Infinity, 4) NaN, 5) NaN

10. 1) "문자열0", 2) "10", 3) NaN, 4) 4

11. 2 + 1 부분을 가장 우선순위가 높은 ()로 묶기 => 3 ** (2 + 1)

12. 부동소수점 문제 발생 -> (0.3 * 10 - 0.1 * 10) / 10;

13. 1) false, 2) true, 3) true, 4) true, 5) false('abc'는 숫자형으로 바꾸면 NaN, NaN 비교결과는 false)

14. 자료형

15. (5 + 4) * 3 === 27; 또는 5 + 4 * 3 !== 27;

16. 1) "undefined", 2) false, 3) false, 4) false, 5) false

17. 1) "object", 2) true, 3) false, 4) false, 5) false, 6) false, 7) false, 8) === null(자료형이 object라서 자료형까지 비교해야함)

18. a : 변수, b : 선언

19. 3, 4, 5

20. a : const, b : 상수

21. a = temp; a = b; b = temp;

22. 바꾼 결과
```Javascript
let first = true;
let second = false;
if(first && second){
  console.log('첫 번째 조건 충족!');
  console.log('두 번째 조건도 충족!');
}else if(first){
  console.log('첫 번째 조건 충족!');
  console.log('두 번째 조건은 불충족!');
}else{
  console.log('첫 번째 조건 불충족!');
}
```

23. 바꾼 결과
```Javascript
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
}
```
> 추가된 코드
default:
  console.log('아무것도 일치하지 않음');

24. 바꾼 결과
```Javascript
var fruit='사과';
if(fruit ==='사과'){
   console.log('사과입니다!');
}else if(fruit === '배'){
  console.log('배입니다!');
}else if(fruit === '포도'){
  console.log('포도입니다!');
}else{
  console.log('뭔지 모르겠습니다!');
}
```

25. 바꾼 결과
> 5 > 0 ? '참입니다.' : '거짓입니다.';
> let value = condition ? '참' : '거짓';

26. 바꾼 결과
```Javascript
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
```Javascript
let condition = true;
let value = condition ? '참' : '거짓';
```

27. 작성 결과
```Javascript
let i = 1;
while(i <= 100){
  console.log('Hello, World!');
  i++;
}
```

28. 작성결과
```Javascript
for(let i = 0; i < 100; i++){
  console.log('Hello, World!');
}
```

29. 바꾼 결과
```Javascript
for(let i = 0; i < 100; i++){
  console.log(i + 1);
}
```

30. 작성 결과
```Javascript
let i = 1;
while(i <= 100){
  if(i % 2 === 0) console.log(i);
  i++
}
```
```Javascript
for(let i = 1; i <= 100; i++){
  if(i % 2 === 0) console.log(i);
}
```

31. 작성 결과
```Javascript
let row = 1;
while(row <= 9){
  let col = 1;
  if(row % 2 === 0){
    while(col <= 9){
      console.log(row + 'x' + col + '=' + row * col);
      col++;
    }
  }
  row++;
}
```
```Javascript
for(let row = 1; row <= 9; row++){
  if(row % 2 === 0){
    for(let col = 1; col <=9; col++){
      console.log(row + 'x' + col + '=' + row * col);
    }
  }
}
```

32. 작성결과
```Javascript
let row = 0;
while(row < 10){
  row++;
  let col = 1;
  if(row % 2 === 0){
    continue;
  }
  while(col <= 9){
    console.log(row + 'x' + col + '=' + row * col);
    col++;
  } 
}
```
```Javascript
for(let row = 1; row < 10; row++){
  for(let col = 1; col < 10; col++){
    if(row % 2 === 0) continue;
    console.log(row + 'x' + col + '=' + row * col);
  }
}
```

33. a : 객체, b : 배열, c : 함수

34. arr = [1, 2, 3, 4, 5]; console.log(arr[arr.length - 3])
> .length : 해당 배열의 길이를 int 형으로 return
> 마지막 요소는 배열.length-1 로 구할 수 있다

35. const target = ['나', '다', '라']; target.unshift('가'); console.log(target);

36. const target = ['가', '나', '다']; target.push('라'); console.log(target);

37. const target = ['가', '나', '다', '라', '마']; target.pop(); console.log(target);

38. const target = ['아', '가', '나', '다', '라']; target.shift(); console.log(target);

39. const target = ['가', '나', '바', '사', '마']; target.splice(2, 2, '다', '라'); console.log(target);

40. const target = ['나', '다', '라']; target.unshift('가'); target.push('마'); target.splice(1,2); target.includes('다'); target.shift(); target.pop(); console.log(target);

41. const target = ['가', '나', '다', '가']; target.indexOf('가'); target.indexOf('라');

42. const target = ['가', '나', '다', '가']; target.lastIndexOf('가'); target.lastIndexOf('라');

43. const target = ['가', '나', '다']; target.unshift('라'); target.push('라'); target.splice(1, 3, '마', '바', '사'); target.shift(); target.pop(); target.includes('가');
target.indexOf('라');
target.lastIndexOf('라');
for(let i = 0; i <= target.length-1; i++){
  console.log(target[i]);
}
let i = 0;
while(i <= target.length - 1){
  console.log(target[i]);
  i++
}

44. const arr = ['가', '라', '다', '라', '마', '라'];
while(arr.indexOf('라') > -1){
  arr.splice(arr.indexOf('라'), 1);
}
console.log(arr);

45. function a() { console.log('hello'); } const b = function() { console.log('hello'); }; const c = () => { console.log('hello'); };

46. function a() { return 10; } const b = function() { return 20; }; const c = () => { return 30; };

47. function a(parameter) { console.log(parameter); } const b = function(parameter) { console.log(parameter); }; const c = (parameter) => { console.log(parameter) };

48. function multiply1(x, y, z){ return x*y*z; } const multiply2 = function(x, y, z) { return x*y*z; }; const multiply3 = (x, y, z) => { return x*y*z; };

49. const student = {
  name : '석진석',
  age : 25,
  grade : 2,
};
student.name;
student['age'];
student.grade;

50. const car = {
  brand : '현대',
  name : '그랜저',
  speed : 300,
  gear : 1,
};
car.brand;
car.name;
car.speed;
car.gear;
delete car.gear;

51. 방법 설명
zerocho 의 name 원소를 참조하는 변수를 생성
const personName = zerocho.name;
해당 원소 안에 있는 last를 참조하는 변수를 생성하고 호출
const personLastName = personName.last;
console.log(personLastName);
또는, 바로 name 원소의 last를 참조하며 바로 호출가능하다. : console.log(zerocho.name.last);