package com.haixiaolu.spring_13_annotation_di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.haixiaolu")
@PropertySource("jdbc1.properties")
public class SpringConfig {
}
