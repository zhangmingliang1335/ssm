package com.bright.service.impl;

import com.bright.dao.IUserDao;
import com.bright.model.User;
import com.bright.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDao iUserDao;
    @Override
    public User selectUser(long userId) {
        return iUserDao.selectUser(userId);
    }
}
