public interface RemoteControl {
    void turnOn();
    void turnOff();

    default void volumeControl(int amount){
        String st = null;
        st = amount >= 0 ? "높입니다." : "줄입니다";
        amount = Math.abs(amount); // |number| <- 절대값
        System.out.println("볼륨을 " + amount + " 만큼 " + st);
    }

    static int method1(){
        return 1;
    }
}
