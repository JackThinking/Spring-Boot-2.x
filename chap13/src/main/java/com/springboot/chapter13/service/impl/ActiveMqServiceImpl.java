package com.springboot.chapter13.service.impl;

import com.springboot.chapter13.service.ActiveMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Citrix on 2018-12-25.
 */
@Service
public class ActiveMqServiceImpl implements ActiveMqService {

    // 注入由Spring Boot自动生产的jmsTemplate
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate = null;

    @Value("${spring.jms.template.default-destination}")
    private String defaultDestination = null;

    @Override
    public void sendMsg(String message) {
        System.out.println("发送消息【" + message + "】");
        jmsMessagingTemplate.convertAndSend(message);
        // 自定义发送地址
        // jmsTemplate.convertAndSend("your-destination", message);
    }

    @Override
    // 使用注解，监听地址发送过来的消息
    @JmsListener(destination = "${spring.jms.template.default-destination}")
    public void receiveMsg(String message) {
        System.out.println("接收到消息：【" + message + "】");
    }

}