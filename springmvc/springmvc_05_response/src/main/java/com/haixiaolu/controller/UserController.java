package com.haixiaolu.controller;

import com.haixiaolu.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    // 响应页面 / 跳转页面
    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "index.jsp";
    }

    // 响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response.text";
    }

    // 响应POJO对象
    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回Json对象数据");
         User user = new User();
         user.setName("itcast");
         user.setAge(15);
         return user;
    }

    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回Json集合数据");
        User user1 = new User();
        user1.setName("传智博客");
        user1.setAge(20);

        User user2 = new User();
        user2.setName("itheima");
        user2.setAge(10);

        User user3 = new User();
        user3.setName("Udemy");
        user3.setAge(5);

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        return userList;

    }
}
