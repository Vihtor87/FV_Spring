package com.example.sem3.home.task.repository;

import com.example.sem3.home.task.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
