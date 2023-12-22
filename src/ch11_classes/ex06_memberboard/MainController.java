package ch11_classes.ex06_memberboard;

import ch11_classes.ex06_memberboard.service.BoardService;
import ch11_classes.ex06_memberboard.service.MemberService;

import java.util.Scanner;


public class MainController {
    public static void main(String[] args) {

        MemberService memberService = new MemberService();
        BoardService boardService = new BoardService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.게시판메뉴 | 0.종료");
            System.out.print("메뉴 선택: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                memberService.signUp();
            } else if (choice == 2) {
                memberService.login();
            } else if (choice == 3) {
                memberService.displayMembers();
            } else if (choice == 4) {
                memberService.updateMember();
            } else if (choice == 5) {
                memberService.deleteMember();
            } else if (choice == 6) {
                memberService.logout();
            } else if (choice == 7) {
                boardService.boardMenu();
            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }
}