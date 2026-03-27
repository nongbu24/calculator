package example;

import java.util.ArrayList;

// Enum 타입을 활용하여 연산자 타입에 대한 정보를 관리
public enum OperatorType {
    PLUS('+') {
        @Override
        public double apply(double num1, double num2) {
            return num1 + num2;
        }
    },

    MINUS('-') {
        @Override
        public double apply(double num1, double num2) {
            return num1 - num2;
        }
    },

    MUL('*') {
        @Override
        public double apply(double num1, double num2) {
            return num1 * num2;
        }
    },

    DIV('/') {
        @Override
        public double apply(double num1, double num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
            }

            return num1 / num2;
        }
    };

    private final char operator;

    // 생성자
    OperatorType(char operator) {
        this.operator = operator;
    }

    // 추상 메소드를 활용한 enum별 구성
    public abstract double apply(double a, double b);

    // 입력 받은 char operator를 enum인 OperatorType으로 변경
    public static OperatorType fromChar(char operator) {
        for (OperatorType op : OperatorType.values()) {
            if (op.operator == operator) {
                return op;
            }
        }

        throw new IllegalArgumentException("올바른 기호를 입력해 주세요.");
    }
}