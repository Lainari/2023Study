package ch07.test;

import ch07.Eagle;
// import ch07.Animal;

public class AnimalTest /*extends Animal*/{
    // 만일 AnimalTest 에 Animal(ch07 Package) 를 상속시킨다면, AnimalTest Class 에서 eat() 메소드를 사용할 수 있다
    // 하지만 그럼에도 같은 패키지가 아니므로 sleep() 는 여전히 사용할 수 없는 것!

    public static void main(String[] args) {
        Lion lion = new Lion();
/*      lion.eat();
        -> 부모(ch07 package)로부터 받은 protected
        AnimalTest 는 Animal 의 자식이 아닌뿐더러 같은 패키지가 아니라서 부를 수 없음
//      lion.sleep();

*/
        lion.roar();
        System.out.println("----------------------------");
        Eagle eagle = new Eagle();
//      eagle.eat();
//      eagle.sleep();
        eagle.fly();
    }
}
