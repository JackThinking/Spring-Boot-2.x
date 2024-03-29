package com.springboot.chapter4.main;

import com.springboot.chapter4.aspect.MyAspect;
import com.springboot.chapter4.aspect.MyAspect1;
import com.springboot.chapter4.aspect.MyAspect2;
import com.springboot.chapter4.aspect.MyAspect3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//要指定扫描进去吗？
@SpringBootApplication(scanBasePackages = {"com.springboot.chapter4.aspect"})
public class Chapter4Application {
    // TODO
    @Bean(name = "myAspect")
    public MyAspect initMyAspect() {
        return new MyAspect();
    }

    // 定义切面
    @Bean(name = "myAspect2")
    public MyAspect2 initMyAspect2() {
        return new MyAspect2();
    }

    // 定义切面
    @Bean(name = "myAspect1")
    public MyAspect1 initMyAspect1() {
        return new MyAspect1();
    }

    // 定义切面
    @Bean(name = "myAspect3")
    public MyAspect3 initMyAspect3() {
        return new MyAspect3();
    }

    public static void main(String[] args) {
        SpringApplication.run(Chapter4Application.class, args);
    }

}

