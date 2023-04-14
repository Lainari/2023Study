class Parent{
    public void test(String s) {
        System.out.println("부모");
    }
}

class Child extends Parent{
    @Override
    public void test(String s) {
        System.out.println("자손");
    }
}
public class Lab {

    public static void main(String[] args) {
        Child c = new Child();
        c.test("A");
    }
}
