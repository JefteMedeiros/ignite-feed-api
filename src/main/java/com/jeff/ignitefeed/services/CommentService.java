package com.jeff.ignitefeed.services;

import com.jeff.ignitefeed.entities.Comment;
import com.jeff.ignitefeed.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


// Desnecessária a abstração dos métodos do JPA em outra interface
@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }
}
