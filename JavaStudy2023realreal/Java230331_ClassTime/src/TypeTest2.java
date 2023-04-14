// 교재 336p.
class A1{
    A1(){}
}
class B1 extends A1{
    B1(){}
}
public class TypeTest2{
    public static void main(String[] args) {
        A1 a = new B1(); // OK
    }
}
