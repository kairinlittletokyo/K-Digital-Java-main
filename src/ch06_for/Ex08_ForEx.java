package ch06_for;

public class Ex08_ForEx {
    public static void main(String[] args) {

        /**
         * main method
         * @param args
         *
         * 구구단 출력하기
         */
        for (int i = 0; i <= 9 ; i++) { //몇 단
            System.out.println(i + "단");
            //println의 특징 : 값 입력 후 줄이 바뀜
            //9까지 가야하니까 작거나 같다 <=
                for (int j = 1; j <= 9; j++) {// 곱하는 수
                    System.out.print(i + "x" + j + "=" + (i*j));
                    // print 로 가면 가로로 나옴
                    System.out.print("\t");
                 } // \t \n 전부 일정 간격을 띄워주는 명령어.
//               System.out.println();
            System.out.println("\n");
            }
        }
    }

