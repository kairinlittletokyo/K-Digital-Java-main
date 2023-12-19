package ch11_classes.ex04_board;

import ch11_classes.ex02.BookDTO;
import ch11_classes.ex03_member.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    //게시글 정보를 관리하는 boardDTOList

    private static List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean save(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> findAll() {
        return boardDTOList;
    }

    public BoardDTO findById(Long id) {
        BoardDTO boardDTO = null;
        for (BoardDTO boardDTO1: boardDTOList) {
            if (id.equals(boardDTO1.getId())) {
                boardDTO = boardDTO1;
            }
        }
        return boardDTO;
    }

    public boolean update(Long id, String boardTitle, String boardContents) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTOList.get(i).setBoardContents(boardContents);
                boardDTOList.get(i).setBoardTitle(boardTitle);
                result = true;
            }
        }
        return result;
    }


    public BoardDTO login(Long id, String boardPass) {
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId()) && boardPass.equals(boardDTOList.get(i).getBoardPass())) {
                boardDTO = boardDTOList.get(i);
            }
        }
        return boardDTO;
    }

    public boolean delete(Long id) {
            boolean result = false;
            for (int i = 0; i < boardDTOList.size(); i++) {
                if (id.equals(boardDTOList.get(i).getId())) {
                    boardDTOList.remove(i);
                    result = true;
                }
            }
            return result;
        }

    public BoardDTO findByTitle(String boardTitle) {
            BoardDTO boardDTO = null;
            for (int i = 0; i < boardDTOList.size(); i++) {
                if (boardTitle.equals(boardDTOList.get(i).getBoardTitle())) {
                    boardDTO = boardDTOList.get(i);
                }
            }
            return boardDTO;
        }
    }


