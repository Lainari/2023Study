// 교재 333p.

package chusang;

abstract class Shape{ // 추상 클래스 Shape 를 선언한다. 추상 클래스로는 객체를 생성할 수 없다
    private int x, y;

    // Shape 를 상속받는 자식 클래스는 move 메서드를 그대로 사용하면 된다.
    // 추상 클래스라고 하더라도 추상 메서드가 아닌 보통의 메서드도 가질 수 있음을 유의하자
    public void move(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("도형을 [ " + x + ", " + y + " ] 로 이동합니다");
    }

    // Shape 를 상속받는 자식 클래스는 화면에 그리는 기능을 가져야 하지만
    // 그려지는 모양은 다 다르다.
    // 따라서, Shape 클래스는 그리는 기능을 수행하는 메소드의 시그니처만 선언하고
    // 메소드 몸체의 구현은 자식 클래스가 하도록 강제하자.
    public abstract void draw(); // 추상 메소드를 선언한다
    // 추상 메소드를 하나라도 가지면 추상 클래스가 된다.
    // 추상 메소드를 가지고 있는데도 abstract 를 class 앞에 붙이지 않으면 컴파일 에러가 발생
};

class Cricle extends Shape{
    private int radius;
    public void draw(){ // 추상 메소드 draw()가 실제 메소드로 구현한다
        System.out.println("원 그리기 메소드");
    }
}