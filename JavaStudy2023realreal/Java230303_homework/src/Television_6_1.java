public class Television_6_1 {
    int channel;        // 채널 번호
    int volume;         // 볼륨
    boolean onOff;      // 전원 상태

    void print(){
        System.out.println("채널은 " + channel + "이고, 볼륨은 " + volume + "입니다.");
    }
    // channel의 값을 반환하는 메소드
    int getChannel(){
        return channel; // 만일, return 하는 값이 자료형을 가질 경우 메소드에 해당 반환 값의 데이터 타입을 포함해야 한다
        // System.out.println(); 와 같은 단순 출력 문일 경우 데이터 타입이 없으므로 void로 생성하는 것
    }
}
