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
            const number = Number(prompt('몇 명이 참가하나요?'));
            if(number){
                const $button = document.querySelector('button');
                const $input = document.querySelector('input');
                const $word = document.querySelector('#word');
                const $order = document.querySelector('#order');
                let word;// 제시어
                let newWord; // 현재 단어

                const onClickButton = () => {
                if(newWord.length === 3 && (!word || word[word.length - 1] === newWord[0])){
                    // 제시어가 비어있거나 입력한 단어가 올바른가?
                    // 초기값이 없으므로 undefined(false값) 이것을 부정하니 true가 됨
                    // 비어 있을 경우
                    word = newWord; // 현재 입력값이 제시어가 됨
                    $word.textContent = word; // 화면에 제시표시
                    const order = Number($order.textContent);
                    if(order + 1 > number){
                        $order.textContent = 1;
                    }else{
                        $order.textContent = order + 1;
                    }
                }else{
                    // 올바르지 않다
                    alert('올바르지 않은 단어입니다!');
                }
                    $input.value = '';
                    $input.focus();
                };


                const onInput = (event) => {
                    newWord = event.target.value; // 입력한 단어를 현재 단어로
                };

                $button.addEventListener('click', onClickButton);
                $input.addEventListener('input', onInput);
            }
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

### 7. document.querySelector('선택자 내부선택자 내부선택자 ... ') : 어떤 태크 안에 들어 있는 다른 태그를 선택
> span 변수에 div 태그 안에 있는 span 태그를 호출하는 명령문을 작성하시오

### 8. 태그 선택 활용
> a 태그 안에 id가 b인 태그 안에 class가 c인 태그를 선택하려면 어떤 선택자를 사용해야 할까요?

## 태그.addEventListener('이벤트 이름', 리스너함수) : 자바스크립트가 HTML에서 발생하는 이벤트를 감지

### 9. click 이벤트
> 버튼 태그를 클릭하면 '버튼 클릭' 이라는 문구를 콘솔 창에 출력되는 명령어를 작성하시오.

### 10. target.value
> parameter가 event 인 함수에서 해당 파라미터의 값을 확인하기 위해 사용하는 명령어는?

### 11. input 이벤트
> input 입력값을 넣으면, 콘솔 상에 '글자 입력' 과 입력값을 같이 출력하는 onInput 함수와 이 함수를 콜백 함수로 이용한 input 이벤트를 작성하시오

### 12. 이벤트 문제
> 이벤트를 달 때 사용하는 메서드는 무엇인가요?

### 13. 태그.textContent : 태그 내부의 문자열을 가져옴
> 태그 $word 내부의 문자열을 가져올 때 사용하는 명령어를 작성하시오.

### 14. 태그.textContent = 값 : 태그 내부의 문자열을 해당 값으로 설정함
> 태그 $word 내부의 문자열을 event 파라미터의 값으로 설정하는 onInput 함수를 작성하시오.

### 15. 문자열을 배열처럼 활용하기
> 문자열을 담는 변수인 word 의 마지막 단어와 또다른 변수 newWord의 첫번째 단어를 비교하는 조건문을 작성하시오

### 16. 문자열을 배열처럼 활용하기2
> 세 글자 이상의 단어를 저장하고 있는 word라는 변수가 있을 때 뒤에서 세 번째 글자를 가져오는 코드를 작성하시오

### 17. 입력태그.value : 입력창의 값을 가져옴 || 입력태크.value = 값 : 입력창에 값을 넣음
> input 이라는 입력 태그의 값을 가져온 뒤, 해당 값이 'y' 면 입력 태그의 값을 공백으로 만드는 코드를 작성하시오

### 18. 입력태그.focus() : 선택된 상태가 되어 사용자가 키보드나 마우스로 입력할 수 있게 됨
> input 이라는 입력 태그 내부에 커서를 위치하도록 만드는 코드를 작성하시오.

### 19. 태그 값 가져오기 문제
>  다음 태그들의 내부 값을 가져올 때 둘 중 어떤 속성을 사용해야 하는지 표시해 보세요.
a. input (value / textContent)
b. button (value / textContent)
c. select (value / textContent)
d. div (value / textContent)
e. textarea (value / textContent)
f. span (value / textContent)

### 20. 논리 연산자 활용
> 다음 논리 연산의 결과는 무엇일까요?
a. true && false
b. false && true
c. false || true
d. true || false




# 정답

1. parseInt('10.456') = 10 , Number('10.456') = 10.456

2. 1) 만 정답, 2)는 confirm -> 확인 요구 후 확인 누를 시 true, 취소는 false 반환, 3)는 alert -> alert 란에 넣을 메시지를 사용자에게 표시

3. const $button = document.querySelector('button');

4. const $button = document.querySelectorAll('button');

5. const $order = document.querySelector('#order');

6. const $buttons = document.querySelectorAll('.hello');

7. const $span = document.querySelector('div span');

8. a #b .c

9. document.querySelector('button').addEventListener('click',() =>{
        console.log('버튼 클릭');
    }
);
- click 이벤트 : 버튼을 클릭하면 `onClickButton` 함수가 실행된다
  - 콜백 함수(callback function) : 특정 작업이 실행되고 난 뒤에 추가로 실행되는 함수
  - 위 함수에서는 () => {console.log('버튼 클릭')}; 이 해당된다

10. event.target.value
- target 은 이벤트를 일으킨 HTML 요소를 나타냄
- value 는 해당 요소의 값을 가져올 수 있는 프로퍼티이다
- 즉, parameter는 target을 통해 해당 HTML 요소임을 나타냈고 value에 의하여 값이 가져오게 됨

11. ```Javascript
    const onInput = (event) => {
    console.log('글자 입력', event.target.value);
    };
    const $input = document.querySelector('input');
    $input.addEventListener('input', onInput);
    ```

12. addEventListener

13. $word.textContent;

14. ```Javascript
    const onInput = (event) => {
        $word.textContent = event.target.value;
    }
    ```

15. if(word[word.length - 1] === newWord[0])

16. word[word.length - 3]

17. 
```Javascript
if(input.value === 'y'){
    input.value = '';
}
```

18. input.focus()
- 반대로, 포커스 해제는 .blur() 를 사용 하면 된다

19. a : value, b : textContent, c : value, d : textContent, e : value, f : textContent
- <input>,<textarea>,<select>(입력태그엘리먼트) 등에서만 사용가능
- <input>,<textarea>,<select>외의 태그들에서 값은?
- 태그엘리먼트.textContent
- 태그엘리먼트.innerText
- 태그엘리먼트.innerHTML

20. a : false / b : false / c: true / d : true