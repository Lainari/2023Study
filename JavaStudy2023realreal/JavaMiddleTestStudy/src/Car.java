public class Car {

    // Car 클래스의 필드 생성, 해당 필드들은 private 접근 제어자로 설정되어 있다
    // private 접근 제어자는 같은 클래스가 아닌 이상 접근이 불가능!

    private String color = "white";
    private int speed;
    private int gear = 0;

    // 위의 private 로 된 필드들의 값을 변환하기 위해 메소드를 활용한다
    public void changeGear(int g){
        gear = g;
    }
    public void speedUp(){
        speed += 10;
    }
    public void speedDown(){
        if (speed >= 10){
            speed -= 10;
        }else{
            speed = 0;
     
        }
    }
    // 필드들의 값을 표현하는 test 메소드 구현
    public void test(){
        System.out.println("color : " + color + ", gear : " + gear + ", speed : " + speed);
    }

    // toString() 메소드 활용
    // toString 메소드 : Object 클래스가 가진 메소드 중 하나로,
    // 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
    // 현재 Car 클래스의 인스턴스를 호출할 경우 Car 클래스의 주소값이 toString 에 의하여 리턴하게 됨
    // 그럼 해당 메소드를 Overriding 하여 해당 리턴 값을 바꿔 주면 되는 것이다!

    @Override // 오버라이드 어노테이션
    // 해당 메서드가 재정의 하려는 것이 있는 지 검색 -> 미 발견시 에러
    // 실제로 상속 받는 것에 이 메소드가 있는지 검색
    // toString 메소드는 최상위 클래스인 Object 클래스에 들어 있으므로 상속을 받음
    public String toString(){
        return "Car[color="+color+", speed=" + speed + ", gear=" + gear + "]";
    }

}
