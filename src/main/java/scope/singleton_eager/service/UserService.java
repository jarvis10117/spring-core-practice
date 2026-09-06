package scope.singleton_eager.service;

import org.springframework.stereotype.Service;
import scope.singleton_eager.repositories.CommentRepository;

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
