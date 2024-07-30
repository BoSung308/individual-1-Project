package calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// import java.util.LinkedList;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        // 사칙연산 객체
        CircleCalculator circleCalculator = new CircleCalculator();
        // 원의 넓이 객체

        Calculator cal = new Calculator();
        // Calculator 클래스로부터 인스턴스 생성
        int conditionNum;
        while (true) {
            System.out.println("사칙연산을 진행하시겠습니까? or 원의 넓이를 구하시겠습니까?");
            System.out.println("사칙연산을 원하신다면 '1'을 원의 넓이를 구하고싶다면 '2'를 입력해주세요");

            conditionNum = sc.nextInt(); // 사용자가 선택한 번호를 읽음
            // 사칙연산과 원의 넓이 계산을 선택할 수 있도록 구분할수 있도록 조건 변수 선언
            if (conditionNum == 1) {
                System.out.print("첫 번째 숫자를 입력하세요 : ");
                double num1 = sc.nextDouble();
                // 사용자로부터 입력된 값을 정수형으로 반환하여 num1에 저장
                System.out.print("두 번째 숫자를 입력하세요 : ");
                double num2 = sc.nextDouble();

                System.out.println("사칙연산 기호를 입력하세요 : ");
                char operator = sc.next().charAt(0);
                // charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환 하고자하는 문자열의 위치를 받음.

                double result = arithmeticCalculator.calculate(num1,num2,operator);
                System.out.println("계산 결과 : " + result);
                arithmeticCalculator.addResult(result);
                // 결과를 ariResult에 추가


                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.next();
                if (remove.equals("remove")) {
                    arithmeticCalculator.removeResult();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.next();
                if (inquiry.equals("inquiry")) {
                    arithmeticCalculator.inquiryResults(result);
                }


            } else if (conditionNum == 2) {
                System.out.println("반지름을 입력하세요.");
                double radius = sc.nextDouble();
                // 반지름 입력

                double area = circleCalculator.calculateCircleArea(radius);
                System.out.println("원의 넓이 : " + area);
                circleCalculator.addResult(area);


                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.next();
                if (remove.equals("remove")) {
                    circleCalculator.circleRemoveResult(area);
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.next();
                if (inquiry.equals("inquiry")) {
                    circleCalculator.circleResultInquiry(area);
                }

            }

            System.out.println("종료를 원하시면 'exit', 처음으로 돌아가려면 '아무키'나 눌러주세요.");
            String finish;
            try {
                finish = sc.next();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            if (finish.equals("exit")) {
                break;
            }
            System.out.println("숫자를 더 입력받겠습니다.");
            // else문에서 sout사용할때 가독성이 안좋기 때문에 if문 닫고 sout으로 가능한 해결하는 것이 좋음
        }
        sc.close(); // scnaner 객체 닫음
    }
}


