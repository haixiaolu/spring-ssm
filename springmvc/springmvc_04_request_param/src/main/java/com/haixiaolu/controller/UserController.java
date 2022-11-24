package com.haixiaolu.controller;

import com.haixiaolu.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller

public class UserController {
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name, int age){
        System.out.println("普通参数传递 name ==> " +name);
        System.out.println("普通参数传递 age ==> " +age);

        return "{'module: 'commonParam'}";
    }

    // 集合参数： json格式
    @RequestMapping("/listparamForJson")
    @ResponseBody
    public String listparamForJson(@RequestBody List<String> likes){
        System.out.println("list comm(json)参数传递 list ==> " +likes);
        return "{'module' : 'list common for json param'}";
    }

    //POJO参数: json格式
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo(json)参数传递 user ==> " + user);
        return "{'module' : 'pojo for json param'}";
    }

    // 集合参数： json格式
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list){
        System.out.println("list pojo(json)参数传递 list ==> " +list);
        return "{'module' : 'list pojo for json param'}";
    }

    // 日期参数
    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date,
                            @DateTimeFormat(pattern="yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss") Date date2){
        System.out.println("参数传递 date ==> " +date);
        System.out.println("参数传递 date1(yyyy-MM-dd) ==> " +date1);
        System.out.println("参数传递 date1(yyyy/MM/dd HH:mm:ss) ==> " +date2);
        return "{'module' : 'date param' }";
    }
}
