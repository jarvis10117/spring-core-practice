package scope.singleton_eager.service;

import org.springframework.stereotype.Service;
import scope.singleton_eager.repositories.CommentRepository;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
