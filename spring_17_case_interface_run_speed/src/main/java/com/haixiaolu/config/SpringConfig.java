package com.haixiaolu.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.haixiaolu")
@PropertySource("classpath: jdbc.properties")
@Import({JdbcConfig.class, MyBatisConfig.class})
@EnableAspectJAutoProxy // 开启AOP注解功能
public class SpringConfig {
}
