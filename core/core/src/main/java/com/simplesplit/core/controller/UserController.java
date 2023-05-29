package com.simplesplit.core.controller;

import com.simplesplit.core.model.User;
import com.simplesplit.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @PutMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        User temp = new User();
        System.out.println(user.toString());
        temp.setUsername(user.getUsername());
        temp.setPassword(user.getPassword());
        return userService.registerUser(temp);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user) {
        return userService.loginUser(user);
    }
}
