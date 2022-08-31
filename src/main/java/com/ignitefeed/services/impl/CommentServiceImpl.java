package com.ignitefeed.services.impl;

import com.ignitefeed.entities.CommentEntity;
import com.ignitefeed.repository.CommentRepository;
import com.ignitefeed.services.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    public CommentServiceImpl (CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentEntity addComment(CommentEntity comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public CommentEntity updateComment(CommentEntity commentEntity) {
        return commentRepository.save(commentEntity);
    }
}
