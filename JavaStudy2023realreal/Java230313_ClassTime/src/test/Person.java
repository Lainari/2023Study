package test;

public class Person {
    /*
    * member variable 은 특별한 이유가 없는 한 private 로 만들어라.
    * 그 member variable 을 클래스 외부에서 접근해야 한다면 그를 위한
    * method 를 public 으로 구현하라
    * 예를 들어, myAge 라는 member variable 에 값을 설정해야 하는 메소드는
    * setAge() 로, myAge 라는 member variable 의 값을 읽어오는 메소드는 getAge() 로
    * public 접근제어지정자를 명시하여 구현하면 된다.
    * 이렇게 함으로써 member variable 에 잘못된 값이 설정되는 것을 막을 수도 있고
    * 향후에 그 클래스를 버전업하면서 member variable 의 이름을 변경해도
    * 그 클래스를 사용하는 외부 클래스에는 아무 영향을 미치지 않게 된다.
    *
    * 접근제어지정자(Access Modifier)
    *  : public, protected, default, private
    *  public 이 명시된 member (variable, method)는 그 클래스 내부, 외부 어느 곳에서든 접근 가능하다
    *  protected 가 명시된 member (variable, method)는 그 클래스 내부,
    *               그 클래스의 자식, 그리고 그 클래스와 같은 패키지에 속한 다른 클래스에서도 접근 가능하다
    *  접근제어지정자가 명시되지 않은 경우, 이를 default 접근제어지정자다 라고한다.
    *  default 접근제어지정자가 명시된 member 는 그 클래스 내부, 그리고 그 클래스와 같은 패키지에 속한
    *                        다른 클래스에서도 접근 가능하다. (protected 와 다르게, 상속 지원이 불가능)
    *
    * */
    private String name = "홍길동";   // 멤버 변수는 거의 무조건 private 로 숨겨놓자!
    private int myAge;
    // private 로 숨겨놓은 멤버 변수는 이름을 바꾼다면 이 클래스에서만 다 바꾸면 된다.
    // 따로 호출한 클래스에서 변수 이름을 바꿀 필요가 없어서 훨씬 더 편하다

    private String dept = "컴정";
    protected String dept2 = "컴퓨터정보계열";

    public String getDept(){
        return dept;
    }
    public String getName(){
        return name;       // private 멤버 변수는 public 메소드로 접근할 수 있도록 해주자
    }
    // name 과 dept 는 private 로 만들었기에 외부 클래스에서 접근하려면 public 메소드로만 가능하다
    // 하지만 get 메소드만 있지, set 은 없기에 이들은 수정이 불가능한 멤버 변수가 된다
    // 따라서 이는 읽기 전용 맴버 변수가 된다

    public int getAge(){
        return myAge;
    }

    public void setAge(int argAge){
        if(argAge >= 0 && argAge <= 150)
          this.myAge = argAge;
        System.out.println("나이의 범위는 0부터 150까지 입니다.");
    }

    private void test(){
        System.out.println(name);
    }
}
