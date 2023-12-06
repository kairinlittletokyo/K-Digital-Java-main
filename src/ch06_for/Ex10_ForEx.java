package ch06_for;

import java.util.Scanner;

public class Ex10_ForEx {
    public static void main(String[] args) {

        /**
         * 정수를 하나 입력 받고
         * 1부터 입력받은 정수까지의 정수 중
         * 2의 배수, 3의 배수를 제외한 수의 총 합 추력
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요");
        int num = sc.nextInt();

        int sum = 0;
        int i = 1;
        for (i = 1; i <= num; i++) {

            for (i = 1; i <= num; i++) {
                if (i % 3 != 0 && i % 2 != 0) {
                    sum += i;
                    // 3!=0 2!=0 으로 배수를 아예 제외시켜버렸음
                }
             }
            System.out.println("1부터" + num + "까지 중 " + "입력한 값에 2와 3의 배수를 제외한 값은 " + sum + "입니다" );
        }
    }
}

