package com.thymeleaf.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("Ramesh", "ramesh@gmail.com", "ADMIN"));
        users.add(new User("Tom", "ramesh@gmail.com", "USER"));
        users.add(new User("Bilyu", "ramesh@gmail.com", "ADMIN"));
        users.add(new User("Seth", "ramesh@gmail.com", "VENDOR"));
        users.add(new User("Goggins", "ramesh@gmail.com", "ADMIN"));

        return users;
    }

}
