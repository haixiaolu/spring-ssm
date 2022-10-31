package com.haixiaolu.spring_03_bean_instance.factory;

import com.haixiaolu.spring_03_bean_instance.dao.OrderDao;
import com.haixiaolu.spring_03_bean_instance.dao.impl.OrderDaoImpl;


// 静态工厂创建
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("factory setup ...");
        return new OrderDaoImpl();
    }
}
