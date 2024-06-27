package uas.futsal_field_reservation.rest_api.futsal_field_reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.entity.User;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user) {
        return userService.loginUser(user.getUsername(), user.getPassword())
                .map(u -> ResponseEntity.ok("Login successful"))
                .orElse(ResponseEntity.status(401).body("Invalid credentials"));
    }
}
