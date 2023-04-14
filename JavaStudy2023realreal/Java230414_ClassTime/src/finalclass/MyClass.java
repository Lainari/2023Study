package finalclass;

public class MyClass /*extends MyFinalClass*/{

    // 종단 클래스인 MyFinalClass 를 상속하려 하고 있기 때문에
    // 컴파일 자체가 안된다
    public static void main(String[] args) {
        System.out.println("Final Class 는 상속할 수 없습니다!");
    }
}
