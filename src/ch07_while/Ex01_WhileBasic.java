package ch07_while;

public class Ex01_WhileBasic {

    public static void main(String[] args) {

//        포문 사용 예시
//        for (int i = 1; i <=3; i++) {
//            System.out.println("i =" +i);
//         }


//        1~3 까지 출력


        int i = 1; //while 에 들어가기 전 변수 선언해야함
        while (i <= 3) {
            System.out.println("i = " + i);
            i++; //i값이 변해야 하기에 아래에서 추가
        }


        int j = 10;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 3);
        System.out.println("do while 종료 후 j = " + j);
//do while 은 일단 한 번 무조건 실행한다.
// 그래서 while 은 10을 넣었을 때 미출력, do는 10을 넣었을 때 출력


        //무한반복
        int k = 1;
        while(true) {
            System.out.println("안녕하세요?" + k);
            k++;
            if (k == 3) {
                break;
            }
            System.out.println("break 다음 문장");
        }
            
        int l = 1;
        boolean run = true;
        while (run) {
            System.out.println("l = " + l);
            l++;
            if (l == 3){
                run = false;
            }
            System.out.println("run = false 다음 문장");
        }
    }
}

