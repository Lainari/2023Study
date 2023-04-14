// 배열이 전달되는 경우, 교재 276p
public class ArrayProc {
    void inc(int[] array){
        // 이 메소드는 사실 정적 메소드로 구현하는 것이 좋다
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] + 1;
        }
    }
}
