package lambda;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

import lambda.Person;
import lambda.Person.Sex;

public class Test {
    public static void main(String[] args) {

        // collection framework : list, set, map, stack, queue
        // collection framework 는 여러 개의 값을 저장하는 자바의 자료구조
        // 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 generic 이라는 기능을 이용해 지정할 수 있다
        // List<Person>, Set<Integer>, Map<String, Person>, ...

        LocalDate birthDate1 = LocalDate.of(2004, 10, 2);
        LocalDate birthDate2 = LocalDate.of(2000, 10, 12);
        LocalDate birthDate3 = LocalDate.of(1995, 10, 12);
        Person p1 = new Person("홍길동", birthDate1, Sex.MALE, "gdhong@gmail.com");
        Person p2 = new Person("일지매", birthDate2, Sex.FEMALE, "gmil@gmail.com");
        Person p3 = new Person("박문수", birthDate3, Sex.MALE, "mspark@gmail.com");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // System.out.println(p1.getAge());

        // printPersonOlderThan(list, 20);
        // printPersonsWithinAgeRange(list, 10, 20);

        // printPersons(list, new CheckPerson18to25());

        // printPersons(list, new CheckPerson() {
        //     public boolean test(Person p) {
        //         return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <=25;
        //     }
        // });

        printPersons(list, (p)->p.getGender()==Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);
    }
    // Approach 1: Create Methods That Search for Members That Match One Characteristic
    public static void printPersonOlderThan(List<Person> roster, int age) {
        // persons 리스트의 각 원소에 대해서 반복문을 수행한다.
        // 각 원소를 Person 타입의 변수 p에 저장.
        for (Person p : roster) {
            if (p.getAge() > age) {
                p.printPerson();
            }
        }
    }

    // Approach 2: Create More Generalized Search Methods
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high){
        for (Person p : roster) {
            if (p.getAge() >= low && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    // Approach 3: Specify Search Criteria Code in a Local Class
    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}

interface CheckPerson {
    boolean test(Person p);
}

class CheckPerson18to25 implements CheckPerson {
    public boolean test(Person p) {
        return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
    }
}