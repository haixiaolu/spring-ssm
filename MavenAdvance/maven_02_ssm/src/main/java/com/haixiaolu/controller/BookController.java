package com.haixiaolu.controller;

import com.haixiaolu.domain.Book;
import com.haixiaolu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping()
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_Ok : Code.SAVE_ERROR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result (flag ? Code.UPDATE_Ok : Code.UPDATE_ERROR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_Ok : Code.DELETE_ERROR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {


        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_Ok : Code.GET_ERROR;
        String msg = book != null ? "" : "数据查询失败，请重试";
        return new Result(code, book, msg);
    }

    @GetMapping
    public Result getAll() {

        List<Book> bookList = bookService.getAll();
        Integer code = bookList != null ? Code.GET_Ok : Code.GET_ERROR;
        String msg = bookList != null ? "" : "数据查询失败，请重试";
        return new Result(code, bookList, msg);
    }
}
