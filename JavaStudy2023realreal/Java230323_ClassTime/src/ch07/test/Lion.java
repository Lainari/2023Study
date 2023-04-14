package ch07.test;

import ch07.Animal;

public class Lion extends Animal{
    private int legs = 4;

    public int getLegs(){
        return legs;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public void roar(){
        System.out.println("roar()가 호출되었음");
    }

    public void test(){
        this.eat(); // package 는 다르지만, 부모에게 상속을 받아서 protected 메소드는 visual 가능
        // this.sleep();
        // -> sleep()는 Default 생성자로서 자식에게는 접근이 불가능하다
    }
}

