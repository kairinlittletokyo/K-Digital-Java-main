package ch09_array;

import java.util.Scanner;

public class Ex04_ArrayEx {
    public static void main(String[] args) {

        /**
         * 아래와 같은 배열이 있을 때 1~10 사이의 숫자 중에서 하나를
         * 입력했을 때 그 숫자가 몇 번 인덱스에 있는지 출력
         */

        int num[] = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8,};
        int num1 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 10까지의 숫자를 입력해주세요.");
        num1 = scanner.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (num[i] == num1) {
                System.out.println("입력하신 숫자 " + num1 + "은 " + (i + 1) + "번째 칸에 있습니다.");
            }
        }
    }
}
