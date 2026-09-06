package abstractions.without_spring.proxies;


import abstractions.without_spring.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}