# Usually Shown Error (Page. 34)
 - 콘솔에서 에러가 났을 때, 키보드의 위쪽 방향 키(🔼)를 누르면 이전 코드가 다시 표시 됨
 - 일종의 히스토리 기능이라고 보면 됨

 ## Uncaught ReferenceError : (Command) is not defined
 - 명령어(Command) 입력 중에 오타가 나면 발생하는 에러
 - 대소문자도 구분하므로 해당 명령어에 대소문자 포함 여부를 생각하며 작성할 것

 ## Uncaught TypeError : (Command) is not a function
 - 명령어에서 제공하는 메소드(.연산자 이후)에서 오타가 나면 발생하는 에러
 - 이 또한 대소문자를 구분하므로 조심하자

 ## Uncaught SyntaxError : missing ) after argument list
 - 따옴표를 사용하지 않았을 때 발생하는 에러
 - 문자같은 경우 `(백틱) 이나 '(작은 따옴표) 또는 "(큰따옴표) 로 감싸줘야 함

 ## Uncaught SyntaxError : Invalid or unexpected token
 - 따옴표의 짝을 맞추지 않았을 때 발생하는 에러
 - 시작과 끝의 따옴표 종류가 같아야 함