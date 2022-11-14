package com.haixiaolu.dao.impl;

import com.haixiaolu.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    @Override
    public boolean readResources(String url, String password) {
        // 模拟校验
        return password.equals("root");
    }
}
