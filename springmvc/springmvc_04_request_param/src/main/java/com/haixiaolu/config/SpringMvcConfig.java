package com.haixiaolu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.haixiaolu.controller")
@EnableWebMvc // 开启json数据类型自动转换
public class SpringMvcConfig {
}
