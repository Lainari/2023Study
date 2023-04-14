// 교재 274p
public class MyCounter1Test {
    public static void main(String[] args) {
        MyCounter1 obj = new MyCounter1();
        int x = 10;

        obj.inc(x); // inc() 메소드로 변수 x의 복사본이 전달되기 떄문에 inc()는 x의 값에 영향을 주지 않는다
        System.out.println("x = " + x);
    }
}
