package test;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(15);
        System.out.println(p.getAge());

        System.out.println(p.getName());
        System.out.println(p.getDept());
        String d = p.dept2; // protected 는 같은 패키지에서 접근이 가능함
        System.out.println(d);

        // 만약, Person 클래스에서 age 변수가 private 이 아니라면 아래의 코드가 동작 가능하다
        // p.age = -200
        // System.out.println(p.age);  결과 : -200
    }
}
