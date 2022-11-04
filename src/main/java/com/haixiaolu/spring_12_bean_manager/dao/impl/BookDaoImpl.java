package com.haixiaolu.spring_12_bean_manager.dao.impl;

import com.haixiaolu.spring_12_bean_manager.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
@Scope // ("prototype") // 变成非单例的， 单例的（Singleton)， 默认是单例
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ....");
    }

    // 生命周期
    @PostConstruct // 生命周期构造方法后
    public void init(){
        System.out.println("book dao init ...");
    }

    @PreDestroy //
    public void destroy(){
        System.out.println("book dao destroy...");
    }
}
