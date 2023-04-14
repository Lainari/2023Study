public class Television_6_2 {
    public static void main(String[] args) {
        Television_6_1 myTv = new Television_6_1();
        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;

        int ch = myTv.getChannel();
        System.out.println("현재 채널은 " + ch + "입니다.");
    }
}
