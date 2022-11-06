package com.haixiaolu.sping_14_annotation_third_bean_manager.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.haixiaolu.sping_14_annotation_third_bean_manager.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

// 第一种方式
//@Configuration
public class JdbcConfig {

    // 简单类型的注入
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306//university")
    private String url;
    @Value("root")
    private String userName;
    @Value("password")
    private String password;

    // 1. 定义一个方法获得要管理的对象
    // 2. 添加@Bean， 表示当前方法的返回值是一个bean
    @Bean
    // 引用类型注入
    public DataSource dataSource(BookDao bookDao14){
        System.out.println(bookDao14);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
