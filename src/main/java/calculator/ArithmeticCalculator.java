package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {
    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;
    // private 사용하여 캡슐화 유지하고 외부로부터 보호가능
    // final을 사용함으로인해 초기화 된 후에 변경되지 않는 필드 만듦(?)
    // this를 사용하여 인스턴스 변수 확실하게 참조 할 수 있음

    public ArithmeticCalculator() {
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
    }
    // 생성자에서 this 사용, 인스턴수 변수 초기화

    public double calculate(double num1, double num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                return addOperator.operate(num1, num2);
            case '-':
                return subtractOperator.operate(num1, num2);
            case '*':
                return addOperator.operate(num1, num2);
            case '/':
                return divideOperator.operate(num1, num2);
            default:
                throw new ArithmeticException("올바른 사칙 연산 기호가 아닙니다. (+, -, *, /) 중 하나를 입력하세요.");
        }
    }
}