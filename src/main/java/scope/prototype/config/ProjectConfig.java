package scope.prototype.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import scope.prototype.service.CommentService;

@Configuration
public class ProjectConfig {
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentService commentService() {
        return new CommentService();
    }
}
