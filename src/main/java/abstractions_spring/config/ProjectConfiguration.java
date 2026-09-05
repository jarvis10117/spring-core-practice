package abstractions_spring.config;

import abstractions_spring.proxies.CommentNotificationProxy;
import abstractions_spring.proxies.EmailCommentNotificationProxy;
import abstractions_spring.repositories.CommentRepository;
import abstractions_spring.repositories.DBCommentRepository;
import abstractions_spring.service.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"abstractions_spring.proxies",
                        "abstractions_spring.service",
                        "abstractions_spring.repositories"}
)
public class ProjectConfiguration {
//    @Bean
//    public CommentRepository commentRepository() {
//        return new DBCommentRepository();
//    }
//    @Bean
//    public CommentNotificationProxy commentNotificationProxy() {
//        return new EmailCommentNotificationProxy();
//    }
//    @Bean
//    public CommentService commentService(
//            CommentRepository commentRepository,
//            CommentNotificationProxy commentNotificationProxy) {
//        return new CommentService(commentRepository, commentNotificationProxy);
//    }
}
