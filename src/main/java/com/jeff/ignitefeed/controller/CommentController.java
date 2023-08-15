package com.jeff.ignitefeed.controller;

import com.jeff.ignitefeed.entities.Comment;
import com.jeff.ignitefeed.services.CommentService;
import com.jeff.ignitefeed.utils.Utils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController (CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/post/{id}")
    public ResponseEntity<Comment> createComment(@PathVariable Long id, @RequestBody Comment comment) {
        var returnedComment = commentService.createComment(comment, id);
        URI uri = Utils.generateURI(returnedComment.getId());

        return ResponseEntity.created(uri).body(returnedComment);
    }

    @GetMapping
    public List<Comment> listComments() {
        return commentService.listComments();
    }

    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable Long id) {
        return commentService.findCommentById(id);
    }

    @PutMapping("/{id}")
    public Comment updateComment(@PathVariable Long id, @RequestBody Comment comment) {
        return commentService.updateComment(id, comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable("id") Long id) {
        commentService.deleteComment(id);
    }
}
