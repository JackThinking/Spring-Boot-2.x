package com.springboot.chapter3.config;

import com.springboot.chapter3.condition.DatabaseConditional;
import com.springboot.chapter3.pojo.User;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by Citrix on 2018/12/5.
 */
@Configuration
//@ComponentScan(value = "com.springboot.chapter3.*")//有了这个就自动找到注解为Component的类，不需要手动配置了
//@ComponentScan(basePackageClasses = {User.class})//还是这个好/
//@ComponentScan(basePackages = "com.springboot.chapter3", excludeFilters = {@ComponentScan.Filter(classes = {Service.class})})
@ComponentScan(basePackages = "com.springboot.chapter3")
//这个注解派排除了带有service注解的bean
public class AppConfig {
    //原始的方法才要Bean注入
    /* @Bean(name = "user")
    public User initUser() {
        User user = new User();
        user.setId(1L);
        user.setNote("note_1");
        user.setUserName("user_name_1");
        return user;
    }*/
    @Bean(name = "dataSource")
    @Profile("dev")
    public DataSource getDevDataSource() {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/dev_spring_boot");
        props.setProperty("username", "root");
        props.setProperty("password", "123456");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }


    @Bean(name = "dataSource")
    @Profile("test")
    public DataSource getTestDataSource() {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/test_spring_boot");
        props.setProperty("username", "root");
        props.setProperty("password", "123456");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

}
