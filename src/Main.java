import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        // TODO: 사용자로부터 이름을 입력받기
//        System.out.println("이름을 입력하시오 : ");
//        String name = sc.nextLine();
//
//        // TODO: 사용자로부터 나이를 입력받기
//        System.out.println("이름을 입력하시오 : ");
//        int age= sc.nextInt();
//        // TODO: 입력받은 값 출력
//
//        System.out.println("이름 : " + name);
//        System.out.println("나이 : " + age);
//
        Scanner sc = new Scanner(System.in);

        System.out.print("값을 입력하세요: ");
        String input = sc.nextLine(); // 문자열로 입력 받기

        // 숫자인지 확인하는 if문
        if (input.matches("\\d+")) { // 정규식: 숫자(0~9)로만 이루어진 경우
            System.out.println("숫자입니다!");
        } else {
            System.out.println("숫자가 아닙니다!");
        }

        sc.close();

    }
}