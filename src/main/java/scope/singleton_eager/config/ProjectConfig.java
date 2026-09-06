package scope.singleton_eager.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"scope.singleton_eager"})
public class ProjectConfig {
//    @Bean
//    public CommentService commentService() {
//        return new CommentService();
//    }
}
