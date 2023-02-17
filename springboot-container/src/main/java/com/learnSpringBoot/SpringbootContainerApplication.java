package com.learnSpringBoot;

import com.learnSpringBoot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootContainerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootContainerApplication.class, args);

        UserService userService = (UserService) ctx.getBean("userService");

        userService.sayHello("Dong Yu");
    }

}
