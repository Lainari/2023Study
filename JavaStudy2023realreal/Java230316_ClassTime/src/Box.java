// 교과서 258p
// Box 클래스에 상자의 가로, 세로, 높이를 초기화하는 생성자를 추가한다
// 부피를 계산하는 getVolume()을 추가하여서 객체 생성 후에 상자의 부피를 계산한다

public class Box {
    private int width;
    private int length;
    private int height;
    private int volume;

    // 부피 계산 메소드
    public int getVolume(){
        return volume;
    }

    Box(int w, int l, int h){
        this.width = w;
        this.length = l;
        this.height = h;
        this.volume = width * length * height;
    }
}
