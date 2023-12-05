package ch06_for;

public class Ex06_ForEx {
    public static void main(String[] args) {

        /**
         * 1 부터 100까지의 숫자 중에서 3의 배수만 출력하고 합계도 구하기
         */

        int sum = 0;
        int i = 1;
        System.out.print("입력한 숫자 중 3의 배수는 ");
        for (i = 1; i <= 100; i++) {

            if (i % 3 == 0) { // 3의 배수를 판단하는 기준
                System.out.print(i + ",");
                sum += i;
            }
        }
        System.out.println("이며");
        System.out.println("합한 값은 = " + sum + " 입니다");
    }
}

