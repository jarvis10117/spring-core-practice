package scope.singleton.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import scope.singleton.service.CommentService;

@Configuration
@ComponentScan(basePackages = "scope.singleton")
public class ProjectConfig {

    @Bean
    public CommentService commentService() {
        return new CommentService();
    }
}
