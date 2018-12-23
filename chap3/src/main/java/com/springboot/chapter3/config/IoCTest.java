package com.springboot.chapter3.config;


import com.springboot.chapter3.pojo.BussinessPerson;
import com.springboot.chapter3.pojo.DataBaseProperties;
import com.springboot.chapter3.pojo.User;
import com.springboot.chapter3.pojo.definition.Person;
import com.springboot.chapter3.scope.pojo.ScopeBean;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.Properties;


/**
 * Created by Citrix on 2018/12/5.
 */
public class IoCTest {
    private static Logger log = Logger.getLogger(IoCTest.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       /* User user = ctx.getBean(User.class);
        log.info(user.getId());*/
        /*Person person = ctx.getBean(BussinessPerson.class);
        person.service();*/

    }
}
