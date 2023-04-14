// 정적 초기화 블록, 교재 290p
public class MyClass {
    static int x; // 정적 변수
    int y;

    static {
        x = 10;
        System.out.println("정적 블록이 호출되었음!");
    }
    // 만약 정적 초기화 블록을 사용하지 않고 정적 변수를 초기화하려면 정적 메소드로 작성하면 된다
    /* public static int myVar = initialize();
       private static void initialize(){
        // 정적 변수를 초기화 한다
       }
    *
    * */
}
