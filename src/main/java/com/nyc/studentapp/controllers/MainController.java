package com.nyc.studentapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "helloWorld";
    }
}
