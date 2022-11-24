package com.haixiaolu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.haixiaolu.controller")
// 开启json类型数据自动转换
@EnableWebMvc
public class SpringMvcConfig {

}
