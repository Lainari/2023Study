public class Box {
    private int width, length, height;
    // private int volume;
    public Box(int w, int len, int h){
        width = w;
        length = len;
        height = h;

        // volume = width * length * height;
    }

    public int getVolume(){
        return width * height * length;
    }
    public static Box whoisLargerBox(Box box1, Box box2){
        if(box1.getVolume() > box2.getVolume()){
            return box1;
        }
        return box2;
    }

    public static void main(String[] args) {
        Box b1 = new Box(10,20,50);
        Box b2 = new Box(10,30,30);
        System.out.println("첫 번째 박스의 부피 : " + b1.getVolume());
        System.out.println("두 번째 박스의 부피 : " + b2.getVolume());

        Box largerBox = Box.whoisLargerBox(b1,b2);
        System.out.println("더 큰 박스의 부피 : " + largerBox.getVolume());
    }
}
