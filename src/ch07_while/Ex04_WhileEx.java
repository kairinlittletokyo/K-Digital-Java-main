package ch07_while;

public class Ex04_WhileEx {
    public static void main(String[] args) {

        /**
         * random() 메서드를 이용해서  1~6이 나오는 주사위를 설정하고
         * 주사위가 계속 던져지면서 6이 나오면 종료되는 코드 작성
         */

        int j = 0;
        while(true) {
            j = (int)(Math.random() * 6) + 1;
            System.out.println("당신은 주사위를 던졌다! " + j + "이(가) 나왔다.");
            if (j == 6) {
                System.out.println("6이 나와 다음 턴에 주사위 운이 -0.6point 만큼 하락했다..!");
                break;

        }
        }
    }
}
