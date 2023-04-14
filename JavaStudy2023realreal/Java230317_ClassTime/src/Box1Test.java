// 교재 279p
public class Box1Test {
    public static void main(String[] args) {
        Box1 obj1 = new Box1(10, 20, 50);
        Box1 obj2 = new Box1(10, 30, 30);

        Box1 largest = obj1.whosLargest(obj1, obj2);
        System.out.println("(" + largest.width + ", " + largest.length + ", " + largest.height + ")");
    }
}
