package ch09_array;

import java.util.Scanner;
public class Ex10_TEST {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int studentNum = 0;
        int selectNo = 0;

        int[] scores = null; // scores라는 배열 이름만 선언

        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scan.nextInt();
            // 전역 변수이긴 하지만 while 문이 실행될 때마다 다시 선언되어 배열로 활용 불가
            // int[] score = null;

            if (selectNo == 1) {
                // 학생수 입력 받고 해당 수 크기를 갖는 배열로 선언
                System.out.print("학생수>");
                studentNum = scan.nextInt();
                // 입력받은 학생수만큼의 크기를 갖는 배열 객체로 선언(new)
                scores = new int[studentNum];
                //지역 변수로 선언하면 else if 에서 사용불가
                // int[] score = new int[studentNum];
            } else if (selectNo == 2) {
                // 배열에 점수 데이터 저장
                for (int i = 0; i < scores.length; i++) {
                    System.out.print((i + 1) + "번 학생 점수: ");
                    scores[i] = scan.nextInt();
                }
            } else if (selectNo == 3) {
                // 저장된 데이터 출력
                for (int i = 0; i < scores.length; i++) {
                    System.out.println((i + 1) + "번 학생 점수: " + scores[i]);
                }
            } else if (selectNo == 4) {
                // 최댓값, 평균값 계산 및 출력
                int sum = 0, max = 0;
                double avg = 0.0;
                for (int i = 0; i < scores.length; i++) {
                    if (max < scores[i]) {
                        max = scores[i];
                    } //최댓값 , 합계 한 번에 작업하신 내용
                    sum += scores[i];
                }
                avg = sum / scores.length;
                avg = (double) sum / scores.length;
                System.out.println("최고점수: " + max);
                System.out.println("평균점수: " + avg);

                // 내림차순 정렬 및 출력
                int temp = 0;
                for (int i = 0; i < scores.length; i++) {
                    for (int j = i + 1; j < scores.length; j++) {
                        if (scores[i] < scores[j]) {
                            temp = scores[i];
                            scores[i] = scores[j];
                            scores[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < scores.length; i++) {
                    System.out.println((i + 1) + "등: " + scores[i]);
                }
            } else if (selectNo == 5) {
                // 종료
                run = false;
            }
        }
    }
}

//    public static void main(String[] args) {
//
//        boolean run = true;
//        Scanner scanner = new Scanner(System.in);
//        int student = 0;
//        int[] realstudent = null;
//        int result = 0;
//
//        while (run) {
//            System.out.println("■------------------------------------------------------------------■");
//            System.out.println("   1. 학생 수 입력 | 2. 점수 입력 | 3. 점수 목록 | 4. 분석 | 5. 종료 ");
//            System.out.println("■------------------------------------------------------------------■");
//            System.out.print("원하는 기능을 선택해주세요: ");
//            int select = scanner.nextInt();
//
//
//            if (select == 1) {
//                System.out.print("학생 수를 입력하세요: ");
//                student = scanner.nextInt();
//
//                realstudent = new int[student];
//                System.out.println("■ " + student + "명의 학생을 추가하였습니다 ■");
//
//            } else if (student == 0) {
//                System.out.println("먼저 학생 수를 입력하세요.");
//            }
//
//
//            if (select == 2) {
//                for (int i = 0; i < student; i++) {
//                    System.out.print("학생 " + (i + 1) + "의 점수를 입력하세요: ");
//                    int score = scanner.nextInt();
//
//                    if (score < 0 || score > 100) {
//                        System.out.println("올바른 점수가 아닙니다.");
//                        i--;
//
//                    } else {
//                        realstudent[i] = realstudent[i] + score; // 현재 학생의 이전 점수에 현재 입력된 점수를 더함
//
//                    }
//                }
//            }
//
//
//            if (select == 3) {
//                System.out.println("■■■■■■■■■■■■■■■■■■■ 점수 목록 ■■■■■■■■■■■■■■■■■■■");
//                for (int i = 0; i < student; i++) {
//                    System.out.println("학생" + (i + 1) + "의 점수는: " + realstudent[i] + "점 입니다.");
//                }
//                if (select == 3 && student == 0) {
//                    System.out.println("먼저 학생 수를 입력하세요.");
//                }
//
//
//            }
//
//            if (select == 4) {
//                    for (int i = 0; i < realstudent.length; i++) {
//                        result += realstudent[i];
//                    }
//                    System.out.println("학생들의 점수 평균은 = " + result / realstudent.length + "점 입니다");
//                    System.out.println("학생들의 성적 등수는 아래와 같습니다.");
//
//
//                    int[] Stndrd = new int[student];
//                    for (int i = 0; i < student; i++) {
//                        Stndrd[i] = 1;
//                        for (int j = 0; j < student; j++) {
//                            if (realstudent[i] < realstudent[j]) {
//                                Stndrd[i]++;
//                            }
//                        }
//                    }
//                    for (int i = 0; i < student; i++){
//                        for (int j = i + 1; j < student; j++){
//                            if (Stndrd[i] > Stndrd[j]){
//                                int temp = Stndrd[i];
//                                Stndrd[i] = Stndrd[j];
//                                Stndrd[j] = temp;
//                            }
//                        }
//                    }
//                    for (int i = 0; i < student; i++){
//                        System.out.println(Stndrd[i] +"등:" + realstudent[i] );
//                    }
//                }
//
//                    if (select == 5) {
//                        System.out.println("프로그램을 종료합니다.");
//                        break;
//                    }
//                }
//            }
//        }
//
//
//
//
//
//
