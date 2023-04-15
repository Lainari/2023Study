public class MyTest {
    public static void main(String[] args) {
        int val = 10; // 기초 변수 val 생성
        increase(val); // increase 메서드에 기초 변수 val 을 인자값으로 넣기
        System.out.println(val);

        // 따라서 최종적으로 val 을 호출하게 되면, 값은 변하지 않은 채 10 을 호출하게 된다

        // Result : 10
    }

    // increase method 는 static 으로 따로 instance 객체를 생성하지 않고도
    // 해당 메소드를 호출 할 수 있다
    public static void increase(int val){
        val = val +1; // 파라미터에서 기초 변수는 해당 값을 복사해서 전달하므로
        // 이 메소드 안에서만 할당 되고 실제로 main 메소드 안에 있는
        // val 변수의 값은 변하지 않게 된다
    }
}
