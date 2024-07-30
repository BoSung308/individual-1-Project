package calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// import java.util.LinkedList;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        // Calculator 클래스로부터 인스턴스 생성
        int conditionNum;

        while (true) {
            System.out.println("사칙연산을 진행하시겠습니까? or 원의 넓이를 구하시겠습니까?");
            System.out.println("사칙연산을 원하신다면 '1'을 원의 넓이를 구하고싶다면 '2'를 입력해주세요");

            conditionNum = sc.nextInt();
            if (conditionNum == 1) {
                System.out.print("첫 번째 숫자를 입력하세요 : ");
                int num1 = sc.nextInt();
                // 사용자로부터 입력된 값을 정수형으로 반환하여 num1에 저장
                System.out.print("두 번째 숫자를 입력하세요 : ");
                int num2 = sc.nextInt();

                System.out.println("사칙연산 기호를 입력하세요 : ");
                char operator = sc.next().charAt(0);
                // charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환 하고자하는 문자열의 위치를 받음.
                int result = cal.calculate(num1, num2, operator);
           /* if (Double.isNaN(result)) {
                continue; // 오류가 발생, 루프 시작으로 초기화
                // nan = not-a-number, 숫자가 아닌 결과,,ex) 0을 0으로 나누는 경우 nan
            }*/
                System.out.println("계산 결과 : " + result);

                cal.setList(result);
                System.out.println("현재 저장된 결과 : " + cal.getList());

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.next();
                if (remove.equals("remove")) {
                    cal.removeResult(remove);
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.next();
                if (inquiry.equals("inquiry")) {
                    cal.inquiryResults(result);
                }


            } else if (conditionNum == 2) {
                System.out.println("반지름을 입력하세요.(단, 정수가 아닌 실수(ex : 2.0) 형태로 입력해야 합니다.)");
                double inputRadius = sc.nextDouble();
                double circleResult = cal.calculateCircleArea(inputRadius);
                System.out.println("원의 넓이 : " + circleResult);
                 System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.next();
                if (inquiry.equals("inquiry")) {
                    cal.circleResultInquiry(circleResult);
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
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
    }
}

