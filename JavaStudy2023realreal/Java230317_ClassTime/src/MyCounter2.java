// 객체를 메소드로 전달하게 되는 경우, 교재 274p
public class MyCounter2 {
    int value = 0;
    // 본인 메소드를 매개 변수를 생성하여 해당 메소드의 맴버 변수의 값을 더하기
    void inc(MyCounter2 ctr){
        ctr.value = ctr.value + 1;
    }
}
