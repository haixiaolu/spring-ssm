package com.haixiaolu.spring_11_annotation_bean.dao.impl;

import com.haixiaolu.spring_11_annotation_bean.dao.BookDao;
import org.springframework.stereotype.Component;

@Component("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao saving...");
    }
}
