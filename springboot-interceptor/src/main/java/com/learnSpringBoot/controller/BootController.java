package com.learnSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {

    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount(){
        return "访问user/account地址";
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public String userLogin(){
        return "访问user/login地址";
    }

    @RequestMapping("/user/yd")
    @ResponseBody
    public String userYD(){
        return "访问user/yd个人信息站";
    }
}
