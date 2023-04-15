public class PersonTest {
    public static void main(String[] args) {
        // Person 클래스 배열로 삼는 인스턴스 배열 생성
        Person[] people = new Person[3];

        // 각 배열에 해당하는 원소들의 필드 값을 생성자를 통해 지정
        // 그리고 해당 원소에게 raiseSalary 값을 각각 부여
        Person p1 = new Person("Tom", "P000");
        people[0] = p1;
        p1.raiseSalary(0.3);

        Person p2 = new Person("Jane", "P001");
        people[1] = p2;
        p2.raiseSalary(0.1);

        Person p3 = new Person("David", "P0002");
        people[2] = p3;
        p3.raiseSalary(0.2);

        // 가장 큰 연봉을 갖는 Person 배열의 원소를 저장할 배열 생성
        Person maxPerson = p3.getMaxSalary(people);

        // 결과 표현
        System.out.println("최고 연봉자 : " + maxPerson.getName() + ", " + maxPerson.getSalary());

        // 해당 코드에서 정적 메소드로 만들 수 있는 것을 찾아보자
        // 정적 메소드는 객체를 생성할 필요 없으며 매개 변수를 통하여 전달된 값을 통해
        // 그저 값만 반환하게 끔 해주면 된다

        // 따라서 최고 연봉을 갖는 Person 배열의 원소를 저장할 배열을 생성할 때 사용하는
        // getMaxSalary 의 경우, 굳이 p3 가 아니더라도 클래스의 이름을 통해 바로 호출할 수 있다
        // 다시 바꿔서 표현해보자
        
        Person maxPerson2 = Person.getMaxSalary(people);
        System.out.println("최고 연봉자 : " + maxPerson2.getName() + ", " + maxPerson2.getSalary());
    }
}
