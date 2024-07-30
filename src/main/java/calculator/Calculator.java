package calculator;

import java.util.ArrayList;

public class Calculator {
    protected final ArrayList<Integer> list;
    protected final ArrayList<Double> results;
    // list를 final로 선언하며 list가 다른 'ArrayList'객체를 가리키도록 변경 불가하게 final 사용
    // 하지만 list에 요소를 추가 또는 제거는 가능,, 참조가 불변인것이지 객체 자체가 불변은 아님
    protected ArrayList<Integer> circleResults;
    final double PI = Math.PI;
    // 파이값은 절대적인 값이기때문에 final을 이용하여 불변으로 정해놈

    // ArrayList<Integer> 타입의 필드 선언, list는 Integer 객체를 저장하는 리스트 참조
    // 현재 list는 ArrayList 객체를 참조하지않는상태이고 객체를 생성하여 참조할수 있는 준비 상태
    // 왜 ArrayList 컬렉션을 사용했을까?

    public Calculator() {
        this.list = new ArrayList<>();
        this.circleResults = new ArrayList<>();
        this.results = new ArrayList<>();
        // 생성자로 인한 초기화
    }

    // 'Calculator' 클래스의 생성자 정의,, 생성자는 객체가 생성될 떄 자동으로 호출되는 메서드
    // 클래스 내에서 Integer 타입의 객체를 저장할 수 있는 ArrayList 참조
    // 생성자를 정의함으로써 keep 필드에 생성된 ArrayList 객체 할당, keep 필드는 빈 ArrayList 참조
    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(int result) {
        list.add(result);
    }

    public void removeResult(String remove) {
        list.remove(0);
        System.out.println("제일 먼저 저장된 결과" + remove + "가 삭제되었습니다.");
    }

    public void inquiryResults(int result) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }


    public double calculateCircleArea(double number) {
        double radius = number;
        double area = Math.PI * radius * radius;
        return area;
    }

    public ArrayList<Double> getRadius() {
        return results;
    }

    public void setRadius(Double circleResult) {
        results.add(circleResult);
    }

    public void circleResultInquiry(double circleResult) {
        for(double res : results){
            System.out.print(res);
            System.out.print(" ");
        }
        System.out.println();
    }


    public int calculate(int num1, int num2, char operator) {
        // 객체가 가지고 있어야할 메서드 정의
        int result = 0;
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