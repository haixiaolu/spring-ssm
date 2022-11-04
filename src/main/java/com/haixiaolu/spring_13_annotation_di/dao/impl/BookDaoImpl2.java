package com.haixiaolu.spring_13_annotation_di.dao.impl;

import com.haixiaolu.spring_13_annotation_di.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao saving ...2");
    }
}
