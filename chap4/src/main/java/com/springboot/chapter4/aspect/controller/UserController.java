package com.springboot.chapter4.aspect.controller;

import com.springboot.chapter4.aspect.service.UserService;
import com.springboot.chapter4.aspect.validator.UserValidator;
import com.springboot.chapter4.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Citrix on 2018-12-20.
 */
//定义控制器
@Controller
// 定义类请求路径
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService = null;

    //定义请求
    @RequestMapping("/print")
    //转换为json
    @ResponseBody
    public User printUser(Long id, String userName, String note) {
        User user = new User();
        user.setId(id);
        user.setNote(note);
        user.setUsername(userName);
        userService.printUser(user);
        return user;
    }
    // 定义请求
    @RequestMapping("/vp")
    // 返回json
    @ResponseBody
    public User validateAndPrint(Long id, String userName, String note) {
        User user = new User();
        user.setId(id);
        user.setUsername(userName);
        user.setNote(note);
        // 强制转换
        UserValidator userValidator = (UserValidator) userService;
        // 验证用户是否为空
        if (userValidator.validate(user)) {
            userService.printUser(user);
        }
        return user;
    }
    @RequestMapping("/manyAspects")
    public String manyAspects() {
        userService.manyAspects();
        return "manyAspects";
    }
}
