package com.example.hw3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hw3.domain.User;
import com.example.hw3.repository.UserRepository;

@Service
public class RegistrationService {

    @Autowired
    private DataProcessingService dataProcessingService;

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    //Базовое задание
    //В класс RegistrationService добавить
    //поля UserService, NotificationService(добавить в IOC контейнер аннотацией
    //@Autowired или через конструктор класса)

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    // Добавляем связь с репозиторием
    @Autowired
    private UserRepository userRepository;

    //Разработать метод processRegistration в котором:
    //создается пользователь из параметров метода
    //созданный пользователь добавляется в репозиторий
    //через notificationService выводится сообщение в консоль

    public void processRegistration(String name, int age, String email) {
        User newUser = userService.createUser(name, age,email);
        dataProcessingService.addUserToList(newUser);
        notificationService.sendNotification("New user is create!");
    }
}
