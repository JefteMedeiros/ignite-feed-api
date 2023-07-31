package com.jeff.ignitefeed.services;

import com.jeff.ignitefeed.entities.User;
import com.jeff.ignitefeed.exceptions.ObjectNotFoundException;
import com.jeff.ignitefeed.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> listUsers() {
        return userRepository.findAll();
    }

    // Criar uma exception na package exceptions
    // OrElseThrow o nome já diz
    public User listUser(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));
    }

}
