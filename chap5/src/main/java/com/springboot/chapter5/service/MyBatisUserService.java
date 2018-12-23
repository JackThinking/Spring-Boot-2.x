package com.springboot.chapter5.service;

import com.springboot.chapter5.pojo.User;

/**
 * Created by Citrix on 2018-12-22.
 */
public interface MyBatisUserService {
    public User getUser(Long id);
}
