package com.haixiaolu.service.impl;

import com.haixiaolu.controller.Code;
import com.haixiaolu.dao.BookDao;
import com.haixiaolu.domain.Book;
import com.haixiaolu.exception.BusinessException;
import com.haixiaolu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }


    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }


    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }


    public Book getById(Integer id) {
        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERR, "请不要使用你的技术挑战我的耐心");
        }
        return bookDao.getById(id);
    }


    public List<Book> getAll() {
        return bookDao .getAll();
    }
}
