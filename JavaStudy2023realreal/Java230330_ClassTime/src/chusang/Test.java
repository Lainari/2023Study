package chusang;

public class Test {
    public static void main(String[] args) {
        // Shape s = new Shape(); 추상 클래스는 객체 생성 불가능
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Triangle t = new Triangle();

        r.draw();
        r.move(10, 20);
        c.draw();
        c.move(20, 30);
        t.draw();
    }
}
