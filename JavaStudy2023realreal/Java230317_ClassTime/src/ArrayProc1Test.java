// 교재 278p
// array.ArrayProc1Test
// STUDENTS: int
// main(args:String[]):void
public class ArrayProc1Test {
    final static int STUDENTS = 5;

    public static void main(String[] args) {
        int[] scores = new int[STUDENTS];
        ArrayProc1 obj = new ArrayProc1();
        obj.getValues(scores);
        System.out.println("평균은 = " + obj.getAverage(scores));
    }
}
