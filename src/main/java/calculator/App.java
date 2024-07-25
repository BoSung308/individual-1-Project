package calculator;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> intlist = new LinkedList<>();
        // int [] numArrays = new int[10];
        // 10개의 배열을 선언한다는 의미에서 numArrays
        int nextIndex = 0;
        // 다음 값을 저장할 위치를 결정
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();


            System.out.println("사칙연산 기호를 입력하세요 : ");
            // charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환 하고자하는 문자열의 위치를 받음.
            char operator = sc.next().charAt(0);


            // if문으로 해보았는데 예외처리를 할 수가 없었다
            // 결국 switch문으로 해결했지만, if문에 대한 예외처리 공부가 더 필요

            int result = 0;
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
                    // 나눗셈에서 num2가 0인 경우 -> 수학적으로 분모가 0이 될 수 없음
                    // 분모 0을 입력할 때, result가 0으로 나오게 설정했는데 추후 이에 대한 정리가 다시 필요
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    } else {
                        result = num1 / num2;
                        break;
                    }
                default:
                    System.out.println("올바른 연산 기호를 입력하세요 (+, -, *, /).");
            }
            System.out.println("결과: " + result);
            if (0 <= nextIndex && nextIndex <= 10) {
                intlist.add(result);
                // 결과 값을 LinkedList 인덱스에 저장
                nextIndex++;
            }
            System.out.println("현재 저장된 결과 : " + intlist);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();
            if (remove.equals("remove")) {
                // String 클래스는 equals()메서드를 오버라이드하여 문자열 내용 비교
                intlist.remove(0);
                // intlist 인덱스0의 저장값을 삭제
                System.out.println("제일 먼저 저장된 결과가 삭제되었습니다.");
            }else{
                System.out.println("삭제할 결과값이 없습니다.");
            }

                /*if (nextIndex < numArrays.length) {
                // 배열이 다 차지 않은 상태            }
                numArrays[nextIndex] = result;
                // 결과 값을 배열의  인덱스에 저장
                nextIndex++;*/ // 문제를 다 읽고 풀어볼걸,,, 배열로 작성했는데 리스트로 바꾸라니 엉엉...

               /* for (int i = 1; i < numArrays.length; i++) {
               /* for (int i = 1; i < numArrays.length; i++) {
                    //배열이 꽉 찼을 때
                    numArrays[i - 1] = numArrays[i];
                    // 새로운 값을 배열 마지막에 넣음
                }*/

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String finish = sc.next();
            if (finish.equals("exit")) {
                break;
            }
            System.out.println("숫자를 더 입력받겠습니다.");
            // if - else문과 관련없는 내용은 가독성이 안좋기 때문에 if문 닫고 sout으로 가능한 해결하는 것 추천
        }
    }
}