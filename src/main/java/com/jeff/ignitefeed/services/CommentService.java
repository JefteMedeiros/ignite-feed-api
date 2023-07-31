package com.jeff.ignitefeed.services;

import com.jeff.ignitefeed.entities.Comment;

public interface CommentService {
    Comment addComment(Comment comment);
    Comment updateComment(Comment comment);
    void deleteComment(Long id);
}
