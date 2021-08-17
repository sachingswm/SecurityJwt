package com.example.work1.service;

import com.example.work1.entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    private List<User> users=new ArrayList<>();

    public UserService() {
        users.add(new User("sachin",new BCryptPasswordEncoder().encode("password1")));
        users.add(new User("swayam",new BCryptPasswordEncoder().encode("password2")));
    }

    public List<User> getUsers() {
        return users;
    }


}
