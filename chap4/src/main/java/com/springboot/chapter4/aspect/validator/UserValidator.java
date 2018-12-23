package com.springboot.chapter4.aspect.validator;

import com.springboot.chapter4.pojo.User;

/**
 * Created by Citrix on 2018-12-20.
 */
public interface UserValidator {
    public boolean validate(User user);
}
