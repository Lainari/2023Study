public class StringTest {
    public static void main(String[] args) {
        String s = new String("Hello World!");

        String ss = "Hello World!";

        char c = s.charAt(4); // charAt(int index) - 지정된 인덱스에 있는 문자를 반환한다
        // returnType : char, 해당 변수에 저장하여 return
        System.out.println(c);

        // 문제 1. 아래의 문자열의 결과는 어떻게 될까?
        String s1 = "동해물과 백두산이";   // 값 자체가 리터럴임
        String s2 = "동해물과 백두산이";   // 문자열 리터럴이 같다면, 똑같은 주소값을 할당함. 새로 주지 않음
        boolean r = s1 == s2;
        System.out.println(r);
        // 결과 : true

        // 문제 2. new 연산자를 사용한다면?
        String s3 = new String("동해물과 백두산이");    // new 연산자를 통해 새로운 주소값을 할당시켜줌
        r = s1 == s3;   // s1 주소값과 s3 주소값은 다름
        System.out.println(r);
        // 결과 : false

        // 문자열 비교할 때는 equals() 메소드를 사용할 것
        r = s3.equals(s1);
        System.out.println(r);

        // 대소문자를 무시하고 비교할 때는 equalsIgnoreCase() 메소드를 사용할 것
        s1 = new String("I love you");
        s2 = new String("I Love you");
        r = s1.equals(s2);
        System.out.println(r); // 결과 : false
        r = s1.equalsIgnoreCase(s2);
        System.out.println(r); // 결과 : true

        // String 객체는 immutable 입니다. mutable 이 아닙니다.
        // 이 말은 String 객체의 값은 변경할 수 없다 라는 의미입니다.

        String proverb = "A barking dog";
        System.out.println(proverb.length());
        proverb.concat(" never Bites!"); // concat(); -> 주어진 문자열을 현재의 문자열 뒤에 붙인다
        System.out.println(proverb);
        // 결과 : "A barking dog"

        // String 객체의 값을 변경하고 싶다면? 새로운 객체로 만들어야 한다
        s1 = proverb.concat(" never Bites!");
        System.out.println(s1);
        // 결과 : "A barking dog never Bites!"

        // 대문자를 소문자로 바꿔볼까요
        s2 = proverb.replace("b","B");
        System.out.println(s2);
        // 결과 : "A Barking dog"

        // String 의 특정 index 범위 만큼 출력하고 싶어요
        s3 = proverb.substring(2, 3); // argNum 2 = start, argNum 3 = end.
        System.out.println(s3);
        // 결과 : "b" (index num 2 = b, index num 3 = i)

        // 모든 단어를 대문자로 변경하고 싶어요
        String s4 = proverb.toUpperCase();
        System.out.println(s4);
        // 결과 : "A BARKING DOG"


        // 문자열의 결합
        int x = 20;
        System.out.println("결과값은 " + x);
        // 원래는 String 형과 int 형은 결합할 수 없지만, JVM 에서 자동으로 변환하여 결합할 수 있도록 형 변환 해준다

        System.out.println("100" + 20); // 결과 : "10020"
        // int 형을 String 으로 변환하여 결합

        System.out.println(100 + x); // 결과 : "120"
        // int 끼리 연산하고 String 으로 변환


        // 문자열을 수치값으로 변환
        s = "1234";
        Integer n = Integer.parseInt(s);
        System.out.println(n.getClass().getSimpleName());
        Double d = Double.parseDouble(s);
        System.out.println(d.getClass().getSimpleName());
        Float f = Float.parseFloat(s);
        System.out.println(f.getClass().getSimpleName());
        Long l = Long.parseLong(s);
        System.out.println(l.getClass().getSimpleName());
    }
}
