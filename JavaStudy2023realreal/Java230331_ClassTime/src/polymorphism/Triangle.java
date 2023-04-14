package polymorphism;

public class Triangle extends Shape{
    private int base;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    @Override
    public void draw(){
        System.out.println("Triangle Draw["+base+", "+height+"]");
    }
}
