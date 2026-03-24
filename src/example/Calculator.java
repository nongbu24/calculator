package example;

import java.util.ArrayList;

public class Calculator {
    // 속성
    // App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
    private int result;

    // 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
    private ArrayList<Integer> calculators = new ArrayList<>();

    // 기능
    // 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현 (Getter 메서드)
    public int getResult() {
        return result;
    }

    // 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현 (Setter 메서드)
    public void setResult(int result) {
        this.result = result;
    }

    // 1) 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(➕,➖,✖️,➗) 기능을 수행한 후
    // 2) 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다.
    public void calculate(int num1, char operator, int num2) {
        if (operator == '+') {   // 덧셈
            result = num1 + num2;

            System.out.println("결과: " + (num1 + num2));

            calculators.add(result);
        } else if (operator == '-') {    // 뺄셈
            result = num1 - num2;

            System.out.println("결과: " + (num1 - num2));

            calculators.add(result);
        } else if (operator == '*') {    // 곱셈
            result = num1 * num2;

            System.out.println("결과: " + num1 * num2);

            calculators.add(result);
        } else if (operator == '/') {// 나눗셈
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                result = num1 / num2;

                System.out.println("결과: " + num1 / (double)num2);

                calculators.add(result);
            }
        } else {
            System.out.println("올바른 기호를 입력해 주세요.");
        }
    }

    // Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후
    // App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정
    public void removeResult() {
        System.out.println("\n저장된 값: " + calculators);

        calculators.remove(calculators.get(0));
        System.out.println("\n가장 먼저 저장된 값이 삭제되었습니다.\n");

        System.out.println("저장된 값: " + calculators);
    }
}
