// 교과서 261p
public class Rectangle {
    private int x, y;
    private int width, height;

    // this 를 이용하여 다른 생성자를 호출하기
    Rectangle(){
        this (0, 0, 1, 1);
    }

    Rectangle(int width, int height){
        this(0, 0, width, height);
    }

    Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    // ...
}
