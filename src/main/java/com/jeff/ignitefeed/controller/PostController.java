package com.jeff.ignitefeed.controller;

import com.jeff.ignitefeed.entities.Post;
import com.jeff.ignitefeed.services.PostService;
import com.jeff.ignitefeed.utils.Utils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/user/{id}")
    public ResponseEntity<Post> createPost(@PathVariable Long id, @RequestBody Post post) {
        var returnedPost = postService.createPost(post, id);
        URI uri = Utils.generateURI(returnedPost.getId());

        return ResponseEntity.created(uri).body(returnedPost);
    }

    @GetMapping
    public List<Post> listPosts() {
        return postService.listPosts();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postService.findPostById(id);
    }

    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post post) {
        return postService.updatePost(post, id);
    }

    @DeleteMapping("/{id}")
    void deletePost (@PathVariable("id") Long id) {
        postService.deletePost(id);
    }
}
