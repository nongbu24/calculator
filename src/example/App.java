package example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculator 인스턴스 생성
        Calculator cal = new Calculator();

        // exit를 입력받을 문자열
        String strExit = "";

        while (!strExit.equals("exit")) {
            System.out.print("양의 정수를 입력하세요: ");
            int num1 = scanner.nextInt();

            // 버퍼에 남아있는 \n을 지워주는 용도
            scanner.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.nextLine().charAt(0);

            System.out.print("양의 정수를 입력하세요: ");
            int num2 = scanner.nextInt();

            // 버퍼에 남아있는 \n을 지워주는 용도
            scanner.nextLine();

            cal.calculate(num1, operator, num2);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            strExit = scanner.nextLine();
        }

        cal.removeResult();
    }
}