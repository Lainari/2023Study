interface Student{
    String stdName = "홍길동";
    String getName();
}

public class AnonymousClassTest {
    public static void main(String[] args) {
        Student st1 = new Student(){
            public String getName(){
                return stdName;
            }
        };
    }
}
