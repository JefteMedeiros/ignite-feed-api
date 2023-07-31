package com.jeff.ignitefeed.controller;

import com.jeff.ignitefeed.entities.Comment;
import com.jeff.ignitefeed.services.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController (CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable("id") Long id) {
        commentService.deleteComment(id);
    }
}
