package com.example.myapp.controller;

import com.example.myapp.model.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        // Simuler l'authentification
        if ("admin".equals(username) && "password".equals(password)) {
            return ResponseEntity.ok("Login successful!");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    // Endpoint sécurisé accessible après login
    @GetMapping("/secure")
    public ResponseEntity<String> getSecureData() {
        return ResponseEntity.ok("This is a secure resource");
    }
}
