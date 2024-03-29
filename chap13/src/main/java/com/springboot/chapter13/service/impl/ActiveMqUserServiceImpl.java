package com.springboot.chapter13.service.impl;

import com.springboot.chapter13.pojo.User;
import com.springboot.chapter13.service.ActiveMqUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Citrix on 2018-12-25.
 */
@Service
public class ActiveMqUserServiceImpl implements ActiveMqUserService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate = null;

    // 自定义地址
    private static final String myDestination = "my-destination";

    @Override
    public void sendUser(User user) {
        System.out.println("发送消息【" + user + "】");
        // 使用自定义地址发送对象
        jmsMessagingTemplate.convertAndSend(myDestination, user);
    }

    @Override
    // 监控自定义地址
    @JmsListener(destination = myDestination)
    public void receiveUser(User user) {
        System.out.println("接收到消息：【" + user + "】");
    }
}
