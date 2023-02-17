package com.learnSpringBoot.controller;

import com.learnSpringBoot.vo.SchoolInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloController {

    @Value("${server.port}")
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${school.name}")
    private String name;

    @Value("${school.website}")
    private String site;

    @Resource
    private SchoolInfo info;

    @RequestMapping("/data")
    @ResponseBody
    public String queryData(){
        return name + ", site=" + site + ", address=" + contextPath + ", port= "+port;
    }

    @RequestMapping("/info")
    @ResponseBody
    public String queryInfo(){
        return info.toString();
    }
}
