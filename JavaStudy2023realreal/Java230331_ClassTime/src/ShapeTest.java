// 교재 337p.

class Shape{
    protected int x, y;
    // 각 도형들은 2차원 공간에서 도형의 위치를 나타내는 기준점(x, y)을 가진다
    // 이것은 모든 도형에 공통적인 속성이므로 부모 클래스인 Shape 에 저장한다
}

class Rectangle extends Shape{
    private int width, height;
    // Shape 에서 상속받아 사각형을 나타내는 클래스 Rectangle 을 정의
    // Rectangle 은 추가적으로 width 와 height 변수를 가짐
}

class Triangle extends Shape{
    private int base, height;
}

class Circle extends Shape{
    private int radius;
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1, s2;

        s1 = new Shape();   // 당연 (본인거를 호출하니까)
        s2 = new Rectangle(); // 자식 클래스 객체는 부모 클래스 객체처럼 취급 될 수 있기 떄문에 적법함

        Shape s = new Rectangle(); // 부모 클래스의 참조변수로 자식 클래스의 객체를 가리키는 것은 OK

        s.x = 0; // shape 클래스의 필드와 메소드에 접근하는 것은 OK
        s.y = 0;
        // s.width = 100; s 를 통해서는 Rectangle 클래스의 필드와 메소드에 접근할 수 없다!!!
        // s.height = 100;
    }
}
