package com.springboot.chapter4.aspect;

import com.springboot.chapter4.aspect.validator.UserValidator;
import com.springboot.chapter4.aspect.validator.impl.UserValidatorImpl;
import com.springboot.chapter4.pojo.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Citrix on 2018-12-19.
 */
@Aspect//声明是个切面
public class MyAspect {
    @DeclareParents(value = "com.springboot.chapter4.aspect.service.impl.UserServiceImpl+", defaultImpl = UserValidatorImpl.class)
    public UserValidator userValidator;

    /*
     * 切点注解以及切点方法
     * */
    @Pointcut("execution(* com.springboot.chapter4.aspect.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut() {
    }

    /*
     * 这类before，after都已经有注解做好了
     * */
    @Before("pointCut() && args(user)")
    public void beforeParam(User user) {
        System.out.println("before ......");
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before ......");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after ......");
    }


    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning ......");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing ......");
    }


    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("around before......");
        jp.proceed();
        System.out.println("around after......");
    }
}
