package com.springboot.chapter13.service;

/**
 * Created by Citrix on 2018-12-25.
 */
public interface ActiveMqService {
    // 发送消息
    public void sendMsg(String message);

    // 接收消息
    public void receiveMsg(String message);
}
