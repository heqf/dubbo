package com.dubbo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.dubbo.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Reference  //注入要调用的服务
    private UserService userService;

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @NacosValue(value = "${useConfig:测试者age12}", autoRefreshed = true)
    private String useConfig;

    @NacosValue(value = "${name:测试者}", autoRefreshed = true)
    private String useName;

    @RequestMapping("/user/{name}")
    public String getUser(@PathVariable String name){
        //调用服务
        return userService.SayHello(name);
    }

    @RequestMapping("/getUseLocalCache")
    @ResponseBody
    public boolean getUseLocalCache(){
        //调用服务
        return useLocalCache;
    }

    @RequestMapping("/getUseConfig")
    @ResponseBody
    public String getUseConfig(){
        //调用服务
        return useConfig;
    }

    @RequestMapping("/getUseName")
    @ResponseBody
    public String getUseName(){
        //调用服务
        return useName;
    }


}
