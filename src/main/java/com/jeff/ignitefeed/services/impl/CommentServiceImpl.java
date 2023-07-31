package com.jeff.ignitefeed.services.impl;

import com.jeff.ignitefeed.entities.Comment;
import com.jeff.ignitefeed.repository.CommentRepository;
import com.jeff.ignitefeed.services.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    public CommentServiceImpl (CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }
}
