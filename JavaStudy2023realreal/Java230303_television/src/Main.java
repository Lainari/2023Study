public class Main {
    public static void main(String[] args) {
        Television myTV = new Television(); // Television 클래스를 myTV라는 변수명으로 저장
        // new 연산자로 해당 클래스를 생성한다
        myTV.channel = 7; // 채널 변수 등록
        myTV.volume = 9; // 볼륨 변수 등록
        myTV.isOn = true; // 전원 현황 등록
        myTV.print();
        int ch = myTV.getChannel(); // 채널 값을 불러오는 메소드의 return 값을 ch 변수에 저장
        System.out.println("현재 채널은 " + ch + "입니다. ");

        Television yourTV = new Television(); // 새로운 Television 변수 생성
        yourTV.channel = 9;
        yourTV.volume = 12;
        yourTV.isOn = true;
        yourTV.print();
    }
}