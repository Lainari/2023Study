package polymorphism;

public class Circle extends Shape{
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw(){
        System.out.println("Circle Draw["+radius+"]");
    }
}
