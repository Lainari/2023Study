# # 자바스크립트 메소드 예제 문제 풀기

## Chp 4.

### HTML 구현
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>계산기</title>
    <style>
        * { box-sizing: border-box;}
        #result { width: 180px; height: 50px; margin: 5px; text-align: right}
        #operator { width: 50px; height: 50px; margin: 5px; text-align: center }
        button { width: 50px; height: 50px; margin: 5px; }
    </style>
</head>

<!-- 계산기 버튼 구현 -->
<body>
    <input readonly id="operator">
    <input readonly type="number" id="result">
    <div class="row">
        <button id="num-7">7</button>
        <button id="num-8">8</button>
        <button id="num-9">9</button>
        <button id="plus">+</button>
    </div>
    <div class="row">
        <button id="num-4">4</button>
        <button id="num-5">5</button>
        <button id="num-6">6</button>
        <button id="minus">-</button>
    </div>
    <div class="row">
        <button id="num-1">1</button>
        <button id="num-2">2</button>
        <button id="num-3">3</button>
        <button id="divide">/</button>
    </div>
    <div class="row">
        <button id="clear">C</button>
        <button id="num-0">0</button>
        <button id="calculate">=</button>
        <button id="multiply">x</button>
    </div>
    <script>
        let numOne = '';
        let operator = '';
        let numTwo = '';
        const $operator = document.querySelector('#operator');
        const $result = document.querySelector('#result');
        const onClickNumber = (event) => {
            // 고차함수를 지우고 button 이벤트를 불러오는 event 매개변수를 활용
            if(operator){
                if(!numTwo){ // numTwo에 값이 없을 때 numTwo 입력하기 전에 비우게 된다
                    $result.value = '';
                }
                numTwo += event.target.textContent;
                // 해당 이벤트는 button 이므로, target의 값을 불러올 때는 textContent를 사용한다
            }else{
                numOne += event.target.textContent;
            }
            $result.value += event.target.textContent;
        };

        document.querySelector('#num-0').addEventListener('click', onClickNumber);
        document.querySelector('#num-1').addEventListener('click', onClickNumber);
        document.querySelector('#num-2').addEventListener('click', onClickNumber);
        document.querySelector('#num-3').addEventListener('click', onClickNumber);
        document.querySelector('#num-4').addEventListener('click', onClickNumber);
        document.querySelector('#num-5').addEventListener('click', onClickNumber);
        document.querySelector('#num-6').addEventListener('click', onClickNumber);
        document.querySelector('#num-7').addEventListener('click', onClickNumber);
        document.querySelector('#num-8').addEventListener('click', onClickNumber);
        document.querySelector('#num-9').addEventListener('click', onClickNumber);

        const onClickOperator = (op) => () => {
            if(numOne){ // 만약 첫번째 숫자가 들어있는가?
                // 들어있다
                operator = op;
                $operator.value = operator;
            }else{
                // 들어있지 않다
                alert('숫자를 먼저 입력하세요');
            }
        }

        document.querySelector('#plus').addEventListener('click', onClickOperator('+'));
        document.querySelector('#minus').addEventListener('click', onClickOperator('-'));
        document.querySelector('#divide').addEventListener('click', onClickOperator('/'));
        document.querySelector('#multiply').addEventListener('click', onClickOperator('*'));
        document.querySelector('#calculate').addEventListener('click', () => {
            if(numTwo){ // 두번째 값이 있어야지만 실행 가능
                switch(operator){ // 연산자의 값에 따라 결과를 다르게 하는 switch 문 사용
                    case '+': // +의 경우
                        $result.value = parseInt(numOne) + parseInt(numTwo);
                        // 두 값은 자료형이 String 이므로 parseInt로 int형으로 변환할 것
                        break;
                        // switch 문은 항상 break를 걸어주자
                    case '-':
                        $result.value = numOne - numTwo;
                        // 형 변환에서 + 를 제외한 나머지 연산자들은 숫자형으로 변환해주기 때문에
                        // 따로 parseInt를 써주지 않아도 된다
                        break;
                    case '*':
                        $result.value = numOne * numTwo;
                        break;
                    case '/':
                        $result.value = numOne / numTwo;
                        break;
                }
                $operator.value = '';
                numOne = $result.value;
                operator = '';
                numTwo = '';
            } else{
                alert('숫자를 먼저 입력하세요.')
            }
        });
        document.querySelector('#clear').addEventListener('click', () => {
            numOne = '';
            numTwo = '';
            operator = '';
            $operator.value = '';
            $result.value = '';
        });
    </script>
