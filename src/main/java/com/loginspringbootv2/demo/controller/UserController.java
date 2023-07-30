package com.loginspringbootv2.demo.controller;

import com.loginspringbootv2.demo.models.User;
import com.loginspringbootv2.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserController {

    private UserService userService;

    public UserController (UserService userService){
        super();
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable("username") String username){
        return new ResponseEntity<User>(userService.getUserByUsername(username),HttpStatus.OK);
    }
}
