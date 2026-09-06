package abstractions.with_spring.proxies;


import abstractions.with_spring.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}