</body>
</html>
```

### 1. 고차함수
> 인자값을 받는 함수 func 을 콘솔 창에 인자값을 호출하도록 선언하고 innerFunc 에 인자값을 넣은 다음 innerFunc을 호출하여 결과를 확인하는 코드를 작성하세요.

### 2. 고차함수 수정
> 다음 코드는 고차함수로 작성된 것이다. 이를 고차함수를 사용하지 않고 버튼의 값을 불러오는 행위를 코드로 작성하라.
```javascript
const onClickNumber = (number) => () => {
    if(operator){
        numTwo += number;
    }else{ 
        numOne += number;
    }
    $result.value += number;
};
```

### 3. 일반함수 고차함수 변환
> 다음 코드는 일반함수로 작성된 것이다. 이를 고차함수로 변환하는 코드로 작성하여라
```Javascript
const onClickNumber = (event) => { // 이벤트를 삭제하고, number를 받아들이는 파라미터로 활용할 것
    if(operator){
        numTwo += event.target.textContent;
    }else{
        numOne += event.target.textContent;
    }
    $result.value += event.target.textContent;
};
```

### 4. 고차함수 응용 문제
> 다음 코드의 console.log 결과를 맞혀 보세요.
```Javascript
const hof = (a) => (b) => (c) => {
    return a + (b * c);
};
const first = hof(3);
const second = first(4);
const third = second(5);
console.log(third);
```

### 5. 중첩 if문 제거
> 다음은 중첩 if문을 제거하는 방법을 기술한 것이다. 순서대로 배열하라.
a. 분기점에서 짧은 절차부터 실행하게 if 문을 작성한다
b. else를 제거한다
c. if 문 다음에 나오는 공통된 절차를 각 분기점 내부에 넣는다
d. 짧은 절차가 끝나면 return(함수 내부 경우) 이나 break(for문 내부 경우)로 중단한다

### 6. 중첩 if문 제거 활용
> 다음은 중첩 if문을 나타낸 것이다. 순서에 맞게 과정을 진행하라
```Javascript
const onClickNumber = (event) => {
    if(operator){
        if(!numTwo){
            $result.value = '';
        }
        numTwo += event.target.textContent;
    }else{
        numOne += event.target.textContent;
    }
    $result.value += event.target.textContent;
};
```

### 7. 중첩 if문 제거 활용2
> 다음 if 문의 중첩을 줄여보세요
```Javascript
function test() {
    let result = '';
    if (a){
        if (!b){
            result = 'c';
        }
    } else {
        result = 'a';
    }
    result += 'b';
    return result;
}
```

### 8. eval 함수 : 문자열을 자바스크립트 코드처럼 실행하는 함수
> (가) 부분에 어떤 문자열을 넣으면 alert 창이 실행될까요?
```Javascript
const str = (가);
eval('a' + str + 't("eval은 위험해요")');
```

### 9. 배열명.join(문자) : 배열의 요소를 지정한 문자로 연결하여 문자열로 반환
> 배열 hello에 요소가 h, e, l, l, o 가 들어있다고 가정한다. 이 요소를 하나의 단어로 합쳐서 콘솔창에 표출하게 하는 코드를 작성하라




### 정답

1. ```Javascript
    const func = (msg) => {
        return () =>{
            console.log(msg);
        }
    }
    const innerFun = func('테스트테스트');
    innerFun();
   ```


- 고차함수 설명
- 반환값
  - 함수타입
- const 함수명 = (파라미터리스트) =>{
    return 함수타입;
  }
- 예시
  - 정의:
    const func = ()=>{ 
      console.log('외부함수');
      return () =>{
        console.log('내부함수');
      };
    }

    const func = (msg)=>() =>{
        console.log('내부함수',msg);
    };

  - 사용: 호출
    const innerFunc = func();
    innerFunc();

2. 
```Javascript
const onClickNumber = (event) => {
    // 고차함수를 지우고 button 이벤트를 불러오는 event 매개변수를 활용
    if(operator){
        numTwo += event.target.textContent;
        // 해당 이벤트는 button 이므로, target의 값을 불러올 때는 textContent를 사용한다
    }else{
        numOne += event.target.textContent;
    }
    $result.value += event.target.textContent;
};
```

3. 
```Javascript
const onClickNumber = (number) => () => { // 파라미터를 number로 받는 고차함수
    if(operator){ // 연산자의 값이 있을 경우
        numTwo += number; // 두번째 숫자를 해당 숫자로 받기
    }else{ 
        numOne += number; // 연산자의 값이 없다면 첫번째 수로 받아들이기
    }
    $result.value += number; // 해당 값을 결과란에 표시하기
};
```

4. 
```Javascript
const hof 를 분해하면 해당 결과가 된다
const hof = (a) => {
    return (b) => (c) => {
        return a + (b * c);
    }
}

