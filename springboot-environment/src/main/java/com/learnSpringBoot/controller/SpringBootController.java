package com.learnSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootController {
    @RequestMapping("/hello")
    @ResponseBody
    public String doSome(){
        return "hello SpringBoot";
    }
}
