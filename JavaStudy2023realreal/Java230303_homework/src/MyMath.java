// 메소드 오버로딩(Method Overloading)
// : 동일한 이름을 사용하는 메소드에서 서로 다른 매개 변수의 개수, 자료형을 통해 여러개 사용할 수 있게 만듬

public class MyMath {
    // 정수 값을 제곱하는 메소드
    int square(int argA){
        return argA * argA;
    }

    // 실수 값을 제곱하는 메소드
    double square(double argA){
        return argA * argA;
    }

    // 서로 다른 매개변수의 자료형을 통해 메소드 오버로딩 가능
}
