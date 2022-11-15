package com.haixiaolu.service;

public interface AccountService {
    /**
     *
     * @param out 传出方
     * @param in  传入方
     * @param money 金额
     */
    public void transfer(String out, String in, Double money);
}
