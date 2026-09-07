package scope.example.prototype.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scope.example.prototype.config.ProjectConfig;
import scope.example.prototype.model.Comment;
import scope.example.prototype.service.CommentService;
import scope.example.prototype.service.UserService;


public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var s1 = c.getBean(CommentService.class);

        Comment comment1 = new Comment();
        comment1.setText("First comment");
        s1.sendComment(comment1);

        Comment comment2 = new Comment();
        comment2.setText("Second comment");
        s1.sendComment(comment2);
    }

}