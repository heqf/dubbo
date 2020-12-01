package com.dubbo.controller;

import com.dubbo.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Reference  //注入要调用的服务
    private UserService userService;

    @RequestMapping("/user/{name}")
    public String getUser(@PathVariable String name){
        //调用服务
        return userService.SayHello(name);
    }
}
