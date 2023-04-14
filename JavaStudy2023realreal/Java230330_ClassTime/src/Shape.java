// 교재 312p.
public class Shape {
    private int x;
    private int y;

    // 접근자와 생성자
    public int getX(){ return x; }
    public void setX(int x){ this.x = x; }
    public int getY(){ return y; }
    public void setY(int y){ this.y = y; }

    // 메소드
    void print(){
        System.out.println("x 좌표 : " + x + " y좌표 : " + y);
    }
}
