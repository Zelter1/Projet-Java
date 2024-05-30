package com.example.olympics.ticketing_system.controller;

import com.example.olympics.ticketing_system.model.User;
import com.example.olympics.ticketing_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public User addUser(@RequestBody User user) {
        // Appel du service pour ajouter un nouvel utilisateur
        return userService.addUser(user);
    }

    // endpoints pour les opérations CRUD sur les utilisateurs
}
