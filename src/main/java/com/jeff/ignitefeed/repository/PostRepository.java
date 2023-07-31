package com.jeff.ignitefeed.repository;

import com.jeff.ignitefeed.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
