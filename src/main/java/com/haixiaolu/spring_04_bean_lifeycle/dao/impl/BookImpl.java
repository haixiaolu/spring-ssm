package com.haixiaolu.spring_04_bean_lifeycle.dao.impl;

import com.haixiaolu.spring_03_bean_instance.dao.BookDao;

public class BookImpl implements BookDao {


    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
    // 表示bean初始化对应的操作
    public void init(){
        System.out.println("init ...");
    }

    // 表示bean销毁前对应的操作
    public void destory(){
        System.out.println("destory...");
    }
}
