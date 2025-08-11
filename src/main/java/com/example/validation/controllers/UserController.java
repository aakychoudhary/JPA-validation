package com.example.validation.controllers;


import com.example.validation.dto.UserRequest;
import com.example.validation.entity.User;
import com.example.validation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {


    @Autowired
    private UserService userService;



    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("/fetch")
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok(userService.getAllUser());

    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id){

        return ResponseEntity.ok(userService.getUser(id));
    }
}
