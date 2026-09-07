package scope.example.prototype.proxies;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import scope.example.prototype.model.Comment;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    private Comment comment;

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment() {
        return this.comment;
    }

    public void processComment() {
        // changing the comment attribute
        System.out.println("Processing comment");
    }

    public void validateComment() {
        // validating and changing the comment attribute
        System.out.println("Validating comment");
    }
}
