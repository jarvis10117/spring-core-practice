package scope.singleton_eager.scope_lazy.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scope.singleton_eager.scope_lazy.config.ProjectConfig;
import scope.singleton_eager.scope_lazy.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);
    }
}