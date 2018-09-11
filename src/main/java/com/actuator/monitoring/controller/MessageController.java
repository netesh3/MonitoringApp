package com.actuator.monitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/msg")
    public static String getGreeting(){
        return "Hey I am glad";
    }
}
