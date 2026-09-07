package scope.example.prototype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import scope.example.prototype.model.Comment;
import scope.example.prototype.proxies.CommentProcessor;

@Service
public class CommentService {

    private final ApplicationContext context;
    public CommentService(ApplicationContext context) {
        this.context = context;

    }

    public void sendComment(Comment c) {
        CommentProcessor p =
                context.getBean(CommentProcessor.class);
        p.setComment(c);
        p.processComment();
        p.validateComment();
        c = p.getComment();
//      do something further
    }
}