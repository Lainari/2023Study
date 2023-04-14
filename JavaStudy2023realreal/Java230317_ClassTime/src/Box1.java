// 메소드에서 객체 반환하기, 교재 279p
public class Box1 {
    int width, length, height;
    int volume;

    Box1(int w, int l, int h){
        width = w;
        length = l;
        height = h;
        volume = w * l * h;
    }

    Box1 whosLargest(Box1 box1, Box1 box2){
        if(box1.volume > box2.volume){
            return box1;
        }else{
            return box2;
        }
    }
}
