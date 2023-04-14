package test2;
import test.Person;          // 타 패키지의 클래스를 접근하기 위해 import 사용
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(15);
        System.out.println(p.getAge());
    }
}

