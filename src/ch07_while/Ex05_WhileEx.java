package ch07_while;

import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {

        /**
         * random() 메서드를 이용해서 1~100 사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력 받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는 지를 출력해줌
         */

        int i = 0;
        int sum = 1;
        boolean run = true;
        i = (int)(Math.random() * 100) + 1;

        while (run){

            Scanner scanner = new Scanner(System.in);
            System.out.print("숫자를 입력해주세요: ");
            int num1 = scanner.nextInt();

            if (num1 == i) {
                System.out.println("정답입니다");
                System.out.println("당신은 " + sum + "번 시도 했습니다.");
                run = false;

            }else if (num1 < i) {
                System.out.println("더 높은 숫자를 입력 해주세요");
                sum += 1;

            }else {
                System.out.println("더 작은 숫자를 입력 해주세요");
                sum += 1;

            }

        }

    }

}








