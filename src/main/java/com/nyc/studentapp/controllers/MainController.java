package com.nyc.studentapp.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String index() {
        logger.info("Accessing index page");
        return "index";
    }

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "helloWorld";
    }
}
