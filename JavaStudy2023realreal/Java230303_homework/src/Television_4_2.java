public class Television_4_2 {
    public static void main(String[] args) {

        // myTv는 Television_4_1 클래스의 객체를 가리킨다
        Television_4_1 myTv = new Television_4_1();
        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;

        // yourTv 또한 Television_4_1 클래스의 객체를 가리킨다
        Television_4_1 yourTv = new Television_4_1();
        yourTv.channel = 9;
        yourTv.volume = 12;
        myTv.onOff = true;

        System.out.println("저의 텔레비전 채널은 " + myTv.channel + "이고, 볼륨은 " + myTv.volume + "입니다.");
        System.out.println("당신 텔레비전 채널은 " + yourTv.channel + "이고, 볼륨은 " + yourTv.volume + "입니다.");
    }
}
