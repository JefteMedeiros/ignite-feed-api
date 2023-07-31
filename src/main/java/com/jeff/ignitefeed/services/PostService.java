package com.jeff.ignitefeed.services;

import com.jeff.ignitefeed.entities.Post;
import com.jeff.ignitefeed.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public Optional<Post> findPostById (Long id) {
        return postRepository.findById(id);
    }

    public void deletePost (Long id) {
        postRepository.deleteById(id);
    }

    public Post updatePost(Post post) {
        return postRepository.save(post);
    }
}
