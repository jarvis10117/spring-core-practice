package abstractions.without_spring.repositories;


import abstractions.without_spring.model.Comment;


public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}