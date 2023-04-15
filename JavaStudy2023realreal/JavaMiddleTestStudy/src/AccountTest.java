public class AccountTest {
    public static void main(String[] args) {
        // Account 클래스의 인스턴스인 acnt 생성
        Account acnt = new Account();

        // acnt 의 필드 name 과 balance 에 값을 설정하는 set 메소드 활용
        acnt.setName("Tom");
        acnt.setBalance(100000);

        // 여기서 값을 호출 할 때는 직접 필드명을 기입하여 호출 할 수 없는데,
        // 이는 접근 제어자 private 로 지정했기 때문에 같은 클래스가 아닌 AccountTest 에서는
        // 바로 호출하여 접근할 수 없다. 이를 통해 캡슐화 및 정보 은닉의 효과를 볼 수 있다
        // System.out.println("이름은 " + acnt.name + "통장 잔고는 " + acnt.balance + " 입니다.");

        // 따라서 해당 결과를 보기 위해서는 get 메소드를 이용하여 결과 값을 확인한다
        System.out.println("이름은 " + acnt.getName() + "이며, 통장 잔고는 " + acnt.getBalance() + " 입니다.");
    }
}
