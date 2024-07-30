package calculator;

public class CircleCalculator extends Calculator {
    Calculator cal = new Calculator();

    public double calculateCircleArea(double radius) {

        double area = Math.PI * radius * radius;
        addCircleResult(area);
        // 결과를 리스트에 추가
        return area; // 결과 반환
    }
}

