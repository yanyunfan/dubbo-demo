package com.boot.dubbo.demo.dubboprovider.api;

import com.boot.dubbo.demo.dubboprovider.domain.UserInfo;

public interface UserService {
    // 定义用户登录的api
    UserInfo login(UserInfo user);
}
