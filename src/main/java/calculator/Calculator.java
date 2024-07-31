package calculator;

import java.util.ArrayList;

public class Calculator {
    protected final ArrayList<Double> ariResult;
    protected final ArrayList<Double> circleResult;
    // list를 final로 선언하며 list가 다른 'ArrayList'객체를 가리키도록 변경 불가하게 final 사용
    // 하지만 list에 요소를 추가 또는 제거는 가능,, 참조가 불변인것이지 객체 자체가 불변은 아님
    public final double PI = Math.PI;
    // static에 대하여 고민해보았지만 클래수 변수로 사용하여 코드 작성하기까지는 어려웠음
    // 파이값은 절대적인 값이기때문에 final을 이용하여 불변으로 정해놈
    // final로 인하여 새로운 주소 할당(?)x

    // ArrayList<Integer> 타입의 필드 선언, list는 Integer 객체를 저장하는 리스트 참조
    // 현재 list는 ArrayList 객체를 참조하지않는상태이고 객체를 생성하여 참조할수 있는 준비 상태

    public Calculator() {
        this.ariResult = new ArrayList<>();
        this.circleResult = new ArrayList<>();
        // 생성자로 인한 초기화
    }

    // 'Calculator' 클래스의 생성자 정의,, 생성자는 객체가 생성될 떄 자동으로 호출되는 메서드
    // 클래스 내에서 Double 타입의 객체를 저장할 수 있는 ArrayList 참조

    public double addResult(double result) {
        ariResult.add(result);
        return result;
        // 사칙연산 결과 저장
    }

    public void removeResult() {
        ariResult.remove(0);
        // 결과 리스트 중 가장 먼저 저장된 값을 삭제
    }

    public void inquiryResults() {
        for (Double arith : ariResult) {
            System.out.print(arith + " ");
            // 줄바꿈을 하지않고 결과 조회
        }
        System.out.println();
    }

    public double addCircleResult(double area){
        circleResult.add(area);
        // 원의 넓이 결과 저장
        return area;
    }

    public void circleResultInquiry() {
        for (Double j : ariResult) {
            System.out.print(ariResult + " ");
        }
        System.out.println();
    }

    public void circleRemoveResult(double result){
        for (Double v : circleResult) {
            System.out.print(circleResult + " ");
        }
        System.out.println();
    }
}