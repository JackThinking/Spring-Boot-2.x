package com.springboot.chapter13.service;

import com.springboot.chapter13.pojo.User;

/**
 * Created by Citrix on 2018-12-25.
 */
public interface ActiveMqUserService {
    public void sendUser(User user);

    public void receiveUser(User user);
}
