public class Television_2 {
    public static void main(String[] args) {
        Television_1 tv = new Television_1();   // 객체 생성
        // 객체의 맴버에 접근할 때는 맴버 연산자(.)를 사용한다
        tv.channel = 7;         // 인스턴스 변수 channel 값에 7을 넣기
        tv.volume = 9;          // 인스턴스 변수 volume 값에 9를 넣기
        tv.onOff = true;        // 인스턴스 변수 onOff 값에 true를 넣기
        System.out.println("텔레비전의 채널은 " + tv.channel + "이고 볼륨은 " + tv.volume + "입니다. ");
    }
}
