// 교재 276p
public class ArrayProcTest {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        ArrayProc obj = new ArrayProc();

        obj.inc(list); // inc() 메소드 안에서 배열의 내용을 변경하면 원본 배열의 내용도 바뀐다

        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}
