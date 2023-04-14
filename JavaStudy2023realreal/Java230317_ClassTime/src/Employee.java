// 직원 클래스 작성하기, 교재 292p

// employee.Employee
/* name : String
*  salary : double
*  count : int
*
*  Employee(n:String, s:double)
*  finalize():void
*  getCount():int
* */
public class Employee {
    private String name;
    private double salary;
    private static int count;

    public Employee(String n, double s){
        name = n;
        salary = s;
        count++;
    }

    @Override
    protected void finalize(){
        count--;
    }

    // static Method
    public static int getCount(){
        return count;
    }
}
