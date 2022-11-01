package com.haixiaolu.spring_05_di_setter.dao.impl;

import com.haixiaolu.spring_03_bean_instance.dao.BookDao;

public class BookImpl implements BookDao {

    private int connectionNum;
    private String database;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    @Override
    public void save() {
        System.out.println("book dao save ..." + database + ", "  + connectionNum);
    }
}
