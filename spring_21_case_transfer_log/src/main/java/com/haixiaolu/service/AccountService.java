package com.haixiaolu.service;

import java.io.IOException;

public interface AccountService {

    // 配置当前接口方法具有事务
    public void transfer(String out, String in, Double money) throws IOException;
}
