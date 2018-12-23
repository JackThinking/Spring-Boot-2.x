package com.springboot.chapter4.jdbc;

import com.springboot.chapter4.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Citrix on 2018-12-19.
 */
public class UserDao {
    public int insertUser(Connection conn, User user) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("insert into t_user(user_name, note) values( ?, ?)");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getNote());
            return ps.executeUpdate();
        } finally {
            ps.close();
        }
    }
}
