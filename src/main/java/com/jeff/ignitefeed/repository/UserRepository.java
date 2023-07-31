package com.jeff.ignitefeed.repository;

import com.jeff.ignitefeed.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
}
