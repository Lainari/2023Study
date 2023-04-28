# chp 6 : 클래스와 메소드 심층 탐구

## 접근 제어(Access Control)
- 클래스의 멤버에 접근하는 것을 제어
```Markdown
접근지정자 : 클래스 | 패키지 | 자식 클래스 | 전체 세계 |
public    |   O    |   O   |      O      |     O    |
protected |   O    |   O   |      O      |     X    |
default   |   O    |   O   |      X      |     X    |
private   |   O    |   X   |      X      |     X    |
```
```Java:Test.java
class A{
    private int a; // 전용
    int b;         // 디폴트
    public int c;  // 공용
}

public class Test{
    public static void main(String[] args){
        A obj = new A(); // 객체 생성

        XX obj.a = 10; // 전용 멤버는 다른 클래스에서는 접근 안 됨
        // 아래 두 멤버는 접근가능
        obj.b = 20; 
        obj.c = 30;
    }
}
```

### 접근자와 설정자
- 정보 은닉(information hiding) : 구현의 세부 사항을 클래스 안에 감춰야 함
  - 클래스 안의 데이터를 외부에서 마음대로 변경하지 못하게 하는 것을 구현해야 함
```Markdown
따라서 클래스 안에 변수를 선언할 때는 private를 붙이는 것이 좋다
```
```Java:GetterSetter.java
public class GetterSetter{
    private int a; // private 로 인하여 외부에서 접근이 제한됨
    
    // 두 메서드는 public 으로 외부에서 접근가능
    // 또한 두 메서드는 private 멤버와 같은 클래스에 있으니 해당 변수를 사용할 수 있다
    public int getA(){
        return a;
    }

    public void setA(setA){
        a = setA
    }
}
```

* * *
## LAB : 안전한 배열 만들기
```Markdown
배열을 감싸는 클래스를 작성하고 배열 요소에 접근할 때 접근자와 설정자를 사용
- private : a[] int
- public length : int
- 생성자 : SafeArray(int size)
  - a = new int[size]
  - length = size
- 설정자
  - 0 이상 length 미만 => 요소 값 설정
  - 아니면 경고문
- 접근자
  - 0 이상 length 미만 => return 요소
  - 아니면 -1 리턴
```
```Java:SafeArray.java
public class SafeArray{
    private int a[];
    public int length;

    public SafeArray(int size){
        a = new int[size]
        length = size;
    }

    public int get(int index){
        if(index >= 0 && index < length){
            return a[index];
        }
        return -1;
    }
    public void put(int index, int value){
        if(index >= 0 && index < length>){
            a[index] = value;
        }else{
            System.out.println("잘못된 인덱스 " + index);
        }
    }

}
```

* * *
## 생성자(Constructor)
- 객체가 생성될 때 객체를 초기화하는 특수한 메소드
```Java
public class Car{
    // 클래스 이름과 동일한 메소드가 바로 생성자
    // 객체의 초기화를 담당한다
    Car(){ 
        ...
    }
}
```

### new 연산자와 생성자
- new 연산자는 다음과 같은 형식을 가진다
```Java
참조변수 = new 클래스이름(인수);
```
- new 연산자는 새로 생성된 객체를 가리키는 참조값을 반환하니, 이 값은 참조 변수에 저장됨

* * *
## LAB : Television 생성자
```Markdown
- Television에 생성자를 추가하여서 업그레이드 하여 보자
  - 생성자 : channel, volume, onOff 필드를 인자값을 통해 초기화 할 것
  - print 메소드(void) : channel과 volume의 값을 출력
```
```Java:Television.java
public class Television{
    private int channel;
    private int volume;
    private boolean onOff;

    Television(int c, int v, boolean o){
        channel = c;
        volume = v;
        onOff = o;
    }

    void print(){
        System.out.println("채널은 " + channel + "이고, 볼륨은 " + volume + "입니다.");
    }
}
```
## LAB : 상자를 나타내는 Box 클래스 작성
```Markdown
- Box 클래스를 작성하되 다음과 같은 필드와 메소드를 가진다
  - 필드
    - width : int
    - length : int
    - height : int
    - volume : int
  - 메소드
    - getVolume() : int
    - Box(w:int, l:int, h:int)
- Box 클래스에 상자의 가로, 세로, 높이를 초기화하는 생성자를 추가
- 부피를 계산하는 getVolume()을 추가하여서 객체 생성 후에 상자의 부피를 계산하기
```
```Java:Box.java
public class Box{
    private int width;
    private int length;
    private int height;
    private int volume

    Box(int w, int l, int h){
        width = w;
        length = l;
        height = h;
        volume = width * length * height;
    }

    public int getVolume(){
        return volume;
    }
}
```

* * *
## 생성자 오버로딩
- 메소드처럼 생성자도 오버로딩될 수 있다
```Java
public class Student{
    private int number;
    private String name;
    private int age;

    Student(){
        number = 100;
        name = "New Student";
        age = 18;
    }
    Student(int number, String name, int age){
        this.number = number;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student [number=" + number + ", name=" + name + ", age=" + age + "]";
    }

    public static void main(String args[]){
        Student std1 = new Student();
        Student std2 = new Student(111, "Kim", 25)

        결과
        Student [number=100, name=New Student, age= 18]
        Student [number=111, name=Kim, age= 25]
    }
}
```

### this로 현재 객체 나타내기
- this를 이용하여 현재 객체의 어떤 멤버도 참조할 수 있다
- this()를 이용하면 생성자 호출이 된다
```Java:point.java
public class Point{
    private int x = 0;
    private int y = 0;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    Point(){
        this(1, 1);
    }
}
```

