package com.jeff.ignitefeed.controller;

import com.jeff.ignitefeed.entities.User;
import com.jeff.ignitefeed.services.UserService;
import com.jeff.ignitefeed.utils.Utils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //ReponseEntity<T> vai ajudar fazer retornar 201
    @PostMapping
    public ResponseEntity<User> createUser (@RequestBody User user) {
        var returnedUser = userService.createUser(user);
        URI uri = Utils.generateURI(returnedUser.getId());

        return ResponseEntity.created(uri).body(returnedUser);
    }

    @GetMapping
    public List<User> listUsers () {
        return userService.listUsers();
    }

    @GetMapping("/{id}")
    public User findUserById (@PathVariable Long id) {
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
