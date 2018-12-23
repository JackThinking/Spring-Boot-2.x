package com.springboot.chapter4.aspect.service;

import com.springboot.chapter4.pojo.User;

/**
 * Created by Citrix on 2018-12-20.
 */
public interface UserService {
    public void printUser();

    public void printUser(User user);

    public void manyAspects();
}