* * *
## LAB : 날짜를 나타내는 Date 클래스 작성하기
```Markdown
- 날짜를 나타내는 Date 클래스를 작성하고 테스트해보자
  - 연도와 날짜는 정수형
  - 월은 문자열로 저장
  - 생성자와 메소드는 다음과 같다
    - Date(y : int, m : String, d : int)
    - Date(y : int)
    - Date()
    - toString()
- 결과
  - Date [year=2015, month=8월, day=10]
  - Date [year=2020, month=1월, day=1]
  - Date [year=1900, month=1월, day=1]
```
```Java:Date.java
public class Date{
    private int year;
    private String month;
    private int day;

    Date(int year, String month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    Date(int year){
        this(year, "1월", 1);
    }
    Date(){
        this(1900, "1월", 1);
    }
    
    @Override
    public String toString(){
        return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
    }
}
```

## LAB : 시간을 나타내는 Time 클래스 작성하기
```Markdown
- 시간을 나타내는 클래스 Time의 생성자를 작성하고 테스트해 보자
- 변수
  - hour
  - minute
  - second
- 생성자 및 메서드
  - Time()
  - Time(h: int, m:int, s:int)
    - 단, 23시 이내, 59분 이내, 59초 이내
  - toString() : String -> 현재 시각을 화면에 출력
```
```Java:Time.java
public class Time{
    private int hour;
    private int minute;
    private int second;

    Time(){
        this(0, 0, 0);
    }
    Time(int hour, int minute, int second){
        this.hour = ((hour >= 0 && hour < 24) ? h : 0);
        this.minute = ((minute >= 0 && minute < 60) ? minute : 0);
        this.second = ((second >= 0 && second < 60) ? second : 0);
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
```

## LAB : 원을 나타내는 Circle 클래스 작성하기
```Markdown
- 원을 나타내는 Circle 클래스 작성하기
  - radius:int, center: Point
  - Circle(p: Point, r:int)
  - toString():String

  - 중심 표현은 Point 클래스 작성
    - x:int, y:int
    - Point(a: int, b: int)
    - toString() : String
    - 해당 Point 객체를 Circle 클래스 안에 포함하기
```
```Java:Point.java
public class Point{
    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "[x=" + x + ", y=" + y + "]";
    }
}
```
```Java:Circle.java
public class Circle{
    private int radius;
    private Point center;

    public Circle(Point p, int radius){
        center = p;
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle [radius=" + radius + ", center=" + center + "]";
    }

    public static void main(String args[]){
        Point p = new Point(25, 78);
        Circle c = new Circle(p, 10);
        System.out.println(c);
    }
}
```

* * *
## 다른 필드 초기화 방법
- 클래스 안에 필드를 선언할 때 초기값을 줄 수 있다
```Java
public class Hotel{
    public int capacity = 10;
    private boolean full = false;
}
```

### 인스턴스 초기화 블록(Instance initializer block)
```Java
{
    // 여기서 인스턴스 변수를 초기화 할 수 있다
}

public class Car{
    int speed;

    Car(){
        System.out.println("속도는 " + speed);
    }
    {
        speed = 100;
    }
}
```
- 인스턴스 초기화 블록은 어떤 생성자가 선택되든지 상관없이 어떤 공통적인 코드를 실행하고자 할 때 편리함
- 인스턴스 초기화 블록을 가장 먼저 호출되어 실행된다!

* * *
## 메소드로 객체 전달하고 반환하기
- 자바에서 인수에서 매개 변수로 값이 전달되는 방법은 "값에 의한 호출(call-by-value)"이다
- 하지만 인수가 기초 변수인 경우와 참조 변수인 경우의 차이는 분명 존재한다

### 기초 변수가 전달되는 경우
```Markdown
전달하는 인수가 기초 변수인 경우에는 인수의 값이 매개 변수로 복사된다
```
```Java
public class MyCounter{
    int value;
    void inc(int a){
        a = a + 1;
    }
    
    public static void main(String args[]){
        MyCounter obj = new MyCounter();
        int x = 10;

        obj.inc(x);
        System.out.println("x = " + x);
        결과 : x = 10
    }
}
```
- inc() 메소드안에서 value의 값을 변경하여도 호출에 사용된 변수 x에는 영향을 주지 않음

### 객체가 전달되는 경우
- 객체를 메소드로 전달하게 되면 참조 변수의 값이 복사 되어서 전달됨
```Java
public class MyCount{
    int value = 0;
    void inc(MyCounter ctr){
        ctr.value = ctr.value + 1;
    }

    public static void main(String args[]){
        MyCounter obj = new MyCounter();

        System.out.println("obj.value = " + obj.value);
        obj.inc(obj);
        System.out.println("obj.value = " + obj.value);

        결과 : obj.value = 0
               obj.value = 1
    }
}
```

### 배열이 전달되는 경우
- 자바에서는 배열도 객체이므로 객체가 전달되는 것과 동일하게 처리된다
```Java
public class ArrayProc{
    void inc(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] + 1;
        }
    }
    public static void main(String args[]){
        int[] list = {1, 2, 3, 4, 5};
        ArrayProc obj = new ArrayProc();

        obj.inc(list);

        for (int i = 0l i < list.length; i++){
            System.out.println(list[i] + " ");
        }
    }

    결과 : 2 3 4 5 6
}
```

* * *
## LAB : 배열에 저장된 값의 평균 구하기
```Markdown
```