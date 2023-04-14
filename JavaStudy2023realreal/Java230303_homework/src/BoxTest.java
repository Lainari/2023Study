// 클래스 Box의 필드를 출력하는 객체를 생성하여 해당 정보 출력

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box();
        box.width = 20;
        box.length = 20;
        box.height = 30;
        System.out.println("상자의 가로, 세로, 높이는 " + box.width + ", " + box.length + ", " +
                box.height + "입니다.");
    }
}
