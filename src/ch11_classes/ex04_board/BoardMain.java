package ch11_classes.ex04_board;

import ch11_classes.ex03_member.MemberService;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        BoardService boardService = new BoardService();

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("        1.글 작성 | 2.글 목록 | 3.글 조회 | 4.글 수정 | 5.글 삭제 | 6.검색 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scan.nextInt();
            if (selectNo == 1) {
                boardService.save();
            } else if (selectNo == 2) {
                boardService.findAll();
            } else if (selectNo == 3) {
                boardService.findById();
            } else if (selectNo == 4) {
                boardService.update();
            } else if (selectNo == 5) {
                boardService.delete();
            } else if (selectNo == 6) {
                boardService.findByTitle();
            } else if (selectNo == 0) {
                System.out.println("종료합니다.");
                run = false;
            }
        }
    }
}

