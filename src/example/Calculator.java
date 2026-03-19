package example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 계산기에 사용할 숫자와 문자를 입력받음
        System.out.print("숫자를 입력하세요: ");
        int a = scanner.nextInt();

        // \n을 지워주는 용도
        scanner.nextLine();

        System.out.print("+, -, *, / 중 하나를 입력하세요: ");
        String charAt = scanner.nextLine();

        System.out.print("숫자를 입력하세요: ");
        int b = scanner.nextInt();

        if (charAt.equals("+")) {   // 덧셈
            System.out.print("결과: " +a + " + " + b + " = " + (a + b));
        } else if (charAt.equals("-")) {    // 뺄셈
            System.out.print("결과: " +a + " - " + b + " = " + (a - b));
        } else if (charAt.equals("*")) {    // 곱셈
            System.out.print("결과: " +a + " * " + b + " = " + a * b);
        } else if (charAt.equals("/")) {    // 나눗셈
            if (b == 0) {
                System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다");
            } else {
                System.out.print("결과: " + a + " / " + b + " = " + a / (double)b);
            }
        } else {
            System.out.println("올바른 기호를 입력해 주세요.");
        }
    }
}
