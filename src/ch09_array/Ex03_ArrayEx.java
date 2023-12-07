package ch09_array;

import java.util.Scanner;

public class Ex03_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 3인 정수형 배열을 선언하고
         * 실행 했을 때 스캐너로 정수값을 입력받아 배열에 저장
         * 배열에 저장된 값의 총합, 평균 계산
         */


        int[] numbers1 = new int[3];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;

        for (i = 0; i < numbers1.length; i++) {
            System.out.print("정수를 입력하세요: ");
            numbers1[i] = scanner.nextInt();
            sum += numbers1[i];

        }
        System.out.println("저장 값 포함 총합은 : " + sum + "이고");
        System.out.println("평균은 " + sum / numbers1.length + " 입니다.");
    }
}
