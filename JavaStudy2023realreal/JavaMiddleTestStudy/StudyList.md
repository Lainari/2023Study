# chp 5 : 객체 지향 프로그래밍

## 객체 지향 프로그래밍(OOP)
- 다양한 기능을 하는 소프트웨어 객체들이 존재하고 이러한 객체들을 조합하여 자기가 원하는 기능을 구현하는 기법

### 객체
- 상태
  - 객체 안의 변수, 필드(filed)라고도 함
- 동작
  - 객체의 동작을 나타내는 부분, 메소드(method)라고 부름
```Markdown
객체는 필드와 메소드로 이루어져 있는 ***소프트웨어의 묶음***이라 할 수 있다
```

* * *
## 객체 지향 프로그래밍 특징

### 캡슐화(Encapsulation)
- 관련된 데이터와 알고리즘이 하나의 묶음으로 정리되도록 기능 제공

### 정보 은닉(Information hiding)
- 객체의 실제 구현 내용을 외부에 감추는 것

### 상속(Inheritance)
- 기존의 코드를 재활용하기 위한 기법
- 이미 작성된 클래스(부모 클래스)를 이어받아서 새로운 클래스(자식 클래스)를 생성하는 기법

### 다형성(Polymorphism)
- 서로 다른 타입에 속하는 객체들이 같은 이름의 맴버 함수에 응답하여서 서로 다른 동작을 보여주는 것이 가능하다

### 추상화(Abstraction)
- 불필요한 정보는 숨기고 중요한 정보만을 표현함으로써 프로그램을 간단히 만드는 기법

* * *
## 클래스
```Markdown
객체들은 설계도에 의하여 생성된다
=> 객체에 대한 설계도를 ***클래스(class)***라 한다
```

```Java:Television.java
public class Television{
    // 필드 정의, 객체의 속성을 나타낸다
    int channel;   // 채널번호
    int volume;    // 볼륨
    boolean onOff; // 전원상태
}
```

### 클래스와 인스턴스
- 클래스
  - 특정한 종류의 객체들을 찍어내는 청사진
  - 객체의 형태를 정의하는 틀(Template)과 같은 것임
- 인스턴스
  - 클래스로부터 만들어지는 각각의 객체

* * *
## 자료형

### 기초 변수(Primitive Variable)
- int, float, char 등의 기초 자료형의 값을 저장하는 변수
- 실제 데이터 값이 저장된다

### 참조 변수(Reference Variable)
- 객체를 참조할 때 사용되는 변수
- 객체의 참조값이 저장됨
- 객체가 직접 저장되는 것이 아니다!
```Markdown
객체의 필드나 메소드를 참조하려면 참조 변수에 **멤버 연산자(.)**를 사용하면 된다
```
```Java:TelevisionTest.java
public class TelevisionTest{
    public static void main(String[] args){
        Television myTv = new Television(); // 객체를 생성
        // 각 객체의 멤버에 접근할 때 멤버 연산자(.) 사용
        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;
        System.out.println("나의 텔레비전의 채널은 " + myTv.channel + "이고 볼륨은 " + myTv.volume + "입니다.");

        Television yourTv = new Television(); // myTv와 yourTv는 별개의 객체를 가리킴
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;
        System.out.println("너의 텔레비전의 채널은 " + yourTv.channel + "이고 볼륨은 " + yourTv.volume + "입니다.");

        Television someoneTv = yourTv;
        // 이렇게 되면 someoneTv를 통해 yourTv가 가리키는 객체를 가리키게 된다
    }
}
```
* * *
## 쓰레기 수집기

### 히프 메모리(heap)
- 컴퓨터에서 사용 가능한 메모리를 모아 놓은 곳
- 자바에서 객체들은 new 연산자에 의하여 이 히프 메모리에 할당된다

### 쓰레기 수집(Garbage Collection)
- 자바 시스템에서 사용되지 않는 객체들을 삭제하여 히프 메모리를 확보해야 함
- 이 때 자동 메모리 수거 시스템을 사용하는 데, 이것을 쓰레기 수집이라고 한다

## LAB : 객체 생성과 사용
```Markdown
상자를 나타내는 Box 클래스를 작성하여라
- 필드 : 가로(width), 세로(length), 높이(height)

이후 상자에 대한 정보를 출력하여 본다
- 결과 : 상자의 가로, 세로, 높이는 20, 20, 30입니다.
```
```Java:Box
public class Box{
    int width;
    int length;
    int height;

    public static void main(String[] args){
        Box b = new Box();
        b.width = 20;
        b.length = 20;
        b.height = 30;
        System.out.println("상자의 가로, 세로, 높이는 " + b.width + ", " + b.length + ", " + b.height + "입니다.");
    }
}
```

* * *
## 메소드
```Markdown
메소드는(method)는 클래스 안에 선언된 "특정한 작업을 수행하는 문장들의 모임"
```
- 메소드는 클래스 안에 정의된 함수이다
- 메소드는 하나 이상의 문장들을 포함하고 있다

```Java:Television.java
public class Television{
    int channel;   // 채널번호
    int volume;    // 볼륨
    boolean onOff; // 전원상태

    // print() 메소드는 Television 클래스 안에 포함된다
    void print(){
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
        // channel 과 volume 이 클래스 안에서 사용될 때는 멤버 연산자(.)가 필요없다
    }
    public static void main(String[] args){
        Television tv = new Television();
        tv.channel = 9;
        tv.volume = 12;

        // 필드와 마찬가지로 메소드도 멤버 연산자(.)를 통해 호출한다
        tv.print();
    }
}
```

### 메소드의 반환값
- 메소드는 자신을 호출한 코드에 값을 반환할 수 있다
```Markdown
void : 값을 반환하지 않는다<br>
int, float, String : 리턴하려는 값의 자료형과 일치시켜 return 과 묶어 반환한다
```