package com.haixiaolu.controller;

import com.haixiaolu.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save --> " + book);
        return "{'module' : 'book save success..'}";
    }

    @GetMapping
    public List<Book> getAll(){
        Book book1 = new Book();
        book1.setType("计算机");
        book1.setName("SpringMvc入门教程");
        book1.setDescription("小试牛刀");


        Book book2 = new Book();
        book2.setType("计算机");
        book2.setName("SpringMvc实战教程");
        book2.setDescription("一代宗师");

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);

        return bookList;
    }

}
