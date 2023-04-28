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
사용자로부터 값을 받아서 배열을 채운 후에 배열에 저장된 모든 값의 평균을 구하여 출력하는 프로그램 작성
- ArrayProc 클래스
  - getValue(array:int[]) : void
  - getAverage(array:int[]) : double
- 결과 : 성적을 입력하시오: ~~ 평균은 = 
```
```Java:ArrayProc.java
import java.util.Scanner;

public class ArrayProc{
    public void getValue(int[] array){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.print("성적을 입력하시오:");
            array[i] = scan.nextInt();
        }
    }
    public double getAverage(int[] array){
        double total = 0;
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        return total / array.length;
    }

    public static void main(String args[]){
        final static int STUDENTS = 5;

        int[] scores = new int[STUDENTS];
        ArrayProc obj = new ArrayProc();
        obj.getValues(scores);
        System.out.println("평균은 = " + obj.getAverage(scores));
    }
}
```

- 메소드는 작업의 결과값을 반환할 수 있다
- int, double 값도 반환할 수 있지만 객체도 반환할 수 있지만 이때는 참조값만 반환한다
```Java:Box.java
public class Box{
    int width, length, height;
    int volume;

    Box(int w, int l, int h){
        width = w;
        length = l;
        height = h;
        volume = width * length * height;
    }

    Box whosLargest(Box box1, Box box2){
        if(box1.volume > box2.volume){
            return box1;
        }else{
            return box2;
        }
    }

    public static void main(String args[]){
        Box obj1 = new Box(10, 20, 50);
        Box obj2 = new Box(10, 30, 30);

        Box largest = obj1.whosLargest(obj1, obj2);
        System.out.println("(" + largest.width + "," + largest.length + "," + largest.height + ")");
    }
}
```

* * *
## LAB : 같은 크기의 Box 인지 확인하기
- 2개의 박스가 같은 치수인지를 확인하는 메소드 isSameBox() 작성
  - 같으면 true, 다르면 false 반환
```Java:Box.java
public class Box{
    private int width, length, height;

    Box(int w, int l, int h){
        width = w;
        length = l;
        height = h;
    }
    
    public boolean isSameBox(Box obj){
        if((obj.width == width) && (obj.length == length) && (obj.height == height)){
            return true;
        }else{
            return false;
        }
    }
```

* * *
## 정적 멤버(클래스 멤버)
- 정적 멤버는 모든 객체를 통틀어서 하나만 생성되고 모든 객체가 공유하는 것
```Markdown
클래스이름.변수이름
```
- 따로 객체를 생성할 필요 없이 클래스명과 변수를 호출하면 되는 구조로 되어있다
- 메소드 또한 클래스 이름에 멤버 연산자(.)를 통해 호출한다
```Markdown
클래스이름.메소드이름(인수1, 인수2, ...)
```
- 예시로는 Math 클래스에 들어있는 각종 수학 메소드들이다
```Java
double value = Math.sqrt(9.0);
```
- 제곱근을 구하는 sqrt() 메소드는 정적 메소드로 선언되고 클래스 이름인 Math를 통하여 호출한다
```Java:Car.java
public class Car{
    private String model;
    private String color;
    private int speed;

    // 자동차의 시리얼 번호
    private int id;
    //실체화된 Car 객체의 개수를 위한 정적 변수
    private static int numbers = 0;

    public Car(String m, String c, int s){
        model = m;
        color = c;
        speed = s;

        // 자동차의 개수를 증가시키고 id에 대입한다
        id = ++numbers;
    }
    // 정적 메소드
    public static int getNumberOfCars(){
        return numbers;
    }

    public static void main(String args[]){
        Car c1 = new Car("S600", "white", 80);
        Car c2 = new Car("E500", "blue", 20);
        int n = Car.getNumberOfCars();
        System.out.println("지금까지 생성된 자동차 수 = " + n);
    }
}
```

### 정적 멤버 사용 시 주의할 점
- 객체 안에서만 존재하는 인스턴스 변수들은 사용할 수 없다
- 정적 메소드에서 인스턴스 메소드를 호출하면 오류가 된다
- 정적 메소드에서 정적 메소드를 호출하는 것은 가능하다
- 정적 메소드는 this 키워드를 사용할 수 없다(참조할 인스턴스가 없음)

### 상수
- 상수를 정의할 때 static 과 final 수식어를 동시에 사용하는 경우가 많다
```Java
static final int MAX_SPEED = 350;
```

### 정적 초기화 블록
- 정적 초기화 블록은 중괄호 {}로 감싸여진 코드 블록으로 초기화 하는데, 앞에 static이 붙여진다
```Java
static{
    // 정적 변수들을 초기화
}
```

* * *
## LAB : 직원 클래스 작성하기
- 직원을 나타는 클래스에서 직원들의 수를 카운트한다
  - 객체가 하나씩 생성될 때 마다 생성자에서 정적 변수 count를 증가
  - 객체가 소멸될 때 호출되는 finalize() 메소드에서 count 감소시키기
```Java:Employee.java
public class Employee{
    private String name;
    private double salary;

    private static int count;

    Employee(String n, double s){
        name = n;
        salary = s;
        count++;
    }

    protected void finalize(){
        count--;
    }

    public static int getCount(){
        return count;
    }

    public static void main(String args[]){
        Employee e1, e2, e3;
        e1 = new Employee("김철수", 35000);
        e2 = new Employee("최수철", 50000);
        e3 = new Employee("김철호", 20000);

        int n = Employee.getCount;
        System.out.println("현재의 직원수 = " + n);
    }
}
```

* * *
## 내장 클래스
- 외부 클래스 : 내부에 클래스를 가지고 있는 클래스
- 내장 클래스 : 클래스 내부에 포함되는 클래스
```Java
class OuterClass{
    ...
    class NestedClass{
        ...
    }
    ...
}
```

### 내부 클래스
- 클래스 안에 선언된 클래스
```Markdown
접근 지정자 : public, private, protected 또는 package(default) 일수도 있다
```
- 내부 클래스는 외부 클래스의 인스턴스 변수와 메소드를 전부 사용할 수 있다
- private로 선언되어 있어도 접근이 가능!
```Java
public class OuterClass{
    private int value = 10;

    class InnerClass{
        public void myMethod(){
            System.out.println("외부 클래스의 private 변수 값: " + value);
        }
    }

    OuterClass(){
        InnerClass obj = new InnerClass();
        obj.myMethod();
    }
}
```