package ch07_while;

public class Ex02_WhileEx {
    public static void main(String[] args) {

        /*
        while 문으로 1~10까지 합계 출력
        1+2+3+4+5+6+7+8+9+10=55
         */

        int w = 0, sum = 0;
        while (w <= 9) {
            w++;
            sum = sum + w;
            if (w == 10) {
                System.out.println("10=" + sum);
            }else{
                System.out.print(w + "+");
            } //else 에서 w 값(123...) 출력 하라고 혼남 숫자 100이면 어쩔거냐고
            // 이전 코드 : sysout (" 12345678910 = " + sum ); 이었음
        }
    }
}
