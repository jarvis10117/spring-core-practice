package scope.singleton_eager.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scope.singleton_eager.config.ProjectConfig;
import scope.singleton_eager.service.CommentService;
import scope.singleton_eager.service.UserService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(
                ProjectConfig.class);
        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);
        boolean b =
        s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b);
    }
}