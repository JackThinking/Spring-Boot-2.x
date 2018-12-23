package com.springboot.chapter5.service;

import com.springboot.chapter5.pojo.User;

import java.util.List;

/**
 * Created by Citrix on 2018-12-21.
 */
public interface JdbcTmplUserService {
    public User getUser(Long id);

    public List<User> findUsers(String userName, String note);

    public int insertUser(User user);

    public int updateUser(User user);

    public int deleteUser(Long id);

    public User getUser2(Long id);

    public User getUser3(Long id);
}
