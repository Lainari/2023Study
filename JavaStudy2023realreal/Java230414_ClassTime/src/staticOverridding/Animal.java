package staticOverridding;

public class Animal {
    public static void eat(){
        System.out.println("동물이 밥을 먹습니다");
    }

    // sound 는 instance method 이다
    // 즉, 객체가 생성되어야만 존재할 수 있는 메소드이다
    public void sound(){
        System.out.println("Sound of Animal");
    }
}
