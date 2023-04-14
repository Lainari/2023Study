public class Car {
    private int speed;
    private String name;

    public Car(){
        System.out.println("속도는 " + speed + "km/h");
    }

    // 인스턴스 초기화 블록(Instance Initialization Block) 을 통해서 초기 값을 설정 할 수 있다
    {
        speed = 100;
    }
    // 위 블록은 어느 생성자에 정의해도 기본으로 가지게 되는 값임을 알 수 있다
    // 원래는 각 생성자 블록 안에 speed = 100; 을 넣어야하지만 이런 식으로 여러 클래스를 만들어도
    // 기본적으로 쓰는 값을 넣을 수 있음을 알 수 있다

    public Car(String name){
        this.name = name;
        System.out.println("속도는 " + speed + "km/h");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("그랜저");
    }
}
