package com.haixiaolu.spring_03_bean_instance.dao.impl;

import com.haixiaolu.spring_03_bean_instance.dao.OrderDao;

public class OrderDaoImpl  implements OrderDao {

    @Override
    public void save() {
        System.out.println("order dao save ...");
    }
}
