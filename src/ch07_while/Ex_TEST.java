package ch07_while;

import java.util.Scanner;

public class Ex_TEST {
    public static void main(String[] args) {

        boolean run = true;
        int hidemoney = 0; //숨은돈
        int jango = 0; //실제 계좌에 있는 돈
        int exitmoney = 0; //빠져 나갈 돈
        int num1 = 0; // 은행 메뉴 선택
        int num2 = 0; // 입금될 돈
        int num3 = 0; // 출금될 돈

        Scanner scanner = new Scanner(System.in);
        while (run) {
            System.out.println("■-------------------------------------■");
            System.out.println("  1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
            System.out.println("■-------------------------------------■");
            System.out.print("원하시는 기능을 선택해주세요 : ");
            num1 = scanner.nextInt();
            if (num1 == 1) {
                System.out.print("얼마를 입금하시겠습니까? : ");
                num2 = scanner.nextInt();
                hidemoney = hidemoney + num2;
                jango = hidemoney + jango;
                System.out.println("---------------------------------------");
                System.out.println("계좌의 " + num2 + "원이 입금 되었습니다.");
                System.out.println("현재 계좌의 총 잔액은 " + jango + "원 입니다.");
                System.out.println("---------------------------------------");

            } else if (num1 == 2) {
                System.out.print("얼마를 출금하시겠습니까? : ");
                num3 = scanner.nextInt();
                jango = jango - num3;
                if (num3 > jango) {
                    System.out.println("---------------------------------------");
                    System.out.println("계좌에 잔고가 부족합니다!");
                    System.out.println("---------------------------------------");

                } else if (num3 < jango) {
                    System.out.println("---------------------------------------");
                    System.out.println("계좌에서 " + num3 + "원을 출금하였습니다.");
                    System.out.println("현재 계좌의 총 잔액은 " + jango + "원 입니다.");
                    System.out.println("---------------------------------------");
                }

            }if (num1 == 3) {
                    System.out.println("---------------------------------------");
                    System.out.println("현재 계좌의 총 잔액은 " + jango + "원 입니다.");
                    System.out.println("---------------------------------------");

                } else if (num1 == 4) {
                System.out.println("---------------------------------------");
                System.out.println("이용해주셔서 감사합니다, 안녕히 가십시오.");
                System.out.println("---------------------------------------");
                break;

                }
            }
        }
    }







