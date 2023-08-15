package com.jeff.ignitefeed.services;

import com.jeff.ignitefeed.entities.Comment;
import com.jeff.ignitefeed.exceptions.ObjectNotFoundException;
import com.jeff.ignitefeed.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.jeff.ignitefeed.utils.Utils.filtrarPropriedades;
import static org.springframework.beans.BeanUtils.copyProperties;


// Desnecessária a abstração dos métodos do JPA em outra interface
@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> listComments() {
        return commentRepository.findAll();
    }

    public Comment findCommentById(Long id) {
        return commentRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));
    }

    public Comment updateComment(Long id, Comment comment) {
        var commentById = findCommentById(id);
        copyProperties(comment,
                commentById,
                filtrarPropriedades(comment));
        return commentRepository.save(commentById);
    }

    public void deleteComment(Long id) {
        var comment = findCommentById(id);
        commentRepository.delete(comment);
    }
}
