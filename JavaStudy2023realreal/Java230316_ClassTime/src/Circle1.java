// 교과서 270p
public class Circle1 {
    private int radius;
    private Point3 center; // Point 참조 변수가 필드로 선언되어 있음

    // 생성자 호출
    public Circle1(Point3 p, int r){
        center = p;
        radius = r;
    }
    @Override
    public String toString(){
        return "Circle [radius = " + radius + ", center = " + center + "]";
    }
}
