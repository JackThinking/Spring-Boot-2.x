package com.springboot.chapter5.dao;

import com.springboot.chapter5.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Citrix on 2018-12-22.
 */
@Repository
public interface MyBatisUserDao {
    public User getUser(Long id);
}
