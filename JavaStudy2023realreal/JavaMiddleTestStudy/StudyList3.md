# chp 7 : 상속

## 상속의 개념
- 상속은 기존에 존재하는 클래스로부터 코드와 데이터를 이어받고 자신이 필요한 기능을 추가하는 기법
```Java
class Childclass extends Parentclass
{
    // 여기에 필드를 추가한다
    // 여기에 메소드를 추가한다
}

public class Car{
    int speed;
    public void setSpeed(int speed){
        this.speed = speed;
    }
}

public class SportsCar extends Car
{
    boolean turbo;

    public void setTurbo(boolean flag){
        turbo = flag;
    }
}
```

### 무엇이 상속되는가?
- 부모 클래스의 필드와 메소드가 자식 클래스로 상속된다

* * *
## LAB : 동물 예제
```Markdown
- 부모 클래스 Animal : weight, picture, eat(), sleep()
- 자식 클래스
  - Lion : legs, roar()
  - Eagle : wings, fly()
- 결과 : eat()가 호출되었음, sleep(), roar - eat - sleep - fly
```
```Java:Animal.java
public class Animal{
    
}
```