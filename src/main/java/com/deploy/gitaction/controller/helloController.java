package com.deploy.gitaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class helloController {
    @GetMapping
    public String home(){
        return "CI/CD with GitActions";
    }

}
