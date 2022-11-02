package com.haixiaolu.spring_09_example.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class AppSystemProperties {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("example.xml");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        DataSource dataSource2 = (DataSource) ctx.getBean("dataSource2");
        System.out.println(dataSource);
        System.out.println(dataSource2);
    }
}
