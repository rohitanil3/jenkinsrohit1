package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController1 {

    @GetMapping
    public String display(){
        return "hiii";
    }
}
