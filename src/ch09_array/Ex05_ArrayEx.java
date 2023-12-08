package ch09_array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex05_ArrayEx {
    public static void main(String[] args) {

        /**
         * 거스름돈 계산하기
         *
         *필요한 거스름돈을 입력했을 때 각 동전별로 몇 개가 필요한지 계산
         * 예)
         *
         * 170 이라고 입력하면
         * 100원 1개
         * 50원 1개
         * 10원 2개
         *
         * 780 입력시
         *
         * 500원 1개
         * 100원 2개
         * 50원 1개
         * 10원 3개
         *
         */


        int[] coin = {500, 100, 50, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("거스름돈 입력: ");
        int change = scanner.nextInt();
        int count = 0;
        // 거스름돈 / 동전 = 몫(갯수)
        for (int i = 0; i < coin.length; i++) {
            count = change / coin[i];
            System.out.println(coin[i] + "원 동전" + count + "개");
            // 나머지를 다음번 계산에 활용
            change = change % coin[i];

        }

//        Scanner scanner = new Scanner(System.in);
//        int[] coin = {500, 100, 50, 10};
//        int[] sum = new int[4]; //마지막에 모든 동전 출력하는 값 + 0~3 인덱스 출력
//        System.out.println("당신이 지급받은 돈은 얼마인가요?");
//        int num1 = scanner.nextInt();
//
//        for (int i = 0; i < coin.length; i++) {
//            sum[i] = num1 / coin[i]; //sum(돈 반복값) = (돈 입력값)/(500, 100, 50, 10) = 각각 나누기
//            num1 = num1 % coin[i]; // num1(돈 입력값) = (돈 입력값)/(500, 100, 50, 10) = 나머지
//            System.out.println("거슬러준 동전은 " + coin[i] + "원짜리 " + sum[i] + "개 입니다");
//                                      // 여기서 동전 값이 뜸        // 입력값 / 숫자의 몫
        }
    }



