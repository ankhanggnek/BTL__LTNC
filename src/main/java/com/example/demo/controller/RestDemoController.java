package com.example.demo.controller;

import java.util.concurrent.ExecutionException;
import com.example.demo.object.Person;
import com.example.demo.Service.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.object.Person;

@RestController
public class RestDemoController {
    @Autowired
    FirebaseService fireBaseService;
    @GetMapping("/getUserDetails")
    public Person getExample(@RequestHeader() String name) throws InterruptedException, ExecutionException {
        return fireBaseService.getUserDetails(name);
    }

    @PostMapping("/createUser")
    public String postExample(@RequestBody Person person) throws InterruptedException, ExecutionException {
        return fireBaseService.saveUserDetails(person);
    }

    @PostMapping("/login/auth")
    public ResponseEntity<String> authenticateUser(@RequestBody Person user) throws ExecutionException, InterruptedException {
        return ResponseEntity.ok(fireBaseService.authenticateUser(user));
    }

    @PutMapping("/updateUser")
    public String putExample(@RequestBody Person person) throws InterruptedException, ExecutionException {
        return fireBaseService.updateUserDetails(person);
    }

    @DeleteMapping("/deleteUser")
    public String deleteExample(@RequestHeader String name) {
        return fireBaseService.deleteUser(name);
    }


}