package com.springboot.chapter6.service;

import com.springboot.chapter6.pojo.User;

/**
 * Created by Citrix on 2018-12-22.
 */
public interface UserService {
    public User getUser(Long id);

    public int insertUser(User user);
}
