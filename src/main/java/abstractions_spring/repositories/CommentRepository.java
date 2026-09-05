package abstractions_spring.repositories;


import abstractions_spring.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}