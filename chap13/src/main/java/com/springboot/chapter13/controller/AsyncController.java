package com.springboot.chapter13.controller;

import com.springboot.chapter13.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Citrix on 2018-12-25.
 */
@Controller
@RequestMapping("/async")
public class AsyncController {
    // 注入异步服务接口
    @Autowired
    private AsyncService asyncService = null;

    @GetMapping("/page")
    public String asyncPage() {
        System.out.println("请求线程名称：" + "【" + Thread.currentThread().getName() + "】");
        // 调用异步服务
        asyncService.generateReport();
        return "async";
    }
}
