package ch11_classes.ex06_memberboard.repository;

import ch11_classes.ex06_memberboard.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    private static List<CommentDTO> commentDTOList = new ArrayList<>();

    public boolean save(Long boardId, CommentDTO commentDTO) {
        commentDTO.setBoardId(boardId); // 댓글에 boardId 설정
        return commentDTOList.add(commentDTO);
    }


    public List<CommentDTO> findByBoardId(Long boardId) {
        List<CommentDTO> commentsForBoard = new ArrayList<>();
        for (CommentDTO commentDTO : commentDTOList) {
            if (commentDTO.getBoardId() == boardId) {
                commentsForBoard.add(commentDTO);
            }
        }
        return commentsForBoard;
    }
    public List<CommentDTO> getComments(Long boardId) {
        List<CommentDTO> result = new ArrayList<>();
        for (CommentDTO comment : commentDTOList) {
            if (comment.getBoardId() == boardId) {
                result.add(comment);
            }
        }
        return result;
    }
}