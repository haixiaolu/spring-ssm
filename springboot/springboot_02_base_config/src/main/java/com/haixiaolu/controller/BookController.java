package com.haixiaolu.controller;

import com.haixiaolu.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    // 第一种方式
    @Value("${lesson}")
    private String lesson;

    @Value("${server.port}")
    private Integer port;

    @Value("${enterprise.subject[0]}")
    private String subject_0;

    // 第二种方式
    @Autowired
    private Environment environment;

    // 第三种方式
    @Autowired
    private Enterprise enterprise;
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println(port);
        System.out.println(lesson);
        System.out.println(subject_0);
        System.out.println("----------------");
        System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("enterprise.age"));
        System.out.println("----------------");
        System.out.println(enterprise);
        return "hello, spring boot";
    }
}
