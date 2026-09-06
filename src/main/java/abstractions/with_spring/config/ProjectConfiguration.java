package abstractions.with_spring.config;

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
