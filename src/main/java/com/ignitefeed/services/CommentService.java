package com.ignitefeed.services;

import com.ignitefeed.entities.CommentEntity;

public interface CommentService {
    CommentEntity addComment(CommentEntity comment);
    CommentEntity updateComment(CommentEntity commentEntity);
    void deleteComment(Long id);
}
