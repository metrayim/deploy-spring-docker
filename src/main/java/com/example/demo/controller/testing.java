package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class testing {
    @RequestMapping
    public String datashow(){
        return "hello me metra";
    }
}
