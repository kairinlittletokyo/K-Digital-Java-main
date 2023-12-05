package ch06_for;

public class Ex03_ForEx {
    public static void main(String[] args) {

        /**
         * 1부터 10까지의 합계를 출력
         */
        int sum = 0; //sum = 합계 출력
        for (int i = 1; i < 11; i++) {
            sum = sum + i;
        }
        System.out.println("for문 종료 후 sum = " + sum); // 반복되기 때문에 아래로
    }

}
