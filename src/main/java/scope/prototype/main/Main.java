package scope.prototype.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scope.prototype.config.ProjectConfig;
import scope.prototype.service.CommentService;
import scope.prototype.service.UserService;


public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    }
}