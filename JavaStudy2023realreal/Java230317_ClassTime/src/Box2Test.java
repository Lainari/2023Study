// 교재 282p
public class Box2Test {
    public static void main(String[] args) {
        Box2 obj1 = new Box2(10, 20, 50);
        Box2 obj2 = new Box2(10, 20, 50);

        System.out.println("obj1 == obj2 : " + obj1.isSameBox(obj2));
    }
}
