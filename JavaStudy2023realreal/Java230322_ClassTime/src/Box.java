// 교재 279p 참고. 230317 ClassTime 이후 복습 개념, Static 과 Instance 의 관계
public class Box {
    private int width, length, height;
    private int volume;
    Box(int w, int l, int h){
        width = w;
        length = l;
        height = h;
        volume = w * l * h;
    }

    public int getVolume(){
        return volume;
    }

    Box whosLargest(Box box1, Box box2){
    /*
    인자로 주어지는 Box 객체와 동일한 너비와 높이를 가지는 Box 인지 체크하는 메소드
    같으면 true, 다르면 false 를 반환
    */
        if(box1.volume > box2.volume){
            return box1;
        }else{
            return box2;
        }
    }

    boolean isSameBox(Box box){
        /*
         * 나의 width, length, height 가 인자로 주어진 box 의 그것과 모두 같으면 true 를 반환
         * 그렇지 않으면 false 를 반환
         * */
        if(width == box.width && length == box.length && height == box.height){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 50);
        Box b2 = new Box(10, 30, 30);
        System.out.println("첫 번째 박스의 부피 : " + b1.getVolume());
        System.out.println("두 번째 박스의 부피 : " + b2.getVolume());
    }

}
