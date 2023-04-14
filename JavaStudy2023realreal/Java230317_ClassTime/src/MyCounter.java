public class MyCounter {

    // Instance Method 인 addOne()
    public static void addOne(int val){
        val = val+1;
        // 하지만 이 로직을 구하는데 Instance Member 에 접근하지 않음
        // 그래서 굳이 Instance 로 둘 필요는 없다
        // public void addOne(int val) .. -> public [static] void addOne(int val)... 로 변경
    }

    private int value;

    // MyCounter 의 클래스에 매개 변수와 이를 호출, 지정하는 set-get Method 구현
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public static void increase(MyCounter cntObj1){
        int v = cntObj1.getValue()+1;
        cntObj1.setValue(v);
    }

    public static void main(String[] args) {
        /*
        *   int val = 10;           // Main Method 변수인 val
            MyCounter.addOne(val);  // MyCounter Method 의 Local Variable 에 10을 부여하고, 11로 증가
            // 하지만 Method 종료 시 Local Variable 인 val 은 제거된다
            System.out.println(val);  // Main Method 변수인 val 은 값이 변경되지 않은 채로 변경
        *
        * */
        MyCounter mc = new MyCounter();
        mc.setValue(10);                        // 결과 - Heap 영역에 value 값이 10으로 지정
        MyCounter.increase(mc);                 // 결과 - mc 의 주소값을 매개값을 삼아
                                                //       해당 주소 값에 getValue() 메소드 실행 하여 1을 더한다
        System.out.println(mc.getValue());      // 결과 : 11
        // 이를 통해 우리는 매개 변수의 값을 Reference Value 로 설정하여 넘길 수 있다는 점을 알 수 있다
    }
}
