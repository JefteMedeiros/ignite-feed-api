package com.ignitefeed.controller;

import com.ignitefeed.entities.PostsEntity;
import com.ignitefeed.services.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostsEntity> getAllPosts() {
        return postService.listAllPosts();
    }

    @GetMapping("/{id}")
    public Optional<PostsEntity> getPostById(@PathVariable("id") Long id) {
        return postService.findPostById(id);
    }

    @PostMapping()
    public PostsEntity createPost(@RequestBody PostsEntity post) {
        return postService.createPost(post);
    }

    @DeleteMapping("/{id}")
    void deletePost (@PathVariable("id") Long id) {
        postService.deletePost(id);
    }

    @PutMapping
    public PostsEntity updatePost(@RequestBody PostsEntity postsEntity) {
        return postService.updatePost(postsEntity);
    }
}
