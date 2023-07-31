package com.jeff.ignitefeed.services.impl;

import com.jeff.ignitefeed.entities.Post;
import com.jeff.ignitefeed.repository.PostRepository;
import com.jeff.ignitefeed.services.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> listAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Optional<Post> findPostById (Long id) {
        return postRepository.findById(id);
    }

    @Override
    public void deletePost (Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public Post updatePost(Post post) {
        return postRepository.save(post);
    }
}
