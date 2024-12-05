package com.example.sem3.home.task.services;

import com.example.sem3.home.task.domain.User;
import com.example.sem3.home.task.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private UserService userService;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private DataProcessingService dataProcessingService;
    @Autowired
    private UserRepository userRepository;

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    public void processRegistration(String name, int age, String email) {
        User newUser = userService.createUser(name, age,email);
        dataProcessingService.addUserToList(newUser);
        notificationService.sendNotification("New user is create!");
    }
}
