package example;

//[ ] 현재 사칙연산 계산기는 (➕,➖,✖️,➗) 이렇게 총 4가지 연산 타입으로 구성되어 있습니다.
//[ ] Enum 타입을 활용하여 연산자 타입에 대한 정보를 관리하고 이를 사칙연산 계산기 ArithmeticCalculator 클래스에 활용 해봅니다.
// 예시 코드(기존에 작성했던 양의 정수 계산기를 수정)
public enum OperatorType {
    PLUS {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },

    MINUS {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },

    MUL {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },

    DIV {
        @Override
        public double apply(double a, double b) {
            return a / b;
        }
    };

    // 추상 메소드를 활용한 상수별 메소드 구현
    public abstract double apply(double a, double b);
}