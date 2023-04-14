// 교과서 255p
public class TelevisionTest {
    public static void main(String[] args) {
        // 생성자 호출
        Television myTv = new Television(7, 10, true);
        myTv.print();
        Television yourTv = new Television(11, 20, true);
        yourTv.print();
    }
}
