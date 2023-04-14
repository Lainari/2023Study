import java.time.LocalDate;

// 230315 수업내용
// 접근제어지정자(Access Modifier) : public, protected, default, private
// 멤버 변수는 특별한 일이 없으면 무조건 private 로 두기
/*      왜 멤버 변수를 private 로 두는 것일까?
       - (보안적 측면도 있겠지만은, 필요 없는 정보는 노출시키지 않기 위해서다)
       - 1. 잘못된 값을 설정하는 것을 막아줄 필요가 있다
       - 2. 읽기전용 멤버 변수로 만들 수 있다.
       - 3. 클래스 소스코드를 업그레이드할 경우, 그 클래스를 사용하는 다른 코드에
            미치는 영향을 최소화할 수 있다.

       시험에 나온다면, protected 를 두고 이 경우에는 가능한가? 정도를 척도...
* */
// 멤버 변수에 접근하는 public 메소드를 작성할 때 return DataType 을 확인해보기
public class AccessModifier {
    private String name;
    private int birthYear;

    public void setName(String argName){
        this.name = argName;
    }
    public void setBirthYear(int argBirthYear) {
        if (argBirthYear >= 1900) {
            this.birthYear = argBirthYear;
            return;
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        LocalDate d = LocalDate.now(); // 현재 시간을 계산해주는 자바 Class
        int year = d.getYear();
        return (year - birthYear);
    }
}

