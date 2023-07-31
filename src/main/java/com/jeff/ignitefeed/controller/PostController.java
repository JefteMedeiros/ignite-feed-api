package com.jeff.ignitefeed.controller;

import com.jeff.ignitefeed.entities.Post;
import com.jeff.ignitefeed.services.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.listAllPosts();
    }

    @GetMapping("/{id}")
    public Optional<Post> getPostById(@PathVariable("id") Long id) {
        return postService.findPostById(id);
    }

    @PostMapping()
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @DeleteMapping("/{id}")
    void deletePost (@PathVariable("id") Long id) {
        postService.deletePost(id);
    }

    @PutMapping
    public Post updatePost(@RequestBody Post post) {
        return postService.updatePost(post);
    }
}
