package com.thymeleaf.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message", "Hello world");
        return "helloworld";
    }

    @GetMapping("/cssjs")
    public String cssjs(Model model){
        model.addAttribute("message", "Hello world");
        return "add-css-js-demo";
    }

    @GetMapping("/table")
    public String table(Model model){
        model.addAttribute("message", "Hello world");
        return "table";
    }

}
