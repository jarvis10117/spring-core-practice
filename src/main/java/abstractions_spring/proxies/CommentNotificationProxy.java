package abstractions_spring.proxies;


import abstractions_spring.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}