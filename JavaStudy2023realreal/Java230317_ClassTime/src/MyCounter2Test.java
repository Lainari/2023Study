// 교재 275p
public class MyCounter2Test {
    public static void main(String[] args) {
        MyCounter2 obj = new MyCounter2();

        System.out.println("obj.value = " + obj.value);
        obj.inc(obj); // 1 증가
        System.out.println("obj.value = " + obj.value);
    }
}
