package ch11_classes.ex04_board;

import ch10_class.ex11.Board;
import ch11_classes.ex02.BookDTO;
import ch11_classes.ex03_member.MemberDTO;
import ch11_classes.ex03_member.MemberRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {

    Scanner scanner = new Scanner(System.in);
    BoardRepository boardRepository = new BoardRepository();
    private static String updatePass = null;
    BoardDTO boardDTO = null;

    public void save() {

        System.out.print("제목 : ");
        String boardTitle = scanner.next();
        System.out.print("작성자 : ");
        String boardWriter = scanner.next();
        System.out.print("내용 : ");
        String boardContents = scanner.next();
        System.out.print("비밀번호 : ");
        String boardPass = scanner.next();

        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents, boardPass);
        boolean result = boardRepository.save(boardDTO);
        if (result) {
            System.out.println("게시글이 등록되었습니다.");
        } else {
            System.out.println("게시글 등록에 실패하였습니다.");
        }
    }

    public void findAll() {
        List<BoardDTO> boardDTOList = boardRepository.findAll();
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println("존재하는 게시글 = " + boardDTO);
        }
    }

    public void findById() {
        System.out.print("ID를 이용하여 게시글 찾기 : ");
        Long searchId = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById(searchId);
        if (boardDTO != null && boardDTO.getId() == searchId ) {
            System.out.println("-----------------검색하신 " + searchId + "번 게시글의 내용-----------------");
            System.out.println(boardDTO + " 입니다.");
            System.out.println("조회수 : " + boardDTO.getBoardHits());
            boardDTO.plusHits();

        } else {
            System.out.println("조회결과가 없습니다!"); //이거 작동 안된다..
        }
    }


    public void update() {
        System.out.print("수정하실 글의 번호를 입력해주세요 : ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null) {
            System.out.print("비밀번호: ");
            String boardPass = scanner.next();
            BoardDTO loginResult = boardRepository.login(id, boardPass);
            if (loginResult != null) {
                System.out.print("수정할 제목: ");
                String boardTitle = scanner.next();
                System.out.print("수정할 내용: ");
                String boardContents = scanner.next();
                boolean updateResult = boardRepository.update(id, boardTitle, boardContents);
                if (updateResult) {
                    System.out.println("제목과 내용이 수정되었습니다.");

                }
            } else {
                System.out.println("비밀번호가 일치하지 않습니다!");
            }
        }
    }

    public void delete() {
        System.out.print("삭제할 게시글 ID : ");
        Long id = scanner.nextLong();
        boolean result = boardRepository.delete(id);
        if (result) {
            System.out.println(id + "번 게시글이 삭제 되었습니다.");
        } else {
            System.out.println("게시글이 정상적으로 삭제되지 않았습니다!");
        }
    }

    public void findByTitle() {
        System.out.print("게시글 제목 : ");
        String boardTitle = scanner.next();
        BoardDTO boardDTO = boardRepository.findByTitle(boardTitle);
        if (boardDTO != null) {
            System.out.println("입력하신 게시글 제목은 " + boardTitle + " 입니다.");
            System.out.println("게시글 내용 = " + boardDTO);

        } else {
            System.out.println("조회결과가 없습니다!");
        }
    }
}



