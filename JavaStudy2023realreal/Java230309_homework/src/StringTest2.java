// 사용자에게 문자열을 받아서 문자열이 "www"로 시작하는지를 검사하는 프로그램을 작성해보자
// 조건 : 사용자가 "quit"을 입력하면 프로그램을 종료한다

// matches() 메소드는 문자열이 어떤 문자열을 포함하고 있는지를 검사할 때 사용
// www로 시작할 때 검사하는 정규식은 다음과 같다
// str.matches("^www\\.(.+)")...
// ^ : 문자열의 시작을 표시
// . : 한 개의 문자와 일치

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("문자열을 입력하세요 > ");
            str = sc.next();
            if(str.equals("quit") == true){
                break;
            }
            if (str.matches("^www\\.(.+)")){
                System.out.println(str + " 은 'www'로 시작합니다,");
            } else{
                System.out.println(str + " 은 'www'로 시작하지 않습니다.");
            }
        }
    }
}
