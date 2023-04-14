// 교재 286p
public class Car1Test {
    public static void main(String[] args) {
        Car1 c1 = new Car1("S600", "White", 80);
        Car1 c2 = new Car1("E500", "Blue", 20);
        int n = Car1.numbers; // 정적 변수
        System.out.println("지금까지 생성된 자동차 수 = " + n);
    }
}
