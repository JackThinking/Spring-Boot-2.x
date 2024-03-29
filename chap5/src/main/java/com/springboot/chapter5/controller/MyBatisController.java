package com.springboot.chapter5.controller;

import com.springboot.chapter5.dao.MyBatisUserDao;
import com.springboot.chapter5.pojo.User;
import com.springboot.chapter5.service.MyBatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Citrix on 2018-12-22.
 */
@Controller
@RequestMapping("/mybatis")
public class MyBatisController {

    @Autowired
    private MyBatisUserService myBatisUserService = null;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(Long id) {
        return myBatisUserService.getUser(id);
    }
}
