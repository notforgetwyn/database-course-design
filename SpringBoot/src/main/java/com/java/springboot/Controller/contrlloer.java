package com.java.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contrlloer {
    @RequestMapping("/home")
    public String home() {
        System.out.println("home");
        return "home";
    }

}
