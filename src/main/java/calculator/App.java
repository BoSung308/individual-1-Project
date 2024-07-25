package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] numArrays = new int[10];
        // 10개의 배열을 선언한다는 의미에서 numArrays
        int lastIndex = 0;
        // 다음 값을 저장할 위치를 결정
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();


            System.out.println("사칙연산 기호를 입력하세요 :");
            // charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환 하고자하는 문자열의 위치를 받음.
            char opreator = sc.next().charAt(0);


            // if문으로 해보았는데 예외처리를 할 수가 없었다
            // 결국 switch문으로 해결했지만, if문에 대한 예외처리 공부가 더 필요
            int result = 0;
            switch (opreator) {
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

            for(int i = 1; i <= 10; i++) {
                numArrays[lastIndex] = i;
                lastIndex++;
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String finish = sc.next();
            if (finish.equals("exit")) {
                break;
            }
        }
    }
}