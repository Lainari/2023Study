// 같은 크기의 Box 인지 확인하기, 교재 282p

// Box2
// width : int
// length : int
// height : int
// Box(w:int, l:int, h:int)
// isSameBox(obj: Box):boolean
public class Box2 {
    int width;
    int length;
    int height;
    Box2(int w, int l, int h){
        width = w;
        length = l;
        height = l;
    }
    boolean isSameBox(Box2 obj){
        if((obj.width == width) && (obj.length == length) && (obj.height == height)){
            return true;
        }else{
            return false;
        }
    }
}
