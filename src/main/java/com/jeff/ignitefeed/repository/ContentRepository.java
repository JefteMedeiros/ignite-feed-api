package com.jeff.ignitefeed.repository;

import com.jeff.ignitefeed.entities.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}
