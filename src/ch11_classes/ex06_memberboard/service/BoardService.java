package ch11_classes.ex06_memberboard.service;

import ch11_classes.ex06_memberboard.common.CommonVariables;
import ch11_classes.ex06_memberboard.dto.BoardDTO;
import ch11_classes.ex06_memberboard.dto.CommentDTO;
import ch11_classes.ex06_memberboard.repository.BoardRepository;
import ch11_classes.ex06_memberboard.repository.CommentRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    private BoardRepository boardRepository = new BoardRepository();
    private CommentRepository commentRepository = new CommentRepository();
    private Scanner scanner = new Scanner(System.in);


    public void boardMenu() {
        if (CommonVariables.loginEmail != null) {
            boolean run = true;
            int selectNo2 = 0;
            while (run) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("1.글 작성 | 2.글 목록 | 3.글 조회 | 4.글 수정 | 5.글 삭제 | 6.검색 | 0.메인메뉴 ");
                System.out.println("-----------------------------------------------------------------------");
                System.out.print("선택> ");
                selectNo2 = scanner.nextInt();
                if (selectNo2 == 1) {
                    save();
                } else if (selectNo2 == 2) {
                    findAll();
                } else if (selectNo2 == 3) {
                    findById();
                } else if (selectNo2 == 4) {
                    updateWrite();
                } else if (selectNo2 == 5) {
                    deleteWrite();
                } else if (selectNo2 == 6) {
                    searchWrite();
                } else if (selectNo2 == 0) {
                    run = false;
                }
            }
        } else {
            System.out.println("로그인이 필요한 서비스입니다.");
        }
    }

    private void findAll() {
        List<BoardDTO> boardDTOList = boardRepository.findAll();
        listPrint(boardDTOList);
    }

    private void listPrint(List<BoardDTO> boardDTOList) {
        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t" + "date\t");
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println(boardDTO.getId() + "\t" + boardDTO.getBoardTitle() + "\t" +
                    boardDTO.getBoardWriter() + "\t" + boardDTO.getBoardHits() + "\t" +
                    boardDTO.getCreatedAt() + "\t");
        }
    }

    private void findById() {
        System.out.print("조회할 글의 ID를 입력하세요: ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null) {
            System.out.println(boardDTO);
            displayComments(id);
            while (true) {
                System.out.println("1.댓글 작성 | 2.메뉴로 돌아가기 | 0.종료");
                System.out.print("선택> ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    addComment(id);
                } else if (choice == 2) {
                    break;
                } else if (choice == 0) {
                    System.exit(0);
                } else {
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                }
            }
        } else {
            System.out.println("해당 ID의 글을 찾을 수 없습니다.");
        }
    }

    private void displayComments(Long boardId) {
        List<CommentDTO> comments = commentRepository.getComments(boardId);
        System.out.println("댓글 목록:");
        for (CommentDTO comment : comments) {
            System.out.println(comment);
        }
    }

    private void addComment(Long boardId) {
        scanner.nextLine(); // Buffer 비우기
        System.out.print("댓글 내용을 입력하세요: ");
        String commentContents = scanner.nextLine();
        CommentDTO commentDTO = new CommentDTO(commentContents, CommonVariables.loginEmail);
        commentRepository.save(boardId, commentDTO);
        System.out.println("댓글이 작성되었습니다.");
    }

    private void updateWrite() {
        System.out.print("수정할 글의 ID를 입력하세요: ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null) {
            if (CommonVariables.loginEmail.equals(boardDTO.getBoardWriter())) {
                scanner.nextLine(); // Buffer 비우기
                System.out.print("수정할 내용을 입력하세요: ");
                String updatedContents = scanner.nextLine();
                boardDTO.setBoardContents(updatedContents);
                boolean result = boardRepository.update(boardDTO);
                if (result) {
                    System.out.println("글이 수정되었습니다.");
                } else {
                    System.out.println("글 수정에 실패했습니다.");
                }
            } else {
                System.out.println("본인 글만 수정 가능합니다.");
            }
        }
    }

    private void deleteWrite() {
        System.out.print("삭제할 글의 ID를 입력하세요: ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null) {
            if (CommonVariables.loginEmail.equals(boardDTO.getBoardWriter())) {
                boolean result = boardRepository.delete(id);
                if (result) {
                    System.out.println("글이 삭제되었습니다.");
                } else {
                    System.out.println("글 삭제에 실패했습니다.");
                }
            } else {
                System.out.println("본인 글만 삭제 가능합니다.");
            }
        } else {
            System.out.println("해당 ID의 글을 찾을 수 없습니다.");
        }
    }

    private void searchWrite() {
        scanner.nextLine(); // Buffer 비우기
        System.out.print("검색어를 입력하세요: ");
        String keyword = scanner.nextLine();
        List<BoardDTO> searchResult = boardRepository.search(keyword);
        if (searchResult.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            System.out.println("검색 결과:");
            listPrint(searchResult);
        }
    }

    private void save() {
        scanner.nextLine(); // Buffer 비우기
        System.out.print("제목: ");
        String boardTitle = scanner.nextLine();
        String boardWriter = CommonVariables.loginEmail;
        System.out.print("내용: ");
        String boardContents = scanner.nextLine();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents);
        boolean result = boardRepository.save(boardDTO);
        if (result) {
            System.out.println("글이 작성되었습니다.");
        } else {
            System.out.println("글 작성에 실패했습니다.");
        }
    }
}