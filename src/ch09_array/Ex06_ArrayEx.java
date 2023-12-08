package ch09_array;

import java.util.Scanner;

public class Ex06_ArrayEx {
    public static void main(String[] args) {

        // 크기가 5인 정수형 배열을 선언
        // 스캐너로 배열에 값을 저장
        // 입렫된 값 중에 가장 큰 값 출력

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int max = 0;
        int[] numbers1 = new int[5];

        for (i = 0; i < numbers1.length; i++) {
            System.out.println("숫자를 입력하세요 : ");
            numbers1[i] = scanner.nextInt();

            if (numbers1[i]>max){
                max = numbers1[i];
            }
        }
        System.out.println("최댓값은" + max + "입니다.");
    }
}
