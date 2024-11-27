package com.example.hw3.services;

import com.example.hw3.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("User created: " + user.getName());
    }

    public void sendNotification(String s) {
        System.out.println(s);
    }
}