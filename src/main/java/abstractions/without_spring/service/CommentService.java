package abstractions.without_spring.service;

import abstractions.without_spring.model.Comment;
import abstractions.without_spring.proxies.CommentNotificationProxy;
import abstractions.without_spring.repositories.CommentRepository;


public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
