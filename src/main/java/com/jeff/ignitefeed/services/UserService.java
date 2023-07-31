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
    public User findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));
    }

    public void deleteUser(Long id) {
        var user = findUserById(id);
        userRepository.delete(user);
    }

    public void editUser(Long id, User user) {
        var userById = findUserById(id);

        userById.setEmail(user.getEmail());
        userById.set(user.getEmail());
        userById.setEmail(user.getEmail());
        userById.setEmail(user.getEmail());
        userById.setEmail(user.getEmail());


        userRepository.save(user);
    }

}
