// 교과서 255p
public class Television {
    private int channel; // 채널번호
    private int volume; // 볼륨
    private boolean onOff; // 전원상태

    // 생성자가 정의되는 부분
    Television(int c, int v, boolean o){
        this.channel = c;
        this.volume = v;
        this.onOff = o;
    }

    void print(){
        System.out.println("채널은 "+ channel + "이고, 볼륨은 " + volume + "입니다.");
    }
}
