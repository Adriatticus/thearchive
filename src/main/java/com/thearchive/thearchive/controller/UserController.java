package com.thearchive.thearchive.controller;

import com.thearchive.thearchive.resource.UserResource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    // @GetMapping
    // public List<UserResource> getAllUsers() {
    //     // Logic to retrieve all users
    //     return List.of(); // Replace with actual implementation
    // }

    @GetMapping("/{id}")
    public UserResource getUserById(@PathVariable Long id) {
        // Logic to retrieve a user by ID
        return null; // Replace with actual implementation
    }

    @PostMapping
    public UserResource createUser(@RequestBody UserResource userResource) {
        // Logic to create a new user
        return null; // Replace with actual implementation
    }

    @PutMapping("/{id}")
    public UserResource updateUser(@PathVariable Long id, @RequestBody UserResource userResource) {
        // Logic to update an existing user
        return null; // Replace with actual implementation
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        // Logic to delete a user by ID
    }
}
