public class Television_5_2 {
    public static void main(String[] args) {
        // 메소드는 일반적으로 클래스가 가지고 이쓴ㄴ 데이터를 변경하거나 데이터의 값을 외부로 보내는데 사용
        // 즉, Television_5_1 객체 안에서 메소드를 호출하는 편이 좋은 방법이다.
        Television_5_1 myTv = new Television_5_1();
        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;
        myTv.print();

        Television_5_1 yourTv = new Television_5_1();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;
        yourTv.print();
    }
}
