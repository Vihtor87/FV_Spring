package com.example.sem3.example1.contorllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }
}
