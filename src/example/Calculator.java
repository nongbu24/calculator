package example;

import java.util.ArrayList;

public class Calculator {
    // 속성
    private int num1, num2;
    private char oprator;

    // 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
    private ArrayList<Integer> calculators = new ArrayList<>();

    // 기능
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getOprator() {
        return oprator;
    }

    public void setOprator(char oprator) {
        this.oprator = oprator;
    }

    public ArrayList<Integer> getCalculators() {
        return calculators;
    }

    public void setCalculators(ArrayList<Integer> calculators) {
        this.calculators = calculators;
    }

    // 1) 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(➕,➖,✖️,➗) 기능을 수행한 후
    // 2) 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다.
    public void calculate(int num1, char operator, int num2) {
        if (operator == '+') {   // 덧셈
            System.out.println("결과: " + (num1 + num2));

            calculators.add((num1 + num2));
        } else if (operator == '-') {    // 뺄셈
            System.out.println("결과: " + (num1 - num2));

            calculators.add((num1 - num2));
        } else if (operator == '*') {    // 곱셈
            System.out.println("결과: " + num1 * num2);

            calculators.add(num1 * num2);
        } else if (operator == '/') {// 나눗셈
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                System.out.println("결과: " + num1 / (double)num2);

                calculators.add(num1 / num2);
            }
        } else {
            System.out.println("올바른 기호를 입력해 주세요.");
        }
    }
}
