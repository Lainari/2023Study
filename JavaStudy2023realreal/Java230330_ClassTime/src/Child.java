// 교재 321p.
public class Child extends Parent{
    // 메소드 오버라이드
    public void print(){
        super.print(); // 부모 클래스의 메소드 호출
        System.out.println("자식 클래스의 print() 메소드");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.print();
    }
}
