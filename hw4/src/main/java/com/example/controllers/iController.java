package com.example.controllers;

import com.example.domain.Input;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Контроллер обработки задач.
 */
@Controller
public class iController {

    /**
     * Главная страница по адресу: http://localhost:8080/start
     */
    @GetMapping("/start")
    public String home(Model model) {
        String message1 = "Spring, использование шаблонизатора Thymeleaf";
        String message2 = "Задание №2: http://localhost:8080/task2";
        String message3 = "Задание №3: http://localhost:8080/task3";
        model.addAttribute("message1", message1);
        model.addAttribute("message2", message2);
        model.addAttribute("message3", message3);
        return "home";
    }


    /**
     * Получение страницы по адресу: http://localhost:8080/task2 с задачей №2
     */
    @GetMapping("/task2")
    public String task2(Model model) {
        model.addAttribute("firstName", "Виктор");
        model.addAttribute("lastName", "Виноградов");
        return "page-task2";
    }


    /**
     * Получение страницы по адресу: http://localhost:8080/task3 с пустой формой для заполнения
     */
    @GetMapping("/task3")
    public String form(Model model) {
        model.addAttribute("input", new Input());
        return "page-task3";
    }


    /**
     * Отправка данных из формы по адресу: http://localhost:8080/task3 и их вывод на странице
     */
    @PostMapping("/task3")
    public String formSubmit(@RequestParam String input, Model model) {
        model.addAttribute("input", input);
        return "result";
    }
}
