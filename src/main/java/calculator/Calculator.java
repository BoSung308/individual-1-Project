package calculator;

import java.util.ArrayList;
public class Calculator {
    private final ArrayList<Integer> list;
    private ArrayList<Integer> inquiryResults;
    private int results;
    private int index;

    // ArrayList<Integer> 타입의 필드 선언, list는 Integer 객체를 저장하는 리스트 참조
    // 현재 list는 ArrayList 객체를 참조하지않는상태이고 객체를 생성하여 참조할수 있는 준비 상태
    // 왜 ArrayList 컬렉션을 사용했을까?

    public Calculator() {
        this.list = new ArrayList<>();
        // 생성자로 인한 초기화
    }
    // 'Calculator' 클래스의 생성자 정의,, 생성자는 객체가 생성될 떄 자동으로 호출되는 메서드
    // 클래스 내에서 Integer 타입의 객체를 저장할 수 있는 ArrayList 참조
    // 생성자를 정의함으로써 keep 필드에 생성된 ArrayList 객체 할당, keep 필드는 빈 ArrayList 참조
    public ArrayList<Integer> getList() {
        return list;
    }
    public void addResult(int result) {
        list.add(result);
    }

    public void removeResult(String remove){
        list.remove(0);
        System.out.println("제일 먼저 저장된 결과" + remove + "가 삭제되었습니다.");
    }


    public void inquiryResults(int result){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }


    public int calculate(int num1, int num2, char operator) {
        // 객체가 가지고 있어야할 메서드 정의
        int result =0;
        switch (operator) {
            case '+': {
                result = num1 + num2;
                break;
            }
            case '-': {
                result = num1 - num2;
                break;
            }
            case '*': {
                result = num1 * num2;
                break;
            }
            case '/': {
                // 나눗셈에서 num2가 0인 경우 -> 수학적으로 분모가 0이 될 수 없음
                // 분모 0을 입력할 때, result가 0으로 나오게 설정했는데 추후 이에 대한 정리가 다시 필요
                if (num2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = num1 / num2;
                break;
            }
            default: {
                throw new ArithmeticException("올바른 사칙 연산 기호가 아닙니다. (+, -, *, /) 중 하나를 입력하세요.");
            }
        }
        return result;
    }
}