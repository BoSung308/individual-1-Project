package calculator;

public class DivideOperator {
    public double operate(double num1, double num2) {
        if(num2 == 0) {
            throw new ArithmeticException("나눗셈 연산에서 분모(num2)에 0이 입력 될 수 없습니다.");
        }
        return num1 / num2;
    }
}

