// 상속 예제 : 자동차 - 스포츠카
public class SportsCarTest {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.setSpeed(150);
        sc.setTurbo(true);

        System.out.println(sc);
    }
}
