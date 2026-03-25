package example;

public class ArithmethicCalculator<T extends Number, N extends Number> {
    public double calculate(T num1, OperatorType operator, N num2) {
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();

        return operator.apply(n1, n2);
    }
}