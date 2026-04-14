package com.example.quiz2.controller;

import com.example.quiz2.entity.User;
import com.example.quiz2.security.JwtService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtService jwtService;

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return jwtService.generateToken(user.getUsername());
    }
}