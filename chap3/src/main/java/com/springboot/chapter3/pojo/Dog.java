package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;
import org.springframework.stereotype.Component;

/**
 * Created by Citrix on 2018/12/6.
 */
@Component
public class Dog implements Animal {
    @Override
    public void use() {
        System.out.println("狗【" + Dog.class.getSimpleName()+"】是看门用的。");
    }
}
