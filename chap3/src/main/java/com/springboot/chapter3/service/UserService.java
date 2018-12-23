package com.springboot.chapter3.service;

import com.springboot.chapter3.pojo.User;
import org.springframework.stereotype.Service;


/**
 * Created by Citrix on 2018/12/6.
 */
@Service
public class UserService {
    public void printUser(User user) {
        System.out.println("编码：" + user.getId());
        System.out.println("用户名称：" + user.getUserName());
        System.out.println("备注：" + user.getNote());
    }
}
