package ch11_classes.ex06_memberboard.repository;

import ch11_classes.ex06_memberboard.dto.BoardDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    private static List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean save(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> findAll() {
        return boardDTOList;
    }

    public BoardDTO findById(Long id) {
        for (BoardDTO boardDTO : boardDTOList) {
            if (boardDTO.getId().equals(id)) {
                return boardDTO;
            }
        }
        return null;
    }

    public boolean delete(Long id) {
        BoardDTO boardDTO = findById(id);
        return boardDTO != null && boardDTOList.remove(boardDTO);
    }

    public List<BoardDTO> search(String keyword) {
        List<BoardDTO> searchResult = new ArrayList<>();
        for (BoardDTO boardDTO : boardDTOList) {
            if (boardDTO.getBoardTitle().contains(keyword) || boardDTO.getBoardContents().contains(keyword)) {
                searchResult.add(boardDTO);
            }
        }
        return searchResult;
    }

    public boolean update(BoardDTO updatedBoard) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (updatedBoard.getId().equals(boardDTOList.get(i).getId())) {
                // 해당 ID를 가진 게시물이 있으면 업데이트 수행
                boardDTOList.set(i, updatedBoard);
                return true;
            }
        }
        return false; // 해당 ID를 가진 게시물이 없으면 업데이트 실패
    }
}