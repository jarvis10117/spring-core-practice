package scope.prototype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scope.prototype.repositories.CommentRepository;

@Service
public class UserService {
    private final CommentRepository commentRepository;


//    consider better aproch over directly wireing
    @Autowired
    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}

