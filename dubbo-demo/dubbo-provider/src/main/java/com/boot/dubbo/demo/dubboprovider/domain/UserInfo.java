package com.boot.dubbo.demo.dubboprovider.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息类
 */
@Data
public class UserInfo implements Serializable {
    private String account;
    private String password;
}
