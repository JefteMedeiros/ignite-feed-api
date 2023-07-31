package com.jeff.ignitefeed.services;

import com.jeff.ignitefeed.entities.Comment;
import com.jeff.ignitefeed.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

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
