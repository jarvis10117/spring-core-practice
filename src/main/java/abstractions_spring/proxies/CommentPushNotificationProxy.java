package abstractions_spring.proxies;

import abstractions_spring.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// Right now not gonna work cause "ambugity" we can use @primary mark an implementaion default.
//@Primary
@Qualifier("PUSH")
public class CommentPushNotificationProxy
        implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println(
                "Sending push notification for comment: "
                        + comment.getText());
    }
}
