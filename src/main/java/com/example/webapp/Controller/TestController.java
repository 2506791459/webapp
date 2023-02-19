package com.example.webapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hi")
    @RequestMapping("/hi")
    public String hi(){
        return "hi spring boot";
    }
}
