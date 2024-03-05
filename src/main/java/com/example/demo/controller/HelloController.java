package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@ResponseBody
@RestController
public class HelloController {
    @RequestMapping("/Hello")
    public String hello(){
        return "Hello World";
    }
}
