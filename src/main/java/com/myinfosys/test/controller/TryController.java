package com.myinfosys.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TryController {

    @GetMapping("/home")
    public String getHome() {
        return "Hello World";
    }
}
