package com.ignitefeed.services.impl;

import com.ignitefeed.entities.PostsEntity;
import com.ignitefeed.repository.PostsRepository;
import com.ignitefeed.services.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    private final PostsRepository postsRepository;

    public PostServiceImpl(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    @Override
    public List<PostsEntity> listAllPosts() {
        return postsRepository.findAll();
    }

    @Override
    public PostsEntity createPost(PostsEntity postsEntity) {
        return postsRepository.save(postsEntity);
    }

    @Override
    public Optional<PostsEntity> findPostById (Long id) {
        return postsRepository.findById(id);
    }

    @Override
    public void deletePost (Long id) {
        postsRepository.deleteById(id);
    }

    @Override
    public PostsEntity updatePost(PostsEntity postsEntity) {
        return postsRepository.save(postsEntity);
    }
}
