public class BoxTest {
    public static void main(String[] args) {
        // box 클래스의 인스턴스 생성
        // 하지만 해당 매개 변수를 갖는 생성자가 지정 되어 있지 않으므로 에러가 발생한다
        // Box box = new Box(10, 20, 30);

        // 따라서 해당 매개 변수를 갖는 생성자를 만들어 에러 발생을 막도록 하자
        Box box = new Box(10, 20, 30);

        // box 클래스의 필드의 값을 직접 호출하여 부피를 계산한다
        // 원래라면 private 접근 제어자를 사용하여 직접 접근을 막아야하지만, 예외인 걸로 친다
        int volume = box.height * box.length * box.width;

        // 해당 부피 계산 값을 표현한다
        System.out.println("박스의 부피 : " + volume);
    }
}
