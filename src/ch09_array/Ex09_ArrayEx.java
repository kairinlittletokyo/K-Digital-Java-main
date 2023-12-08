package ch09_array;

import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {

        boolean run = true;
        int hidestudent = 0; //숨은 학생 숫자
        int student = 0; //학생의 숫자
        int grade = 100; //빠져 나갈 돈
        int select = 0; // 프로그램 메뉴 선택
        int addstudent = 0; // 추가될 학생의 수
        int num3 = 0; // 출금될 돈

        Scanner scanner = new Scanner(System.in);
        int[] num = null;
        num = new int[addstudent];

        while (run) {
            System.out.println("■------------------------------------------------------------------■");
            System.out.println("   1. 학생 수 입력 | 2. 점수 입력 | 3. 점수 목록 | 4. 분석 | 5. 종료 ");
            System.out.println("■------------------------------------------------------------------■");
            System.out.print("원하시는 기능을 선택해주세요 : ");
            select = scanner.nextInt();

            if (select == 1) {
                System.out.print("학생 수를 입력해주세요: ");
                addstudent = scanner.nextInt();
                hidestudent = hidestudent + addstudent;
                student = hidestudent + student;
                {

                }
                System.out.println("---------------------------------------");
                System.out.println("총 학생의 수는 " + student + "명으로 기록되었습니다.");
                System.out.println("---------------------------------------");


            }
            if (select == 2) {
                System.out.print("학생" + addstudent + "의 점수를 입력하세요 : ");
                num3 = scanner.nextInt();

            } else if (num3 > grade) {
                System.out.println("---------------------------------------");
                System.out.println("올바른 점수를 입력해주세요.");
                System.out.println("---------------------------------------");

//                } else if (num3 < grade) {
//                    for (int i = 0; i < coin.length; i++) {
//                        count = change / coin[i];
//                        System.out.println(coin[i] + "원 동전" + count + "개");
//                        System.out.println("테스트");

            }

        }
        if (select == 3) {
            System.out.println("---------------------------------------");
            System.out.println("현재 계좌의 총 잔액은 " + student + "원 입니다.");
            System.out.println("---------------------------------------");

        } else if (select == 4) {
            System.out.println("---------------------------------------");
            System.out.println("이용해주셔서 감사합니다, 안녕히 가십시오.");
            System.out.println("---------------------------------------");
//            break;

        }
    }
}


