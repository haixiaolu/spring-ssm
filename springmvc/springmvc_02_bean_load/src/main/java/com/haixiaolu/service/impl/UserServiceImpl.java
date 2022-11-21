package com.haixiaolu.service.impl;

import com.haixiaolu.domain.User;
import com.haixiaolu.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public void save(User user) {
        System.out.println("user services ... ");
    }
}
