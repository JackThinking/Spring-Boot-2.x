package com.springboot.chapter5;

import com.springboot.chapter5.dao.MyBatisUserDao;
import com.springboot.chapter5.enumeration.SexEnum;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.springboot.chapter5"})
//@EnableJpaRepositories(basePackages = "com.springboot.chapter5.dao")
//@EntityScan(basePackages = "com.springboot.chapter5.pojo")
public class Chapter5Application {

    @Autowired
    private SqlSessionFactory sqlSessionFactory = null;

	// 定义一个MyBatis的Mapper接口
	@Bean
	public MapperFactoryBean<MyBatisUserDao> initMyBatisUserDao() {
	     MapperFactoryBean<MyBatisUserDao> bean = new MapperFactoryBean<>();
	     bean.setMapperInterface(MyBatisUserDao.class);
	     bean.setSqlSessionFactory(sqlSessionFactory);
	     TypeHandler<SexEnum> sexTypeHandler = sqlSessionFactory.getConfiguration().getTypeHandlerRegistry().getTypeHandler(SexEnum.class);
	     return bean;
	}

    public static void main(String[] args) {
        SpringApplication.run(Chapter5Application.class, args);
    }

}

