package com.ignitefeed.controller;

import com.ignitefeed.entities.CommentEntity;
import com.ignitefeed.services.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {
    private final CommentService commentService;

    public CommentController (CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public CommentEntity addComment(@RequestBody CommentEntity comment) {
        return commentService.addComment(comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable("id") Long id) {
        commentService.deleteComment(id);
    }
}
