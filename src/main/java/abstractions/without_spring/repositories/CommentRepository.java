package abstractions.without_spring.repositories;


import abstractions.without_spring.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}