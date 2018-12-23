package com.springboot.chapter4.aspect.validator.impl;

import com.springboot.chapter4.aspect.validator.UserValidator;
import com.springboot.chapter4.pojo.User;

/**
 * Created by Citrix on 2018-12-20.
 */
public class UserValidatorImpl implements UserValidator {
    @Override
    public boolean validate(User user) {
        System.out.println("引入新的接口："+ UserValidator.class.getSimpleName());
        return user != null;
    }
}
