package polymorphism;
public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        Shape s = new Shape();
        // s.draw();
        shapes[0] = s;

        s = new Rectangle();
        // s.draw();
        shapes[1] = s;

        s = new Triangle();
//        s.draw();
        shapes[2] = s;

        s = new Circle();
//        s.draw();
        shapes[3] = s;

        shapes[4] = new Polygon();

        drawShapes(shapes);
    }
    public static void drawShapes(Shape[] shapes){
//        for(Shape s : shapes){
//            s.draw(); 아래와 같은 의미를 같는다
//        }
        for(int i = 0; i < shapes.length; i++){
            shapes[i].draw();
        }
    }
}
