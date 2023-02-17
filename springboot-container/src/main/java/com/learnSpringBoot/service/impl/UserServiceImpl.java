package com.learnSpringBoot.service.impl;

import com.learnSpringBoot.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello" + name);
    }
}
