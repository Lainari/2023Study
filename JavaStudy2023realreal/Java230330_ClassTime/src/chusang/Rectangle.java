package chusang;

class Rectangle extends Shape{
    private int width, height;
    public void draw(){ // 추상 메소드 구현
        // 자식 클래스 Rectangle 에서 부모 클래스의 추상 메소드 draw() 가 실제 메소드로 구현한다.
        // 자식 클래스에서 추상 메소드를 구현하지 않으면 컴파일 오류가 발생한다.
        System.out.println("사각형 그리기 메소드");
    }
};
