package com.haixiaolu.service.impl;

import com.haixiaolu.controller.Code;
import com.haixiaolu.dao.BookDao;
import com.haixiaolu.domain.Book;
import com.haixiaolu.exception.BusinessException;
import com.haixiaolu.exception.SystemException;
import com.haixiaolu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public Book getById(Integer id) {
        // 业务层异常， 包装成自定义异常
        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERROR, "请不要挑战我的耐心");
        }

        // 模拟系统异常， 将可能出现异常进行包装， 转换成自定义异常

        try {
            int i = 1/0;
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERROR, "服务器访问超时， 请重试！", e);
        }
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
