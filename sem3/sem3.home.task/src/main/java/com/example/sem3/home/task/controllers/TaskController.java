package com.example.sem3.home.task.controllers;

import com.example.sem3.home.task.domain.User;
import com.example.sem3.home.task.services.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private DataProcessingService service;

    @GetMapping
    public List<String> getAllTasks() {
        List<String> listTasks = new ArrayList<>();
        listTasks.add("sort");
        listTasks.add("filter");
        listTasks.add("calc");
        return listTasks;
    }

    @GetMapping("/sort")
    public List<User> sortUserByAge() {
        return service.sortUsersByAge(service.getUserRepository().getUserList());
    }

    @GetMapping("/filter/{age}")
    public List<User> filterUserByAge(@PathVariable int age) {
        return service.filterUsersByAge(service.getUserRepository().getUserList(), age);
    }

    @GetMapping("/calc")
    public double calcAge() {
        return service.calculateAverageAge(service.getUserRepository().getUserList());
    }
}
