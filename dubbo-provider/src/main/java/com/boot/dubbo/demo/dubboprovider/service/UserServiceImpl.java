package com.boot.dubbo.demo.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.dubbo.demo.dubboprovider.api.UserService;
import com.boot.dubbo.demo.dubboprovider.domain.UserInfo;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    public UserInfo login(UserInfo user) {
        UserInfo reUser = new UserInfo();
        reUser.setAccount("登录的账号为:"+user.getAccount());
        reUser.setPassword("登录的密码为:"+user.getPassword());

        return reUser;
    }
}
