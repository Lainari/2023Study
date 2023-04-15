public class TelevisionTest {
    public static void main(String[] args) {
        // Television 클래스 인스턴스 tv1 생성
        Television tv1 = new Television();
        tv1.channel = 13;
        // tv1 인스턴스의 필드 channel 의 값을 13으로 설정


        // tv1의 주소값을 가진 인스턴스 tv2 생성
        // 이렇게 되면 tv2 에서 설정하는 값들은 tv1 의 주소값을 통해 전달되므로
        // tv1 에서 설정하는 것과 동일한 결과를 가짐
        Television tv2 = tv1;
        tv2.channel = 11;
        // tv1 주소값을 통해 해당 필드 channel 의 값을 11으로 설정

        System.out.println(tv1.channel);
        // tv1 주소 값으로 가서 해당 필드 channel 의 값을 호출

        // 결과 : 11
    }
}
