# 자바스크립트 메소드 예제 문제 풀기

## Chp 3.

### HTML 구현
```html
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>끝말잇기</title>
    </head>
    <body>
        <div><span id = "order">1</span>번째 참가자</div>
        <div>제시어 : <span id="word"></span></div>
        <input type="text">
        <button>입력</button>
        <script>
            const number = prompt('몇 명이 참가하나요?');
            const realNumber = Number(number);
        </script>
    </body>
</html>
```





### 1. Number(parameter) : parameter 안에 있는 문자열을 숫자형으로 바꾼다
> 다음 소스 코드의 결과를 기입하시오.
`parseInt('10.456');  Number('10.456');`


### 2. prompt, alert, confirm 함수
> 다음 중 함수 설명이 올바른 것을 고르시오.
1) prompt 함수는 사용자로부터 값을 전달받는다
2) alert 함수는 사용자의 확인을 요구한다
3) confirm 함수는 사용자에게 경고 메시지를 표시한다

### 3. document.querySelector('선택자'); : 자바스크립트에서 HTML 태그를 가져오는 것을 '선택'
> 변수 button 에게 button 선택자를 가져오는 명령문을 작성하시오

### 4. document.querySelectorAll('선택자'); : HTML 태그를 모두 선택할 때 사용하는 함수
> 변수 button 에서 button 선택자를 모두 가져오는 명령문을 작성하시오

### 5. document.querySelector('#아이디') : 여러 개의 태그 중에서 '아이디' 태그 하나만 선택하는 함수
> span 태그의 id명이 order라 하였을 때, 이 아이디만을 선택하여 해당 내용을 가져오는 명령문을 작성하시오.

### 6. document.querySelectorAll('.클래스명') : 여러 개의 태그 중에서 특수한 태그를 전부 선택하는 함수
> buttons 변수에 hello 클래스를 호출하는 명령문을 작성하시오.






# 정답

1. parseInt('10.456') = 10 , Number('10.456') = 10.456

2. 1) 만 정답, 2)는 confirm -> 확인 요구 후 확인 누를 시 true, 취소는 false 반환, 3)는 alert -> alert 란에 넣을 메시지를 사용자에게 표시

3. const $button = document.querySelector('button');

4. const $button = document.querySelectorAll('button');

5. const $order = document.querySelector('#order');

6. const $buttons = document.querySelectorAll('.hello');