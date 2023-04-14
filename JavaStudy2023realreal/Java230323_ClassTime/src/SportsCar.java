// 상속 예제 : 자동차 - 스포츠카
public class SportsCar extends Car{
    private boolean turbo;

    public boolean isTurbo(){
        return turbo;
    }

    public void setTurbo(boolean turbo){
        this.turbo = turbo;
    }

    @Override
    public String toString(){
        return "speed[" + getSpeed() + "], turbo[" + isTurbo() + "]";
    }
}
