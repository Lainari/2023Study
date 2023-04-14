// 교재 288p
public class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2("S600", "White", 80); // 생성자 호출
        Car2 c2 = new Car2("E500", "Blue", 20); // 생성자 호출
        int n = Car2.getNumberOfCars(); // 정적 메소드 호출
        System.out.println("지금까지 생성된 자동차 수 = " + n);
    }
}
