package aspects.service;

import aspects.model.Comment;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void printComment(Comment comment){
        System.out.println("UserService Author:" + comment.getAuthor());
    }
}
