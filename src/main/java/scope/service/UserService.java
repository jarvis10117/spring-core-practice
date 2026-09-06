package scope.service;

import org.springframework.stereotype.Service;
import scope.repositories.CommentRepository;

@Service
public class UserService {

    private final CommentRepository commentRepository;

    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
