package com.haixiaolu.spring_13_annotation_di.dao.impl;

import com.haixiaolu.spring_13_annotation_di.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl1 implements BookDao {

    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book dao saving ...");
    }
}
