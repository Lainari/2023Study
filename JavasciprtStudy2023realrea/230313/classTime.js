/*230313 수업시간
> var a, b, c;
< undefined

> b = 1;
< 1

> c = 2;
< 1

> a = b += 2;
< 3

> */
if(0) {console.log('t');}else{console.log('f');};
if(null) {console.log('t');}else{console.log('f');};
if(NaN) {console.log('t');}else{console.log('f');};
if('') {console.log('t');}else{console.log('f');};
if(1) {console.log('t');}else{console.log('f');};
if(12) {console.log('t');}else{console.log('f');}; // 0이 아닌 다른 값이 들어가면 T 반환
if(' ') {console.log('t');}else{console.log('f');}; // 공백(blank)가 들어있어서 반환값은 T

true > false // 결과 : true
// true는 숫자로 변환하면 1, false는 0

'b' > 'a';
// true
'ad' > 'ab';
// true
'ab' > 'a';
// true

'3' < 5;  // 문자를 숫자형으로 변환
// true

'abc' < 5; // 문자'열'은 숫자로 바꾸면 NaN, NaN과의 비교는 false
// false

// NaN 과 NaN 비교 : 이것만 False로 반환
NaN == NaN
// false
NaN === NaN
// false

// null 끼리 비교는 true
null == null
// true
null === null
// true

// undefined 끼리 비교는 true
undefined == undefined
// true
undefined === undefined
// true

'a'.charCodeAt();
// 97

'A'.charCodeAt();
// 65

'abc'.charCodeAt();
// 97
// 여러 문자가 있을 경우 첫 번째의 문자의 값만 반환

'abc'.charAt(2);
// 'c'
// charAt() 메소드를 이용하여 해당 index 번호의 문자를 반환한다

'abc'.charAt(2).charCodeAt();
// 99
// charAt() 메소드와 CharCodeAt() 메소드를 이용하여 해당 문자 값을 알아낼 수 있다

'1' == 1;
// true
'1' === 1;
// false
1 != '1';
// false
1 !== '1'
// true