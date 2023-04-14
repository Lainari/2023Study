// 230316 수업 예제
typeof null; // 결과 : object    <-- javascript 의 유명한 버그
typeof undefined; // 결과 : undefined <-- 따라서 undefined 를 사용하는 것이 바람직함

null == false; // 결과 : false
null == true; // 결과 : true

undefined == false; // 결과 : false
undefined == true; // 결과 : false

// JS : undefined 를 기본값으로 취급

const constNum1 = 1;
const constNum2 = 22;
// 만약, 초기값을 설정해주지 않는다면 에러발생
// 에러 내용 : Uncaught SyntaxError: Missing initializer in const declaration
// const 선언에 초기값이 없습니다

// 변수명, 상수명의 작명 가능한 이름 : $, _, 문자(유니코드로 가능), 숫자
// let ent^er = 1;
// Uncaught SyntaxError: Unexpected token '^'
let se$ok = 3;
let 석 = 3;
let 昔 = 3;
let 메롱 = '😜';
메롱 // 결과 😜

// 초기화 & 사용
let t1 = 0;
let t2 = 't2';
let t3 = t1 + t2;  // 결과 : 0t2

// 읽기 방법 : '변수명' 입력
t1; // 결과 : 0

// 쓰기 방법 : '변수명' 대입연산 입력
t3 = '와자뵤';
t3 // 결과 : 와자뵤


// 문, 식

/**
 * 문( Statement ) : 선언’문’, 조건’문’, 반복’문’ 등의 ‘문장’, 해당하는 ‘문장에 대한 실행’
 * 식( Expression ) : 수’식’ 등을 말하고,  [ 실행 과 결과 ]를 모두 일컬는 말이다
 */

let change = "test"; // 문
change = "변경"; // 식

// * 단, 예외적으로 사용자 정의 객체 중 배열 객체의 값을 바꿀 순 있다
const obj1 = {k1:'v1',k2:'v2'};
obj1 =111;
// Error > Uncaught TypeError: Assignment to constant variable.
obj1.k1='ddd';
obj1 // 결과 : {k1: 'ddd', k2: 'v2'}

var undefined = 'defined';
var Infinity = 0;
var let = 'const';


// 조건식!!!

// 조건식에는 변수를 넣어도 된다
let condition = true;
if (condition){
    console.log('Hello, if!');
}
// 직접 값을 넣어도 됨
if(0){
    console.log('Hello, if!');
}