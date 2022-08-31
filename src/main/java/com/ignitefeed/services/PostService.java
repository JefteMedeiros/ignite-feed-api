package com.ignitefeed.services;

import com.ignitefeed.entities.PostsEntity;

import java.util.List;
import java.util.Optional;

public interface PostService {
    List<PostsEntity> listAllPosts();
    PostsEntity createPost(PostsEntity post);
    Optional<PostsEntity> findPostById(Long id);
    PostsEntity updatePost(PostsEntity postsEntity);
    void deletePost(Long id);
}
