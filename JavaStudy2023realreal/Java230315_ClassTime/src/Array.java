public class Array {
    public static void main(String[] args) {
        // int[] array = new int[10];         // 10개의 원소를 담을 수 있는 배열 생성
        /* *
        int[] a = n ull;         // a 라는 정수형 배열은 아무런 값을 가지지 않음
        System.out.println(a[0]); // 이 a 배열의 첫 번째 원소를 접근하려 해도, 값이 없으므로 찾을 수 없다
        // 결과 : Cannot load from int array because "a" is null 에러 발생
        */
        
        /* *
        int[] a = new int[10];
        for(int i = 0; i<= 10; i++){       // a 라는 정수형 배열은 10개의 칸을 가지지만
            a[i] = i+1;                    // 10개의 칸 보다 넘게된다면 에러가 발생한다
        }*/
        // 결과 : Index 10 out of bounds for length 10 에러 발생
    }
}
