package com.haixiaolu.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.haixiaolu")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
// 开启注解式事务驱动
@EnableTransactionManagement
public class SpringConfig {
}
