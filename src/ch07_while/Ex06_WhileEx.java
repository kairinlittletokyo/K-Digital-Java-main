package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int num = 0;
        boolean run = true;

        System.out.print("정수를 입력하고 마지막에 0을 입력하세요.: ");
        while (true) {

            int num1 = scanner.nextInt();
            if (num1 == 0) {
                run = false;

                System.out.println("입력하신 숫자는" + count + "개 입니다.");
                System.out.println("입력하신 숫자의 평균은"+ num / count + "입니다");
            }else{
                count++;
                num += num1;
            }
        }
    }
}

/**
 * inv avg1 = sum / count;
 * sout("avg1 =" + avg1);
 * double avg2 = sum / count;
 * sout("avg2 = + avg2);
 * double avg3 = (double) sum / count;
 * sout("avg3 = + avg3);
 */