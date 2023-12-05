package ch06_for;

public class Ex04_ForEx {
    public static void main(String[] args) {

        /**
         * 1부터 10까지의 합계를 아래와 같이 출력
         * 출력 예
         * 1+2+3+4+5+6+7+8+9+10 = 55
         */

        /**
         * 다른 예제 (교수님 예제)
         * if ( i < 10 ) {
         *  System.out.print(i + "+");
         *  } else {
         *  System.out.print(i+ "=");
         *  }
         */
        int sum = 0;
        int i = 1;
        for (i = 1; i < 10; i++) { //11에서 10으로 낮췄고 조건을 충족해서 아래 포문 i+ "+" 가 작동하지 않음
            sum = sum + i;
            System.out.print(i + "+");
        }
        sum = sum + i;
        System.out.println(i + "=" + sum);

    }
}

