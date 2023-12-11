package ch06_for;

public class Ex07_NestedFor {

    public static void main(String[] args) {


        for (int i = 2; i <= 8; i++) { //8단까지 출력
            System.out.println(i + "단");

            for (int j = 1; j <= 9; j++) { //x9 까지 출력
                int result = i * j;
                System.out.print(i + "x" + j + "=" + result + "  ");
            }

            System.out.println(" ");
        }

        System.out.println(" ");
    }
}

