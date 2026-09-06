package abstractions.without_spring.main;

import abstractions.without_spring.model.Comment;
import abstractions.without_spring.proxies.EmailCommentNotificationProxy;
import abstractions.without_spring.repositories.DBCommentRepository;
import abstractions.without_spring.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        commentService.publishComment(comment);
    }
}