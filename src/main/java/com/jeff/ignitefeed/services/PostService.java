package com.jeff.ignitefeed.services;

import com.jeff.ignitefeed.entities.Post;
import com.jeff.ignitefeed.exceptions.ObjectNotFoundException;
import com.jeff.ignitefeed.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.jeff.ignitefeed.utils.Utils.filtrarPropriedades;
import static org.springframework.beans.BeanUtils.copyProperties;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public List<Post> listPosts() {
        return postRepository.findAll();
    }

    public Post findPostById (Long id) {
        return postRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));
    }

    public Post updatePost(Post post, Long id) {
        var postById = findPostById(id);
        copyProperties(post,
                postById,
                filtrarPropriedades(post));
        return postRepository.save(postById);
    }

    public void deletePost (Long id) {
        var postById = findPostById(id);
        postRepository.delete(postById);
    }
}
