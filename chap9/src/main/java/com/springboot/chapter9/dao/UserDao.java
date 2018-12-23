package com.springboot.chapter9.dao;

import com.springboot.chapter9.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Citrix on 2018-12-23.
 */
@Mapper//本身mybatis好像就是推荐mapper的，当然repository好像也是可以的
public interface UserDao {
    User getUser(Long id);
    /*
    * 加上@Param是为什么呢？
    * */
    List<User> findUsers(@Param("userName") String userName, @Param("note") String note);
}
