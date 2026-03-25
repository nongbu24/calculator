package example;

import java.util.ArrayList;
import java.util.List;

public class ArithmethicCalculator<T extends Number, N extends Number> {
    private List<Double> results = new ArrayList<>();

    public double calculate(T num1, OperatorType operator, N num2) {
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();

        return operator.apply(n1, n2);
    }

    public void getGreaterThan(double value) {
        List<Double> filtered = results.stream()
                .filter(result -> result > value)
                .toList();

        if (filtered.isEmpty()) {
            System.out.println("조건에 맞는 결과가 없습니다.");
        } else {
            filtered.forEach(result -> System.out.println("입력받은 값보다 큰 값: " + result));
        }
    }
}