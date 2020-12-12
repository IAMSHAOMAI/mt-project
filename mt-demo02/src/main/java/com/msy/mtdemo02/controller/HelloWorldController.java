package com.msy.mtdemo02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hi, " + name + "这是Demo02.";
    }
}
