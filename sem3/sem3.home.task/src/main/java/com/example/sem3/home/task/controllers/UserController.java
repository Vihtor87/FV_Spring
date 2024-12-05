package com.example.sem3.home.task.controllers;

import com.example.sem3.home.task.domain.User;
import com.example.sem3.home.task.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RegistrationService service;

    @GetMapping
    public List<User> userList() {
        return service.getDataProcessingService().getUserRepository().getUserList();
    }

    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user) {
        service.processRegistration(user.getName(), user.getAge(), user.getEmail());
        return "Done. User add";
    }
}