여기서 const first 는 hof(3)을 고차함수로서 활용되므로
hof(3)의 리턴 값은 (b) => (c) => { return 3 + (b * c); } 가된다
즉 first 는 (b) => (c) => { return 3 + (b * c); }

const second = first(4)
second 는 first(4)를 받으므로 해석하면 다음과 같다
first(4)의 리턴값 : (c) => { return 3 + (4 * c); }

const third = second(5);
마지막 third 는 second(5)를 받으므로
second(5)의 리턴값 : (5) => { return 3 + (4 * 5);}

console.log(third);
third 는 3 + (4 * 5) 의 결과를 return 하므로 해당 코드의 결과는 23 이 나온다!

결과 : 23
```

5. c - a - d - b

6. 

1) if 문 다음에 나오는 공통된 절차를 각 분기점 내부에 넣는다
`$result.value += event.target.textContent;` 를 if 문과 else 문 안에 각각 넣기

2) 분기점에서 짧은 절차부터 실행하게 if문을 작성한다
if문 보다 else문에서 2줄의 코드로 실행이 종료되므로, if의 조건문을 !operator로 변경하여 서로의 위치를 변경한다

3) 짧은 절차가 끝나면 return 이나 break으로 중단한다
if 문 안에 return을 넣어 종료, 이렇게 되면 else 문은 필요없어지므로 else문이 사라지고 if문이 밖으로 나온다

4) else문 제거

5) 반복할 필요 없음!

결과 확인!
```Javascript
const onClickNumber = (event) => {
    if(!operator){
        numOne += event.target.textContent;
        $result.value += event.target.textContent;
        return
    }
    if(!numTwo){
        $result.value = '';
    }
    numTwo += event.target.textContent;
    $result.value += event.target.textContent;
};
```

7. 

1) if 문 다음에 나오는 공통된 절차를 각 분기점 내부에 넣는다
`result += 'b'; return result;` 를 각 분기점에 넣기

2) 분기점에서 짧은 절차부터 실행하게 if문을 작성
if문 보다 else문 쪽이 가까우므로 조건문을 !a로 변경

3) 짧은 절차가 끝나면 return이나 break 로 중단
이미 return이 있으므로 생략한다

4) else 제거

5) 반복 할 필요 없으므로 결과 확인!

```Javascript
function test() {
    let result = '';
    if (!a){
        result = 'a';
        result += 'b';
        return result;
    }
    if (!b){
        result = 'c';
    }
    result += 'b';
    return result;
}
```

8. ler
> eval 함수에 더 알아봅시다!
- window객체의 메서드
- window.eval(문자열)
  - 문자열의 JS코드를 해석하여 실행후 결과를 반환
- 해커가 좋아하는 코드: 보안상 안전을 감소시킬 수 있는 코드 생성 가능

9. hello.join('');
> join 함수에 대해 알아봅시다!
- 배열명.join(문자)
  - 배열의 요소를 지정한 문자로 연결하여 문자열로 반환
  - 문자를 ''으로 지정: 배열요소를 연결한 하나의 문자열로 반환
  - 단, 원본은 합쳐지지 않는다는 것을 명심하도록!