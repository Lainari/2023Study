// 정적맴버 예제, 교재 286p
public class Car1 {
    private String model;
    private String color;
    private int speed;

    // 자동차의 시리얼 번호
    private int id;
    static int numbers = 0; // 생성된 Car 객체의 개수를 위한 정적 변수

    public Car1(String m, String c, int s){
        model = m;
        color = c;
        speed = s;
        // 자동차의 개수를 증가하고 id 에 대입한다
        id = ++numbers;
    }
}
