class Person{
    void speak(){
        System.out.println("speak() 메소드 선언");
    }
}

class Student extends Person{
    @Override
    void speak(){
        System.out.println("학생 speak() 메소드 선언");
    }
}

class GraduateStudent extends Person {
    @Override
    void speak(){
        System.out.println("대학원생 speak() 메소드 선언");
    }
}
public class Review {
    public static void main(String[] args) {
        Person p = new Person();
        p = new Student();
        p.speak();
        // 자바에서는 참조 변수의 타입에 관계 없이 실제 그 변수가 가리키는 변수의 객체 메소드를 부른다
        p = new GraduateStudent();
        p.speak();
    }
}
