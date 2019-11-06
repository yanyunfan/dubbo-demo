package com.boot.dubbo.demo.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.dubbo.demo.dubboprovider.api.UserService;
import com.boot.dubbo.demo.dubboprovider.domain.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference // 引用dubbo服务器提供服务器接口
    private UserService userService;

    @GetMapping("/login")
    public UserInfo login(UserInfo userInfo) {
        return userService.login(userInfo);
    }
}
