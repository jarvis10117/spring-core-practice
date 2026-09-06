package scope.singleton.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scope.singleton.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}