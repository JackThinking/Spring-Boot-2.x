package com.springboot.chapter6.service;

import com.springboot.chapter6.pojo.User;

import java.util.List;

/**
 * Created by Citrix on 2018-12-23.
 */
public interface UserBatchService {
    public int insertUsers(List<User> userList);
}
