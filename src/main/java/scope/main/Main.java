package scope.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scope.config.ProjectConfig;
import scope.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = c.getBean(CommentService.class);
        var cs2 = c.getBean("commentService", CommentService.class);

        boolean b = cs1 == cs2 ;
        System.out.println(b);
    }
}
