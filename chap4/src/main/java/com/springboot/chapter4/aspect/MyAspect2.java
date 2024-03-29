package com.springboot.chapter4.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

/**
 * Created by Citrix on 2018-12-20.
 */
@Aspect
@Order(2)
public class MyAspect2 {
    @Pointcut("execution(* com.springboot.chapter4.aspect.service.impl.UserServiceImpl.manyAspects(..))")
    public void manyAspects() {
    }

    @Before("manyAspects()")
    public void before() {
        System.out.println("MyAspect2 before ......");
    }

    @After("manyAspects()")
    public void after() {
        System.out.println("MyAspect2 after ......");
    }

    @After("manyAspects()")
    public void afterReturning() {
        System.out.println("MyAspect2 afterReturning ......");
    }
}
