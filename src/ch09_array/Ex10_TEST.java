package ch09_array;

import java.util.Scanner;
public class Ex10_TEST {
    public static void main(String[] args) {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int student = 0;
        int[] realstudent = null;
        int result = 0;

        while (run) {
            System.out.println("■------------------------------------------------------------------■");
            System.out.println("   1. 학생 수 입력 | 2. 점수 입력 | 3. 점수 목록 | 4. 분석 | 5. 종료 ");
            System.out.println("■------------------------------------------------------------------■");
            System.out.print("원하는 기능을 선택해주세요: ");
            int select = scanner.nextInt();


            if (select == 1) {
                System.out.print("학생 수를 입력하세요: ");
                student = scanner.nextInt();

                realstudent = new int[student];
                System.out.println("■ " + student + "명의 학생을 추가하였습니다 ■");

            } else if (student == 0) {
                System.out.println("먼저 학생 수를 입력하세요.");
            }


            if (select == 2) {
                for (int i = 0; i < student; i++) {
                    System.out.print("학생 " + (i + 1) + "의 점수를 입력하세요: ");
                    int score = scanner.nextInt();

                    if (score < 0 || score > 100) {
                        System.out.println("올바른 점수가 아닙니다.");
                        i--;

                    } else {
                        realstudent[i] = realstudent[i] + score; // 현재 학생의 이전 점수에 현재 입력된 점수를 더함

                    }
                }
            }


            if (select == 3) {
                System.out.println("■■■■■■■■■■■■■■■■■■■ 점수 목록 ■■■■■■■■■■■■■■■■■■■");
                for (int i = 0; i < student; i++) {
                    System.out.println("학생" + (i + 1) + "의 점수는: " + realstudent[i] + "점 입니다.");
                }
                if (select == 3 && student == 0) {
                    System.out.println("먼저 학생 수를 입력하세요.");
                }


            }

            if (select == 4) {
                    for (int i = 0; i < realstudent.length; i++) {
                        result += realstudent[i];
                    }
                    System.out.println("학생들의 점수 평균은 = " + result / realstudent.length + "점 입니다");
                    System.out.println("학생들의 성적 등수는 아래와 같습니다.");


                    int[] Stndrd = new int[student];
                    for (int i = 0; i < student; i++) {
                        Stndrd[i] = 1;
                        for (int j = 0; j < student; j++) {
                            if (realstudent[i] < realstudent[j]) {
                                Stndrd[i]++;
                            }
                        }
                    }
                    for (int i = 0; i < student; i++){
                        for (int j = i + 1; j < student; j++){
                            if (Stndrd[i] > Stndrd[j]){
                                int temp = Stndrd[i];
                                Stndrd[i] = Stndrd[j];
                                Stndrd[j] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < student; i++){
                        System.out.println(Stndrd[i] +"등: 학생"+ (i+1));
                    }
                }

                    if (select == 5) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    }
                }
            }
        }






