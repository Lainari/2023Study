// 교과서 259p
public class StudentTest {
    public static void main(String[] args) {
        Student obj1 = new Student();
        System.out.println(obj1);
        // 결과 : number 100, name New Student, age 18  : Default Variable
        Student obj2 = new Student(111,"kim",25);
        System.out.println(obj2);
        // 결과 : number 111, name Kim, age 25  : Method Overloading
    }
}
