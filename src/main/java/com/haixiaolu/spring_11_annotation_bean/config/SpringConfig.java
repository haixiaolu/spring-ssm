package com.haixiaolu.spring_11_annotation_bean.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 代表了xml的自带命令
@ComponentScan("com.haixiaolu") // 不需要xml文件
public class SpringConfig {
}
