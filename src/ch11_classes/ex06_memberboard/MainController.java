package ch11_classes.ex06_memberboard;

import ch11_classes.ex06_memberboard.service.BoardService;
import ch11_classes.ex06_memberboard.service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoardService boardService = new BoardService();
        MemberService memberService = new MemberService();
        boolean run = true;
        int selectNo = 0;
        int selectNo2 = 0;
        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.게시판메뉴 | 0.종료 ");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택>  ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                memberService.save();
            } else if (selectNo == 2) {
                memberService.login();
            } else if (selectNo == 3) {
                memberService.findAll();
            } else if (selectNo == 4) {
                memberService.update();
            } else if (selectNo == 5) {
                memberService.delete();
            } else if (selectNo == 6) {
                memberService.logout();
            } else if (selectNo == 7) {
                boardService.menu();



//            } else if (selectNo == 0) {
            }
        }
    }
}
