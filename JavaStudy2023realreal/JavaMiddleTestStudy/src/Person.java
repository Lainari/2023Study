public class Person {
    // Person 클래스의 필드 생성
    private String name;
    private String regNum;
    private double salary;

    // Person 클래스 생성자 오버로딩
    public Person(String name, String regNum){
        this.name = name;
        this.regNum = regNum;
        this.salary = 200.0;
    }

    // Person 클래스 필드에 접근할 메소드 정의
    public String getName() {return name;}
    public String getRegNum() {return regNum;}
    public double getSalary() {return salary;}
    public void raiseSalary(double rate){
        salary = salary + (salary*rate);
    }
    
    // Person 클래스를 가지는 배열들의 원소들을 매개 변수로 받는 메서드 생성
    // 해당 배열들의 원소들을 비교하여 가장 높은 값을 return 하는 메소드이다
    public static Person getMaxSalary(Person[] persons){
        int max = 0;
        if (persons == null) return null;
        for(int i = 1; i < persons.length; i++){
            if(persons[i].getSalary() > persons[max].getSalary()){
                max = i;
            }
        }
        return persons[max];
    }
}
