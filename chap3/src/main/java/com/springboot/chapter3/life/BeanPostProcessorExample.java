package com.springboot.chapter3.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by Citrix on 2018/12/6.
 */
//@Component
public class BeanPostProcessorExample implements BeanPostProcessor {
    /*
    * 注意这个bean后置处理器对所有bean都起效果
    * */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor调用postProcessBeforeInitialization方法，参数【"
                + bean.getClass().getSimpleName()+ "】【" +beanName+"】 ");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor调用postProcessAfterInitialization方法，参数【"
                + bean.getClass().getSimpleName()+ "】【" +beanName+"】 ");
        return bean;
    }
}
