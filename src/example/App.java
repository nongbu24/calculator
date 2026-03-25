package example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        // ArithmethicCalculator 인스턴스 생성
        ArithmethicCalculator cal = new ArithmethicCalculator();

        // exit를 입력받을 문자열
        String strExit = "";

        while (!strExit.equals("exit")) {
            System.out.print("숫자를 입력하세요: ");
            double num1 = scanner.nextDouble();

            // 버퍼에 남아있는 \n을 지워주는 용도
            scanner.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.nextLine().charAt(0);

            try {
                OperatorType op = OperatorType.fromChar(operator);

                System.out.print("숫자를 입력하세요: ");
                double num2 = scanner.nextDouble();

                // 버퍼에 남아있는 \n을 지워주는 용도
                scanner.nextLine();

                try {
                    double result = cal.calculate(num1, op, num2);
                    System.out.println("결과: " + result + "\n");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + "\n");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "\n");
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            strExit = scanner.nextLine();
        }
    }
}