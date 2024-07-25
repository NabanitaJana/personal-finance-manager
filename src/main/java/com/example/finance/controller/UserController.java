package com.example.finance.controller;

import com.example.finance.entity.User;
import com.example.finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.register(user.getName(), user.getEmail(), user.getPassword()));
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        return ResponseEntity.ok(userService.login(user.getEmail(), user.getPassword()));
    }

    // Other user-related endpoints
}
