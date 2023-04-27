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

* * *
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
void : 값을 반환하지 않는다
int, float, String : 리턴하려는 값의 자료형과 일치시켜 return 과 묶어 반환한다
```

* * *
## 인수와 매개변수

### 인수(Argument)
- 호출하는 곳에서 메소드 호출시 전달하는 값

### 매개 변수(Parameter)
- 메소드에서 값을 받을 때 사용하는 변수
```Java:Math.java
public class Math{
    int add(int x, int y){ // x와 y는 add()의 매개변수이다
        return x + y;
    }

    public static void main(String[] args){
        int sum;
        Math obj = new Math();
        sum = obj.add(2, 3); // 2와 3은 인수로서 add()로 전달된다
        System.out.println("2와 3의 합은 " + sum);
    }
}
```
* * *
* * *
## LAB : 자동차 클래스 작성하기
```Markdown
Car를 나타내는 클래스를 정의하여 보자
- 필드 : color, speed, gear
- 메소드 : changeGear(), speedUp(), SpeedDown()

이후 Car에 대한 정보를 출력하여 본다
- 결과 : Car [color=null, speed=10, gear=1]
- 결과는 Car 객체를 호출했을 때 바로 실행하도록 한다
```
```Java:Car
public class Box{
    String color;
    int speed;
    int gear;

    void changeGear(int g){
        gear = g;
    }
    void speedUp(){
        speed = speed + 10;
    }
    void speedDown(){
        speed = speed - 10;
    }
    @Override
    public String toString(){
        return "Car [color" + color + ", speed=" + speed + ", gear=" + gear + "]";
    }

    public static void main(String[] args){
        Car myCar = new Car();
        myCar.changeGear(1);
        myCar.speedUp();
        System.out.println(myCar);
    }
}
```

* * *
## 메소드 오버로딩
```Markdown
메소드 오버로딩 : 이름이 같은 메소드를 여러 개 정의하는 것
다만! 각각의 메소드가 가지고 있는 매개 변수는 달라야 한다
- 대표적인 예시로 println()가 있다
```
```Java:MyMath.java
public class MyMath{
    // 정수 값을 제곱하는 메소드
    int square(int i){
        return i * i;
    }

    // 실수값을 제곱하는 메소드 => 메소드 오버로딩
    double square(double i){ // 매개 변수만 다르면 메소드 이름은 같아도 된다
        return i * i;
    }

    public static void main(String[] args){
        MyMath 
    }
}
```

* * *
## String 클래스 사용
- 문자열은 다음과 같이 선언한다
```Java
String s = new String("Hello World!"); // 선언과 동시에 초기화
```
- 이 때 String 클래스의 객체가 하나 생성된다
  - 여기서 s는 참조 변수로서 생성된 객체를 가리키는 변수로, 객체의 주소가 저장된다
  - 또한 문자열은 new 연산자를 사용하지 않고 문자열 상수로 표기해도 자동적으로 객체가 생성된다

```Java
s = "Hello World!"; // 이렇게 하여도 객체가 생성된다
```
- 즉 String 객체에 대해서는 new 연산자의 호출을 생략할 수 있다

### 객체의 메소드 호출
```Java
- charAt(int index) : 지정된 인덱스에 있는 문자를 반환한다 <return char>
- compareTo(String anotherString) : 사전적 순서로 문자열을 비교한다. <return int>
                                    앞에 있으면 -1, 같으면 0, 뒤에 있으면 1이 반환된다.
- concat(String str) : 주어진 문자열을 현재의 문자열 뒤에 붙인다 <return String>
- equals(Object anObjec) : 주어진 객체와 현재의 문자열을 비교한다 <return boolean>
- equalsIgnoreCase(String anotherString) : 대소문자를 무시하고 비교한다 <return boolean>
- isEmpty() : length()가 0이면 true를 반환한다 <return boolean>
- length() : 현재 문자열의 길이를 반환한다 <return int>
- replace(char oldChar, char newChar) : 주어진 문자열에서 oldChar를 newChar로 변경한
                                        새로운 문자열을 생성하여 반환한다 <return String>
- substring(int beginIndex, int endIndex) : 현재 문자열의 일부를 반환한다 <return String>
- toLowerCase() : 문자열의 문자들을 모두 소문자로 변경한다 <return String>
- toUpperCase() : 문자열의 문자들을 모두 대문자로 변경한다 <return String>
```

### 문자열 상수, 결합, 수치값 -> 문자열로 변환
- 문자열 상수는 "Hello World!"와 같이 이중 따옴표를 사용하여 표현된다
```Java
"Hello World!"

String 클래스의 메소드를 문자열 상수를 통해서도 사용할 수 있음
int size = "Hello World!".length();
System.out.println(size); // 결과 12
```
- 문자열 결합은 두 개의 문자열을 + 연산자를 이용하여 결합한다
```Java
String subject = "Money";
String other = " has no value if it is not used";
String sentence = subject + other;
```
- 자바에서는 문자열과 기초 자료형 변수를 결합하게 되면 자동적으로 기초 자료형을 문자열로 변환함
```Java
System.out.println("100" + 20); // 10020 출력
System.out.println(100 + 20);   // 120 출력
```

### 문자열 -> 수치값 : 랩퍼 클래스(Wrapper Class)
- 랩퍼 클래스는 기초 자료형을 클래스로 만들고 싶은 경우에 사용하면 된다
```Java
기초자료형 - 랩퍼 클래스 순
byte - Byte
short - Short
int - Integer
long - Long
float - Float
double - Double
char - Character
boolean - Boolean
void - Void
```
- 랩퍼 클래스가 가지고 있는 메소드도 유용하게 사용된다
```Java
- byteValue() : int형을 byte형으로 변환한다 <return byte>
- doubleValue() : int형을 double형으로 변환한다 <return double>
- floatValue() : int형을 float형으로 변환한다 <return float>
- parseInt(String s) : 문자열을 int형으로 변환한다 <return int>
- toBinaryString(int i) : int형의 정수를 2진수 형태의 문자열로 변환한다 <return String>
- toHexString(int i) : int형의 정수를 16진수 형태의 문자열로 변환한다 <return String>
- toOctalString(int i) : int형의 정수를 8진수 형태의 문자열로 변환한다 <return String>
```

## LAB : String 클래스 활용
```Markdown
사용자에게 문자열을 받아서 문자열이 "www"로 시작하는지를 검사하는 프로그램을 작성해보자
단, 사용자가 "quit"를 입력하면 프로그램을 종료한다

- 결과
  문자열을 입력하세요 > www.google.com
  www.google.com 은 'www'로 시작합니다.
  문자열을 입력하세요 > naver.com
  naver.com 은 'www'로 시작하지 않습니다.
  문자열을 입력하세요 > quit

- 활용
  - equals()는 2개의 문자열이 일치하는지를 검사할 때 사용한다
    `if(str.equals("quit") == true){...}`
  - matches() 메소드는 문자열이 어떤 문자열을 포함하고 있는지를 검사할 때 사용
    `str.matches("^www\\.(.+)")` 를 통해 www. 로 시작하는지를 검사한다

```
```Java:Car
import java.util.Scanner;

public class StringTest{
    public static void main(String[] args){
        String str;
        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.println("문자열을 입력하세요> ");
            str = sc.next();
            if(str.equals("quit") == true){
                break;
            }
            if(str.matches("^www\\.(.+)")){
                System.out.println(str + " 은 'www'로 시작합니다.")
            }else{
                System.out.println(str + " 은 'www'로 시작하지 않습니다.")
            }
        }
    }
}
```
* * *