// 교재 317p.
public class Employee {
    public String name;     // 이름 : public 맴버
    String address;         // 주소 : package 맴버
    protected int salary;   // 월급 : protected 맴버
    private int rrn;        // 주민등록번호 : private 맴버

    public Employee(String name, String address, int salary, int rrn){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    @Override
    public String toString(){
        return "Employee [name = " + name + ", address = " + address + ", salary = " + salary + ", rrn = " + rrn + "]";
    }
}
