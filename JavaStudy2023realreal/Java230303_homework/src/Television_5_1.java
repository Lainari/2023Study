public class Television_5_1 {
    int channel;        // 채널번호
    int volume;         // 볼륨
    boolean onOff;      // 전원상태
    // print() 메소드는 Television_5_1 클래스 안에 포함된다
    // channel과 volume은 이 클래스 안에서 사용될 때는 맴버 연산자(.)가 필요없다 (동일한 맴버에 소속)
    void print(){
        System.out.println("채널은 " + channel + "이고, 볼륨은 " + volume + "입니다.");
    }
}
