package scope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import scope.service.CommentService;

@Configuration
public class ProjectConfig {
    @Bean
    public CommentService commentService() {
        return new CommentService();
    }
}
