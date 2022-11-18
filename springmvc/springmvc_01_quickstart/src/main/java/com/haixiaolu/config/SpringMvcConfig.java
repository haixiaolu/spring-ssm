package com.haixiaolu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// 3. 创建springmvc的配置文件， 加载Controller对应的bean
@Configuration
@ComponentScan("com.haixiaolu.controller")
public class SpringMvcConfig {
}


