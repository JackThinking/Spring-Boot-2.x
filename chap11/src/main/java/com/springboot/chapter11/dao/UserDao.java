package com.springboot.chapter11.dao;

import com.springboot.chapter11.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Citrix on 2018-12-24.
 */
@Mapper
public interface UserDao {
    public User getUser(Long id);

    public int insertUser(User user);
    /*
    * @Param参数显得有点多余呀
    * */
    public List<User> findUsers(@Param("userName") String userName, @Param("note") String note, @Param("start") int start, @Param("limit") int limit);

    public int updateUser(User user);

    public int updateUserName(@Param("id") Long id, @Param("userName") String userName);

    public int deleteUser(Long id);
}
