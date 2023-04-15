public class Account {
    // Account 클래스의 필드 생성, private 접근 제어자로 지정한다
    private String name;
    private int balance;

    // 두 객체에 접근하기 위한 get set 메소드를 생성
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public int getBalance(){return balance;}
    public void setBalance(int balance){ this.balance = balance; }
}
