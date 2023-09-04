package lambda;
import java.time.LocalDate;
import  java.util.*;
public class Test2 {
    public static void main(String[] args) {
        /*
        *  1. Person 객체를 5개 이상 생성해 ArrayList 에 저장하시오.
        *  2. PrintGender 메소드를 호출하시오.
        *   가. printGender 메소드는 1번에서 생성한 ArrayList 의 각 원소에 대해
        *       그 원소가 남자이면 "ㅇㅇㅇ은 남자입니다."
        *       그 원소가 여자이면 "ㅇㅇㅇ은 여자입니다." 를 출력한다
        *  3. Do it Now
        *   가. printGender 메소드를 호출할 때, CheckPerson 객체를 인자로 넘겨줘야 하는데,
        *       그 객체가 남자인지 여자인지를 판단해서 남자이면 true 를 여자이면 false 를 반환한다
        * */
        Person p1 = new Person("김씨", Person.Sex.MALE);
        Person p2 = new Person("이씨", Person.Sex.FEMALE);
        Person p3 = new Person("박씨", Person.Sex.MALE);
        Person p4 = new Person("최씨", Person.Sex.FEMALE);
        Person p5 = new Person("황씨", Person.Sex.MALE);
        List<Person> user = new ArrayList<>();
        user.add(p1);
        user.add(p2);
        user.add(p3);
        user.add(p4);
        user.add(p5);

        /* CheckPerson 인터페이스 객체를 만드는 방법 3가지
        *  1. 클래스를 정의하고 그 클래스의 객체를 생성
        *  2. 무명 클래스로 생성
        *  3. 람다식으로 생성
        * */
        printPersons(user, (p) -> p.getGender()== Person.Sex.MALE);
        printPersons(user, new CheckGender());
    }

    /*
    * Java 에서는 유용하게 사용할 수 있는 Functional Interface 를 제공하고 있다.
    * Functional Interface 는 오직 하나의 추상 메소드를 가지는 제네릭 인터페이스이다.
    * 즉, 이 타입의 객체를 원하는 곳에는 람다식으로 전달할 수 있다.
    * */
    public static void printPersons(List<Person> list, CheckPerson cp){
        for(Person p : list){
            if(cp.test(p)){
                System.out.println(p.getName() + "은 남자입니다.");
            }else{
                System.out.println(p.getName() + "은 여자입니다.");
            }
        }
    }
}