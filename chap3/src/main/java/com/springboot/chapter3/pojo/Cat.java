package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by Citrix on 2018/12/6.
 */
@Component
@Primary
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫【" + Cat.class.getSimpleName() + "】是抓老鼠。");
    }
}
