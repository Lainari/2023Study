# # 자바스크립트 메소드 예제 문제 풀기

## Chp 5.

### HTML 구현
```Html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">  
    <title>숫자 야구</title>
</head>
<body>
    <form id="form">
        <input type="text" id="input">
        <button>확인</button>
    </form>
    <div id="logs"></div>
    <script>
        const $input = document.querySelector('input');
        const $button = document.querySelector('button');
        const $logs = document.querySelector('#logs')

        const numbers = [];
        for (let n = 1; n <= 9; n += 1){
            numbers.push(n);
        }

        const answer = [];
        for (let n = 0; n <= 3; n+=1){ // 네 번 반복
            const index = Math.floor(Math.random() * numbers.length); // numbers 길이에 따라
            answer.push(number[index]); // 정답을 숫자 배열에서 가져온다
            numbers.splice(index, 1); // 가져온 숫자는 삭제된다
        }
        console.log(answer);

        const tries = [];
        function checkInput(input){
            if (input.length !== 4){ // 길이가 4가 아닌가?
                return alert('4자리 숫자를 입력해 주세요!');
            }
            if (new Set(input).size !== 4){ // 중복된 숫자가 있는가?
                return alert('중복되지 않게 입력해 주세요!');
            }
            if (tries.includes(input)){ // 이미 시도한 값인가?
                return alert('이미 시도한 값입니다');
            }
            return true;
        }
        $form.addEventListener('submit', (event) => {
            event.preventDefault();
            const value = $input.value;
            $input.value = '';
            const valid = checkInput(value);
            if(!valid) return;
            if(answer.join('') === value){
                $logs.textContent = '홈런!';
                return;
            }
            if(tries.length >= 9){
                const message = document.createTextNode(`패배! 정답은 ${answer.join('')}`);
                $logs.appendChild(message);
                return;
            }
            // 몇 스트라이크 몇 볼인지 검사
            let strike = 0;
            let ball = 0;
            answer.forEach((number, aIndex) => {
                const index = value.indexOf(String(number));
                if (index > -1){ // 일치하는 숫자 발견
                    if( index === aIndex ){ // 자릿수도 같음
                        strike += 1;
                    } else{ // 숫자만 같음
                        ball += 1;
                    }
                }
            })
            $logs.append(`${value}:${strike} 스트라이크 ${ball} 볼`, document.createElement('br'));
            tries.push(value);
        });
    </script>
</body>
</html>
```

### 1. Math.random() : 무작위 숫자 만들기
> 1에서 10까지 숫자를 랜덤으로 뽑아내는 코드를 작성하라

### 2. Math.random() 알아보기
> Math.random() 은 완전한 무작위가 아니다. 그렇다면 완전한 무작위로 된 함수는 어느것인가?
a. window.crypto.Random()
b. window.crypto.getRandom()
c. window.crypto.getRandomValues()
d. window.crypto.getValues()

### 3. 반복문을 이용한 랜덤 숫자 뽑기
> 2에서 5까지의 숫자를 뽑고 싶습니다. 제대로 작동하도록 (가) ~ (라) 를 모두 채우세요
> 반복문의 시작 값과 끝 값을 입력하는 스타일에 관련된 문제입니다
```Javascript
const answer = [];
for(let n = 0; [      ]; n++)
{
    answer.push(n + 2);
}
[   ] 에 들어갈 수 있는 조건들이다
a. n < (가)
b. n <= (나)
```
```Javascript
const answer = [];
for(let n = 1; [      ]; n++)
{
    answer.push(n + 1);
}
[   ] 에 들어갈 수 있는 조건들이다
a. n < (다)
b. n <= (라)
```

### 4. submit 이벤트 : form 태그 안의 내용을 제출할 때 발생
> id명이 form인 form 태그 안에 button 태그 하나 있다고 가정하자, 이 때 submit을 할 때 발생하는 이벤트를 이벤트 리스너 함수로 작성하라
> 단, form 태그 변수는 $form 으로 작성되어있다

### 5. preventDefault() : 폼 태그의 기본 동작을 취소하는 코드
> form 태그에서 submit 이벤트가 발생할 때 자꾸만 새로고침이 되는 현상이 나타난다. 이를 방지하기 위해 사용하는 함수는?

### 6. new Set(배열명) : 중복되지 않는 값으로 구성된 배열을 만드는 함수
> 배열 input의 원소가 1, 2, 3, 1를 갖고 있을 때 new Set(input)의 결과를 설명하시오

### 7. size : Set 요소 개수를 구할 때 사용하는 메소드
> 다음 변수들의 객체 개수를 구할 때 옳은 것을 고르시오
input = ['1','2','3']
a. count1 = input.(size / length)
b. count2 = new Set(input).(size / length)

