package com.jeff.ignitefeed.services;

import com.jeff.ignitefeed.entities.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    List<Post> listAllPosts();
    Post createPost(Post post);
    Optional<Post> findPostById(Long id);
    Post updatePost(Post post);
    void deletePost(Long id);
}
