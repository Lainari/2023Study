package interfacetest;

// Student 클래스는 Comparable 인터페이스의 모든 메소드를
// 구현해야 한다
public class Student implements Comparable{
    @Override
    public int compareTo(Comparable obj) {
        return 0;
    }
}
