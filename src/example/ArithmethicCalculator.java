package example;

public class ArithmethicCalculator {
    public double calculate(double num1, OperatorType operator, double num2) {
        return operator.apply(num1,num2);
    }
}
