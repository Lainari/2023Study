public class SafeArray {
    // 멤버 변수는 private 로 접근을 제어하는 것을 배웠는데, 이는 배열에도 적용한다
    // 배열을 private 로 숨긴 다음에 해당 배열의 공간을 만들고, 값을 넣는 과정을 public 으로 접근하게 한다

    private int[] a; // 배열을 숨김, 어떠한 메모리 주소를 가리키지 않음

    public void createArray(int size){
        a = new int[size];    // 이 메소드가 불려지면 인자값만큼 크기의 배열을 만든다
    }

    public int get(int index){
        // 배열의 크기보다 큰 index 값이 들어올 경우에는 에러 방지를 위해 조건을 넣는다
        if (index >= 0 && index < a.length){
            return a[index];
        }
        System.out.println("잘못된 인덱스 : " + index);
        return -1;
        // -1 를 return 할 수 있는 이유는, 이 배열에 들어갈 수 없는 값이기에 사용자에게
        // 에러가 났음을 명시하는 역할을 지님
    }

    public void put(int index, int value){ // 해당 인덱스에 해당 값을 부여
        // 배열의 크기보다 큰 index 값이 들어올 경우에는 에러 방지를 위해 조건을 넣는다
        if (index >= 0 && index < a.length){
            a[index] = value;
            return; // void 에서도 return 이 가능하지만, 종료하는 역할로 사용됨
        }
        System.out.println("잘못된 인덱스 : " + index);
    }

    public static void main(String[] args) {
        SafeArray array = new SafeArray();
        array.createArray(10);     // 10칸의 배열 생성
        array.put(0,3);      // 첫 번째 배열 칸에 3 값을 집어넣기
        array.put(10, 200);  // index 범위를 넘는 공간에 값을 집어넣으려고 하면 에러가 뜨지만
        // 해당 멤버 변수를 private 로 접근할 수 없도록 만들며 그 접근 방법 logic 을 public 으로 구현하므로
        // 잘못된 값을 입력해도 프로그램은 계속 구동된다
        // 결과 > 잘못된 인덱스 : 10
        System.out.println(array.get(0));  // 결과 > 3
        System.out.println(array.get(10)); // 결과 > 잘못된 인덱스 : 10 \n -1
    }
}
