package com.jeff.ignitefeed.controller;

import com.jeff.ignitefeed.entities.User;
import com.jeff.ignitefeed.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser (@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> listUsers () {
        return userService.listUsers();
    }

    @GetMapping
    public User findUserById (Long id) {
        return userService.findUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser (@PathVariable Long id, @RequestBody User user) {
        return userService.editUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser (@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
