// 배열에 저장된 값의 평균 구하기, 교재 277p

// 사용자로부터 값을 받아서 배열에 채운 후에 배열에 저장된 모든 값의 평균을 구하여 출력하는 프로그램

import java.util.Scanner;

// array.ArrayProc1
// getValues(array:int[]):void
public class ArrayProc1 {
    public void getValues(int array[]){
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            System.out.print("성적을 입력하세요 : ");
            array[i] = scn.nextInt();
        }
    }


    // getAverage(array:int[]):double
    public double getAverage(int array[]){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum / array.length;
    }
}
