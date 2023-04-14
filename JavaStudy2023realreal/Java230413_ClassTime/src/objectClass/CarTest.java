package objectClass;
public class CarTest {
    public static void main(String[] args) {
//        Car car = new Car();
//        Class classVar = car.getClass();
//        // getClass() 메소드는 Class 의 정보를 담고있는 Class Type 객체가 Return 됨
//        // 결과 : class objectClass.Car
//        //      Class 형  패키지명 . 클래스명
//        System.out.println(classVar.getName());
//
//        System.out.println("브랜드 : " + car.getBrand() + ", 모델 : " + car.getModel());
        Car car1 = new Car("현대","그랜저");
        Car car2 = new Car(new String("현대"),new String("그랜저"));

        System.out.println(car1.equals(car2)); // 결과 : false
        // Override 이후에는 true 로 반환
        System.out.println(car1.model == car2.model);
    }
}
