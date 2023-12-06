package ch07_while;

public class Ex07_WhileEx {
    public static void main(String[] args) {

        /**
         * 1+ (-2) + 3 + (-4) + 5 (-6) 처럼
         * 계산 했을 때, 합계가 100이 됐을 때 숫자를 출력.
         */
        int sum = 0;
        // 1,2,3,4,5~~
        int count = 1;
        // 1, -2, -3, -4
        int num = 0;
        // 부호용 변수
        int s = 1;
        boolean run = true;
        while (run) {
            sum += num;
           22   num = s * count;
                s = -s; // 1, -1, 1, -1
                count++;
            }
            System.out.println("num, s, count" + num + s + count);
        }

    }
}

