package com.haixiaolu.sping_14_annotation_third_bean_manager.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

@Configuration
// 第一种方式
@ComponentScan("com.haixiaolu")

//第二种方式, 调取jdbc。class
@Import(JdbcConfig.class)
public class SpringConfig {


}
