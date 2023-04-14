// 교과서 259p
public class Student {
    private int number;
    private String name;
    private int age;

    Student(){
        number = 100;
        name = "New Student";
        age = 18;
    }

    Student(int number, String name, int age){
        this.number = number;
        this.name = name;
        this.age = age;
    }

    @Override
    // @Override : 이를 명시하면 컴파일러가 찾아준다, 이 녀석이 재정의하려는것이 있는가?
    // toString() 메소드는 Object 클래스에 들어있기 때문에 상속 받는 것이다
    public String toString(){
        return "Student [number = " + number + ", name = " + name + ", age = " + age + "]";
    }
}
