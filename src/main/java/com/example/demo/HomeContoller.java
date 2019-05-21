package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeContoller {
    @RequestMapping("/")
    public String homepage(){
        return "hometemplate";
    }
}
