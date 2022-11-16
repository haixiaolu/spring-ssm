package com.haixiaolu.service.impl;

import com.haixiaolu.dao.LogDao;
import com.haixiaolu.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    // propagation设置事务属性， 传播行为设置为当前操作需要新事务
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void log(String out, String in, Double money) {
        logDao.log("转账操作由" +out+"到"+in+",金额： "+money);

    }
}
