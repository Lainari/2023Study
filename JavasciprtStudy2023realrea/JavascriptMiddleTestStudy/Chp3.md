# Chp3. DOM 객체 다루기 : 끝말잇기 게임

## 프로그램 절차 작성시 원칙
 1. 프로그램의 절차의 갯수는 정해져 있어야 함
 2. 각 절차는 항상 같은 내용이어야 함
 3. 모든 가능성을 고려해야 함
 4. 예시는 절차를 검증하는데 사용(가능한 다양한 예시 준비)

## 1) BOM(Browser Object Model)
 > 웹 브라우저와 관련된 객체의 집합
 - 정확하게는 자바스크립트가 아닌 웹 브라우저가 제공하는 기능임
 - 객체 모델 종류
    - Windows 객체(최상위 모델, 생략하여 사용 가능)
        - 메소드들
        (1) alert()
        `window.alert('사용자에게 알릴 내용')`
        - 결과는 undefined가 나오며 window. 부분은 생략이 가능하다
        - 사용자에게 해당 내용을 전달할 때 사용하며, 보통 경고문으로 쓰인다

        (2) prompt()
        `window.prompt('사용자에게 알릴 내용')`
        - 결과는 undefined가 나오며 window. 부분은 생략이 가능하다
        - 사용자가 프로그램에 값을 전달하기 위해 해당 메시지를 통해 특정한 값을 입력하도록 도와준다

        (3) confirm()
        `windows.confirm('사용자에게 알릴 내용')`
        - 결과는 확인(true)과 취소(false)에 따라서 반환값이 달라진다
    - Document 객체
    - Navigation 객체
    - Location 객체
    - History 객체

## 2) DOM(Document Object Model)
 > 