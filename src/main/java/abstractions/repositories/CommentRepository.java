package abstractions.repositories;


import abstractions.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}