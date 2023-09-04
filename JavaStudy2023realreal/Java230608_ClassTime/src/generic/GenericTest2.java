package generic;

public class GenericTest2 {
    public static void main(String[] args) {
        // GenericPair 클래스 객체 2개 생성해서 값을 넣고 빼고 해보세요
        GenericPair<String, Integer> t1 = new GenericPair<>("myKey", 100);
        String key = t1.getKey();
        int val = t1.getValue();
        System.out.println("t1에 저장된 값은 [ key : " + key + ", value : " + val + "] 입니다.");
        GenericPair<String, Float> t2 = new GenericPair<>("myKey2", 200F);
        String key2 = t2.getKey();
        float val2 = t2.getValue();
        System.out.println("t2에 저장된 값은 [ key : " + key2 + ", value : " + val2 + "] 입니다.");
    }
}