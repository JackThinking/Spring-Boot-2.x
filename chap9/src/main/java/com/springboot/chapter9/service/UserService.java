package com.springboot.chapter9.service;

import com.springboot.chapter9.pojo.User;

import java.util.List;

/**
 * Created by Citrix on 2018-12-23.
 */
public interface UserService {
    User getUser(Long id);
    List<User> findUsers(String userName, String note);
}
