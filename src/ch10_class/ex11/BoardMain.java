package ch10_class.ex11;

import ch10_class.ex10.Member;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 글작성(매개변수 있는 생성자이용)
         *      글작성 정보는 스캐너로 받음. 글번호도 같이 입력함.
         * 2. 글조회
         *      글번호를 입력 받고 Board 클래스의 findById로 글번호를 넘긴다.
         * 3. 종료
         */
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        Board board = null;


        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.글작성 | 2.글조회 | 3.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.print("글 번호를 입력하세요 : ");
                long Id = scanner.nextLong();
                scanner.nextLine();

                System.out.print("제목을 입력하세요 : ");
                String Title = scanner.nextLine();

                System.out.print("작성자를 입력하세요 : ");
                String Writer = scanner.nextLine();

                System.out.print("내용을 입력하세요 : ");
                String Content = scanner.nextLine();

                board = new Board(Id, Title, Writer, Content);

                System.out.println("글 작성이 완료 되었습니다.");

            }
            if (selectNo == 2) {
                System.out.print("조회 할 글 번호를 입력하세요 : ");
                long searchId = scanner.nextInt();
                scanner.nextLine();

                if (board.getId() == searchId) {
                    board.plusHits(); // 조회수 증가
                    System.out.println("글 번호 " + searchId + "를 불러왔습니다.");
                    System.out.println("조회수 : " + board.getBoardHits());
                    System.out.println("글 제목 : " + board.getBoardTitle());
                    System.out.println("글 작성자 : " + board.getBoardWriter());
                    System.out.println("내용 : " + board.getBoardContents());
                } else {
                    System.out.println("존재 하지 않는 글입니다.");


                }
            }


            if (selectNo == 3) {
                System.out.println("프로그램을 종료 합니다.");
                run = false;
            }
        }
    }
}



