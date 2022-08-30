package com.ignitefeed.repository;

import com.ignitefeed.entities.PostsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<PostsEntity, Long> {
}
