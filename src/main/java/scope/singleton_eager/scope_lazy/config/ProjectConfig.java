package scope.singleton_eager.scope_lazy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import scope.singleton_eager.scope_lazy.service.CommentService;

@Configuration
@ComponentScan(basePackages = "scope.singleton_eager.scope_lazy")
@Lazy
public class ProjectConfig {

    @Bean
    public CommentService commentService() {
        return new CommentService();
    }
}
