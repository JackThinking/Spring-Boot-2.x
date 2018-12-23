package com.springboot.chapter6.dao;

import com.springboot.chapter6.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Citrix on 2018-12-22.
 */
@Repository
public interface UserDao {
    User getUser(Long id);

    int insertUser(User user);
}
