package ch11_classes.ex06_memberboard.service;

import ch11_classes.ex05_bank.AccountDTO;
import ch11_classes.ex06_memberboard.dto.BoardDTO;
import ch11_classes.ex06_memberboard.dto.MemberDTO;
import ch11_classes.ex06_memberboard.repository.BoardRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {

    BoardRepository boardRepository = new BoardRepository();
    private static List<BoardDTO> boardrepository = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    public static String loginEmail = null;

    public void menu() {
        if (loginEmail != null) {
            boolean run = true;
            int selectNo2 = 0;
            while (run) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("1.글 작성 | 2.글 목록 | 3.글 조회 | 4. 글 수정 | 5. 글 삭제 | 6. 검색 | 0. 메인메뉴 ");
                System.out.println("-----------------------------------------------------------------------");
                System.out.print("선택> ");
                selectNo2 = scan.nextInt();
//                if (selectNo2 == 1) {
//                    boardService.write();
//                } else if (selectNo2 == 2) {
//                    boardService.findWrite();
//                } else if (selectNo2 == 3) {
//                    boardService.findByTitle();
//                } else if (selectNo2 == 4) {
//                    boardService.updateWrite();
//                } else if (selectNo2 == 5) {
//                    boardService.deleteWrite();
//                } else if (selectNo2 == 6) {
//                    boardService.searchWrite();
//                }
            }
        } else {
            System.out.println("로그인한 회원만 이용할 수 있습니다.");
        }
    }
}
