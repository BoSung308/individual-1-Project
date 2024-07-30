package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    public double calculate(double num1, double num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
             case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = num1 / num2;
                break;
            default:
                throw new ArithmeticException("올바른 사칙 연산 기호가 아닙니다. (+, -, *, /) 중 하나를 입력하세요.");
        }
        addResult(result);  // 결과를 리스트에 추가
        return result;
    }
}


