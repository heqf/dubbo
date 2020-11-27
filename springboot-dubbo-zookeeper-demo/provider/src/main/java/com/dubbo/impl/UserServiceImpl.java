package com.dubbo.impl;

import com.dubbo.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String SayHello(String name) {
        return "Hello " + name + "!";
    }
}
