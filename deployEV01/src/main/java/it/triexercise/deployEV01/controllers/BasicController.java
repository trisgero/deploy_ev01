package it.triexercise.deployEV01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {


    @Autowired
    private Environment environment;

    @GetMapping
    public String getGreetingMessage() {
        return "Welcome " + environment.getProperty("devName") +
        "! <br> AUTHCODE: " + environment.getProperty("authCode");
    }
}
