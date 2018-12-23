package com.springboot.chapter5.controller;


import com.springboot.chapter5.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Citrix on 2018-12-21.
 */
/*
* 控制层要写controller的，而且一般需要service层的接口
* */
/*
@Controller
@RequestMapping("/jpa")
public class JpaController {

    @Autowired
    JpaUserRepository jpaUserRepository = null;

    @ResponseBody//就是返回json的字符形式
    @RequestMapping("/getUser")
    public User getUser(Long id) {
        User user = jpaUserRepository.findById(id).get();
        return user;
    }
}
*/
