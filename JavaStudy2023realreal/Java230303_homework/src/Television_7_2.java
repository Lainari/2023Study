public class Television_7_2 {
    public static void main(String[] args) {
        Television_7_1 myTv = new Television_7_1();
        myTv.setChannel(11);
        int ch = myTv.getChannel();
        System.out.println("현재 채널은 " + ch + "입니다.");
    }
}
