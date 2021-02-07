package com.thymeleaf.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/if-unless")
    public String users(Model model){
//        List<User> users = new ArrayList<>();
//        users.add(new User("Ramesh", "ramesh@gmail.com", "ADMIN"));
//        users.add(new User("Tom", "ramesh@gmail.com", "USER"));
//        users.add(new User("Bilyu", "ramesh@gmail.com", "ADMIN"));
//        users.add(new User("Seth", "ramesh@gmail.com", "VENDOR"));
//        users.add(new User("Goggins", "ramesh@gmail.com", "ADMIN"));
        model.addAttribute("users", userService.getUsers());
        return "if-unless";
    }
}
