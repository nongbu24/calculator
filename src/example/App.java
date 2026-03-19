package example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // exit를 입력받을 문자열
        String strExit = "";

        while (!strExit.equals("exit")) {
            // 계산기에 사용할 숫자와 문자를 입력받음
            System.out.print("양의 정수를 입력하세요: ");
            int a = scanner.nextInt();

            // 버퍼에 남아있는 \n을 지워주는 용도
            scanner.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String charAt = scanner.nextLine();

            System.out.print("양의 정수를 입력하세요: ");
            int b = scanner.nextInt();

            if (charAt.equals("+")) {   // 덧셈
                System.out.println("결과: " + (a + b));
            } else if (charAt.equals("-")) {    // 뺄셈
                System.out.println("결과: " + (a - b));
            } else if (charAt.equals("*")) {    // 곱셈
                System.out.println("결과: " + a * b);
            } else if (charAt.equals("/")) {    // 나눗셈
                if (b == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다");
                } else {
                    System.out.println("결과: " + a / (double)b);
                }
            } else {
                System.out.println("올바른 기호를 입력해 주세요.");
            }

            // 버퍼에 남아있는 \n을 지워주는 용도
            scanner.nextLine();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            strExit = scanner.nextLine();
        }

        System.out.print("계산기 프로그램이 종료되었습니다.");
    }
}