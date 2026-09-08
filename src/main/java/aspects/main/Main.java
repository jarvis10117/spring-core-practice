package aspects.main;

import aspects.config.ProjectConfig;
import aspects.model.Comment;
import aspects.service.CommentService;
import aspects.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);
        var userService = c.getBean(UserService.class);
        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");
        service.publishComment(comment);
        userService.printComment(comment);
    }
}