### 8. HTML5의 검증 기능
> 다음은 input 태그에 검증 기능을 추가한 것이다. 기능의 설명으로 옳은 것은?
`<input required type="text" id="input" minlength="4" maxlength="4" pattern="^(?!.*(.).*/1)\d{4}$">`
a. 이 태그는 필수로 입력하지 않아도 된다
b. 이 태그는 4자리 숫자만 입력해야한다
c. 이 태그는 중복되지 않은 숫자만 입력해야 한다

### 9. document.createTextNode : 텍스트 생성, appendChild : 화면에 추가
> 기존 $logs 변수에 새 텍스트 '정답!'을 추가하기 위해 msg 변수를 활용하고 이를 화면에 추가해서 표출하는 코드를 작성하라

### 10. Element의 구성 요소
> Element 구성 요소 5가지가 무엇인지 작성하시오

### 11. forEach 메서드 활용
> 다음 for 문을 forEach 문으로 변경하라
```Javascript
for(let i = 0; i < answer.length; i++){
    const index = value.indexOf(answer[i]);
    if(index > -1){
        if(index === i){
            strike += 1;
        } else{
            ball += 1;
        }
    }
}
```

### 12. map() 과 fill()를 사용한 배열 메서드 활용
> 다음 반복문을 map() 과 fill() 메서드를 활용하여 재작성하라
> 새 배열 작성시에는 Array() 를 이용하라
```Javascript
const numbers = [];
for (let n = 1; n <= 9; n += 1){
    numbers.push(n);
}
```

### 13. forEach -> for문
> forEach 메서드를 사용한 코드를 for 문으로 바꿔 보세요
```Javascript
const array = [1, 3, 5, 7];
array.forEach((number, index) =>{
    console.log(number, index);
});
```



### 정답

1. `Math.floor(Math.random() * 10 + 1)` : 1이상 11 미만
> 무작위 함수 더 알아보기
- Math.random()
  - 0~1.0미만(0.99999999...)사이값을 반환하는 메서드
- 실수값을 정수값으로 변경
  - Math.floor()
    - 밑바닥, 내림(버림)
  - Math.round()
    - 반올림
  - Math.ceil()
    - 천장, 올림
- [n, m] : n이상 m이하
  - Math.floor(Math.random()*(m-n+1))+n
  - [1,10]: 1<=num<=10
    - Math.floor(Math.random()*(10-1+1))+1
    - Math.floor(Math.random()*10)+1

2. c

3. 
a. (가) -> 4
b. (나) -> 3
c. (다) -> 5
d. (라) -> 4

4. `$form.addEventListener('submit',()=>{});`

5. preventDefault()

6. 1, 2, 3

7. 
a. length
b. size
> Set 객체에 대해 알아보자
- Set 객체
- 원소
- 중복 불가
    - 같은 원소가 존재할 수 없다
- 길이
    - size 속성으로 알 수 있음

8. b, c
a : required로 인하여 필수 입력해야 함

9. `const msg = document.createTextNode('정답!')`
   `$logs.appendChild(msg);`
> create 와 append 에 대해 더 알아보기
- document.createElement()
  - DOM의 element객체 생성
  - document.createElement('div')
  - <div></div>
- document.createTextNode()
  - DOM의 내용이되는 텍스트노드 객체(엘리먼트) 생성
  - document.createTextNode('텍스트')

- 엘리먼트객체.appendChild(엘리먼트객체)
  - 엘리먼트객체의 내용으로 아규먼트의 엘리먼트객체를 추가
- 엘리먼트객체.append(엘리먼트객체1[, 엘리먼트객체2, ...])
  - 엘리먼트객체의 내용으로 아규먼트의 엘리먼트객체들을 추가

10. 시작태그, 속성 이름, 속성 값, 내용, 종료 태그

11. 
```Javascript
answer.forEach((number, Index)) => {
    const index = value.indexOf(String(number));
    if(index > -1){
        if(index === Index){
            strike += 1;
        } else{
            ball += 1;
        }
    }
}
```
> forEach와 반복문에 대해 더 알아보자
- for, for~in, while 
- 배열의 반복문
  - 배열명.forEach()
    - 배열의 원소들을 순서대로 하나씩 콜백함수의 실행결과를 나타냄
    - 콜백함수
    - 파라미터: (value, index)
      - value: 원소의 값
      - index: 원소가 저장되어 있는 인텍스

12. 
```Javascript
const numbers = Array(9).fill().map(( v, i ) => i + 1);
v, i 에 값이 없으므로 초기값은 0
```
> map() 과 fill() 에 대해 더 알아보자
- 배열명.fill()
  - 아규먼트가 없으면 undefined로 배열이 채워짐
  - 아규먼트가 있으면 해당 값으로 배열 채워짐

- 배열명.map()
  - 배열의 원소들을 순서대로 하나씩 콜백함수의 반환값으로 대응시켜 배열 원소 변경
  - 콜백함수
  - 파라미터: (value, index)
    - value: 원소의 값
    - index: 원소가 저장되어 있는 인텍스

13. 
```Javascript
const array = [1, 3, 5, 7];
for(let i = 0; i < array.length; i++){
    console.log(array[i], i)
}
```