package scope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import scope.service.CommentService;

@Configuration
@ComponentScan(basePackages = {"scope.service", "scope.repositories"})
public class ProjectConfig {
//    @Bean
//    public CommentService commentService() {
//        return new CommentService();
//    }
}
