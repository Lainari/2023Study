// 자동차를 나타내는 클래스 정의
// 속성 : 색상, 현재 속도, 현재 기어 등
// 동작 : 기아 변속, 가속, 감속 등

public class Car {
    String color; // 색상
    int speed;    // 현재 속도
    int gear;     // 현재 기어

    @Override         // Override : 변수나 메소드의 내용을 변경할 수 있으며 동일한 메소드 호출에도 각 개체 마다 다른 생동이 가능
    public String toString(){   // toString() 메소드는 필드의 값을 하나의 문자열로 만들어서 반환함
        return "Car [color = " + color + ", speed = " + speed + ", gear = " + gear + "]";
    }

    void changeGear(int argGear){
        gear = argGear;
    }

    void speedUp(){
        speed = speed + 10;
    }

    void speedDown(){
        speed = speed - 10;
    }
}
