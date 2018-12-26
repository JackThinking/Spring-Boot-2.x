package com.springboot.chapter13.service;

import com.springboot.chapter13.pojo.User;

/**
 * Created by Citrix on 2018-12-26.
 */
public interface RabbitMqService {

    public void sendMsg(String msg);

    public void sendUser(User user);
}
