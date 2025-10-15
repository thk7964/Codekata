package CodeKata.Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요 :");
        int n = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요 :");
        int n2 = sc.nextInt();

        System.out.println("두 수의 차 :"+ sub(n,n2));
        System.out.println("두 수의 곱 : "+ mul(n,n2));

    }
   // 두수의 차
   static int sub(int n1, int n2){
        return n1-n2;
    }

    //두수의 곱
    static int mul(int n1, int n2){
        return n1*n2;
    }
}
