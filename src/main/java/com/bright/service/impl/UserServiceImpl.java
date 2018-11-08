package com.bright.service.impl;

import com.bright.dao.IUserDao;
import com.bright.model.User;
import com.bright.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDao iUserDao;
    @Override
    public List<User> selectUser(String name) {
        return iUserDao.selectUser(name);
    }
}
