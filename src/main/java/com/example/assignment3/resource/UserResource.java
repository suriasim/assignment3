package com.example.assignment3.resource;


import com.example.assignment3.model.User;
import com.example.assignment3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userservice;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userservice.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userservice.getAllUsers();
    }

    /*
    @GetMapping
    public List<User> getById(@RequestParam(name = "id") String id) {
        return userService.getById(id);
    }

     */

    @PutMapping
    public User updateUser( @RequestBody User user) {
        return userservice.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "userId") String userId) {
        userservice.deleteUser(userId);
    }


}
