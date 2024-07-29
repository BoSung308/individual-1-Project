package calculator;

import java.util.ArrayList;
import java.util.Scanner;
// import java.util.LinkedList;
public class App {
    public static void main(String[] args) {
        //LinkedList<Integer> intlist = new LinkedList<>();
         int [] numArrays = new int[10];
        // 10개의 배열을 선언한다는 의미에서 numArrays
        Calculator cal = new Calculator();
        ArrayList<Integer> results = new ArrayList<>();

        // Calculator 클래스로부터 인스턴스 생성

        int index = 0;
        // result 값이 저장된 공간의 수
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);
            // charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환 하고자하는 문자열의 위치를 받음.
            int result = cal.calculate(num1, num2, operator);


              // nan = not-a-number, 숫자가 아닌 결과,,ex) 0을 0으로 나누는 경우 nan
            System.out.println("계산 결과 : " + result);

            cal.addResult(result);
            System.out.println("현재 저장된 결과 : " + cal.getList());

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();

            if (remove.equals("remove")) {
               cal.removeResult(remove);
            }


//            System.out.println("결과: " + result);
//            if (0 <= nextIndex && nextIndex <= 10) {
//                intlist.add(result);
//                // 결과 값을 LinkedList 인덱스에 저장
//                nextIndex++;
//            }
//            System.out.println("현재 저장된 결과 : " + intlist);
//
//            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
//            String remove = sc.next();
//            if (remove.equals("remove")) {
//                // String 클래스는 equals()메서드를 오버라이드하여 문자열 내용 비교
//                intlist.remove(0);
//                // intlist 인덱스0의 저장값을 삭제
//                System.out.println("제일 먼저 저장된 결과가 삭제되었습니다.");
//            }
//
//            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
//            String inquiry = sc.next();
//            if (inquiry.equals("inquiry")) {
//                for (int intlist_inquiry : intlist) {
//                    System.out.print("[");
//                    System.out.print(intlist_inquiry);
//                    System.out.print("]");
//                }
//                System.out.println();
//            }
//                if (nextIndex < numArrays.length) {
//                // 배열이 다 차지 않은 상태            }
//                numArrays[nextIndex] = result;
//                // 결과 값을 배열의  인덱스에 저장
//                nextIndex++; // 문...
//
//
//                for (int i = 1; i < numArrays.length; i++) {
//                    //배열이 꽉 찼을 때
//                    numArrays[i - 1] = numArrays[i];
//                    // 새로운 값을 배열 마지막에 넣음
//
//            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
//            String finish = null;
//            try {
//                finish = sc.next();
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//            if (finish.equals("exit")) {
//                break;
//            }
//            System.out.println("숫자를 더 입력받겠습니다.");
//            // else문에서 sout사용할때 가독성이 안좋기 때문에 if문 닫고 sout으로 가능한 해결하는 것이 좋음
        }
    }
}



            // intlist 인덱스0의 저장값을 삭제



//            int results = 0;
//            cal.setKeep(results);
//            System.out.println("모든 계산 결과 : " + cal.getKeep());

//        if (Double.isNaN(result)) {
//            continue; // 오류가 발생, 루프 시작으로 초기화
//        }