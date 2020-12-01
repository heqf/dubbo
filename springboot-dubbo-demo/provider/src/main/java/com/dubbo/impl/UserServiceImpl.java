package com.dubbo.impl;

import com.dubbo.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class UserServiceImpl implements UserService {

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public String SayHello(String name) {
        return String.format("[%s] : Hello , %s", serviceName, name);
    }
}
