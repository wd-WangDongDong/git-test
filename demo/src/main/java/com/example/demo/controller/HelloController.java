package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public void Hello(){
        System.out.println("hello git project");
    }

    @RequestMapping(value = "/hello2")
    public void Hello2(){
        System.out.println("hello2");
    }
}
