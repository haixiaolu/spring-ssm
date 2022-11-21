package com.haixiaolu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//@Configuration
// 方式一， bean加载
//@ComponentScan({"com.haixiaolu.service", "com.haixiaolu.dao"})

// 方式二： excludeFilters
@ComponentScan(value = "com.haixiaolu", excludeFilters = @ComponentScan.Filter(
        type = FilterType.ANNOTATION,
        classes = Controller.class
))
public class SpringConfig {
}
