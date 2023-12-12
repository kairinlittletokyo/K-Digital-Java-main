package ch10_class.ex7;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        /**
         * 실행하면 반복문으로 메뉴를 출력
         * 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈
         * 각 번호를 선택하면 Calculator 클래스에 있는 해당 메서드를 호출하여 결과를 출력함
         */
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        boolean run = true;
        while (run) {
            System.out.println("1. 덧셈 / 2. 뺄셈 / 3. 곱셈 / 4. 나눗셈 / 5. 종료");
            System.out.print("선택하실 메뉴를 입력해주세요 : ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("프로그램을 종료합니다.");
                run = false;

            } else {

                int num1, num2;

                System.out.print("첫 번째 정수를 입력하세요: ");
                num1 = scanner.nextInt();
                System.out.print("두 번째 정수를 입력하세요: ");
                num2 = scanner.nextInt();

                if (choice == 1) {
                    calculator.sum(num1, num2);
                } else if (choice == 2) {
                    calculator.sub(num1, num2);
                } else if (choice == 3) {
                    int mul = calculator.mul(num1, num2);
                    System.out.println("곱셈 결과: " + mul);
                } else if (choice == 4) {
                    int div = calculator.div(num1, num2);
                    System.out.println("나눈 결과: " + div);



                }
            }
        }
    }
}
