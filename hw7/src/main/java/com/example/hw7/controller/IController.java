package com.example.hw7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IController {

    // Домашняя страница
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // Страница для пользователей с ролью user
    @GetMapping("/public")
    public String userPage() {
        return "public";
    }

    // Авторизация пользователя
    @GetMapping("/login")
    public String auth() {
        return "login";
    }

    // Страница для пользователей с ролью admin
    @GetMapping("/private")
    public String adminPage() {
        return "private";
    }
}
