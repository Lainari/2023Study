public class Television_3 {
    int channel;        // 채널 번호
    int volume;         // 볼륨
    boolean onOff;      // 전원 상태
    
    // main() 메소드를 Television 클래스 안에 넣어도 동작은 가능하다
    public static void main(String[] args) {
        Television_3 tv = new Television_3();   // 단, 인스턴스 맴버를 사용하기 위해 객체를 선언하는 것은 필수
        tv.channel = 7;
        tv.volume = 9;
        tv.onOff = true;
        System.out.println("텔레비전의 채널은 " + tv.channel + "이고, 볼륨은 " + tv.volume + "입니다.");
    }
}
