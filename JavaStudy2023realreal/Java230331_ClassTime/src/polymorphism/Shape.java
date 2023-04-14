package polymorphism;

public class Shape {
    private int x;
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void draw(){
        System.out.println("Shape Draw["+ x +", "+ y+"]");
    }
}
