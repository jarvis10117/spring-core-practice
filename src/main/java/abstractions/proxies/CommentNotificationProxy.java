package abstractions.proxies;


import abstractions.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}