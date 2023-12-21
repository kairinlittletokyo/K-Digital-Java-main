package ch11_classes.ex06_memberboard.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommentDTO { //id, boardId, commentWriter, commentContents, createdAt

    private Long id;
    private long boardId;
    private String commentWriter;
    private String commentContents;
    private String createdAt;

    private static Long idValue = 1L;
    public CommentDTO(String commentContents, String commentWriter){
        this.commentContents = commentContents;
        this.commentWriter = commentWriter;
        this.boardId = boardId;
        this.id = idValue++;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getBoardId() {
        return boardId;
    }

    public void setBoardId(long boardId) {
        this.boardId = boardId;
    }

    public String getCommentWriter() {
        return commentWriter;
    }

    public void setCommentWriter(String commentWriter) {
        this.commentWriter = commentWriter;
    }

    public String getCommentContents() {
        return commentContents;
    }

    public void setCommentContents(String commentContents) {
        this.commentContents = commentContents;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "id=" + id +
                ", boardId=" + boardId +
                ", commentWriter='" + commentWriter + '\'' +
                ", commentContents='" + commentContents + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
