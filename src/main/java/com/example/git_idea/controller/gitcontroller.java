package com.example.git_idea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gitcontroller {

    @RequestMapping("info")
    public String info(){
        return "hello";
    }
}
