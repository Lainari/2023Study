public class CarTest {
    public static void main(String[] args) {
        // Car 클래스의 인스턴스 car 생성
        Car car = new Car();

        // 해당 인스턴스의 필드 gear 를 2로 설정
        car.changeGear(2);

        // 해당 인스턴의 필드 speed 를 10을 감소, 단, 10 이상이 아닌 경우 0으로 설정
        car.speedDown();

        // car 인스턴스를 호출하게 되어 car 인스턴스가 가리키고 있는 Car 클래스의 주소 값이 표출
        System.out.println(car);

        // 여기서 프로그램의 실행 결과가 : Car[color=white, speed=0, gear=2] 로 바꾸고 싶다면?
        // Car 클래스에서 인스턴스를 호출했을 때 해당 정보를 표현하기 위해 toString() 메소드를
        // Overriding 하여 표현해야 한다

        // 실제로 Car 클래스에서 toString 메소드를 오버라이딩하여 한 결과를 살펴보도록 하자
    }
}
