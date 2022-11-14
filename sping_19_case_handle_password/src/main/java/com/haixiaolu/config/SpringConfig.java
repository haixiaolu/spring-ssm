package com.haixiaolu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.haixiaolu")
@EnableAspectJAutoProxy // 开启AOP注解功能
public class SpringConfig {
}
