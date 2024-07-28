package calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> keep;

    // ArrayList<Integer> 타입의 필드 선언, keep은 Integer 객체를 저장하는 리스트 참조
    // 현재 keep은 ArrayList 객체를 참조하지않고, 나중에 객체를 생성하여 참조할수 있는 준비 상태
    // Class선언
    // 왜 ArrayList 컬렉션을 사용했을까?

    public Calculator() {
        keep = new ArrayList<>();
    }
    // 'Calculator' 클래스의 생성자 정의,, 생성자는 객체가 생성될 떄 자동으로 호출되는 메서드
    // 클래스 내에서 Integer 타입의 객체를 저장할 수 있는 ArrayList 참조
    // 생성자를 정의함으로써 keep 필드에 생성된 ArrayList 객체 할당, keep 필드는 빈 ArrayList 참조


    public int calculate(int num1, int num2, char operator) {
        // 객체가 가지고 있어야할 메서드 정의
        int result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            try {
                if (num2 == 0) {
                    throw new ArithmeticException ("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = num1 / num2;
            } catch (ArithmeticException  e) {
                e.printStackTrace();
                // 예외가 발생한 지점과 메서드 호출 경로를 출력 -> 이를 통해 예외가 어디서 발생했는지, 어떻게 전파되었는지를 알 수 있음.
                return 0;
            }
            keep.add(result);
            // 결과를 리스트에 추가
        }
        return result;
    }
}
