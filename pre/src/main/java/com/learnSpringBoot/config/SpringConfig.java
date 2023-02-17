package com.learnSpringBoot.config;

import com.learnSpringBoot.vo.Student;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ImportResource(value = "classpath:applicationContext.xml")
@PropertySource(value= "classpath:config.properties")
@ComponentScan(basePackages = "com.learnSpringBoot.vo")
public class SpringConfig {

//    @Bean(name = "student1")
//    public Student createStudent(){
//        Student s1  = new Student();
//        s1.setAge(26);
//        s1.setName("Dong Yu");
//        s1.setSex("male");
//        return s1;
//    }
}
