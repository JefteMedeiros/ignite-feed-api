package com.jeff.ignitefeed.services;

import com.jeff.ignitefeed.entities.User;
import com.jeff.ignitefeed.exceptions.ObjectNotFoundException;
import com.jeff.ignitefeed.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.jeff.ignitefeed.utils.Utils.filtrarPropriedades;
import static org.springframework.beans.BeanUtils.copyProperties;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> listUsers() {
        return userRepository.findAll();
    }

    // Criar uma exception na package exceptions
    // OrElseThrow o nome já diz
    public User findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));
    }

    public User updateUser(Long id, User user) {
        var userById = findUserById(id);
        copyProperties(user,
                userById,
                filtrarPropriedades(user));
        return userRepository.save(userById);
    }

    public void deleteUser(Long id) {
        var user = findUserById(id);
        userRepository.delete(user);
    }
}
