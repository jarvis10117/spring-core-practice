package abstractions.with_spring.repositories;


import abstractions.with_spring.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}