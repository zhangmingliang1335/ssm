package com.bright.service;

import com.bright.model.User;

import java.util.List;

public interface IUserService {
    public List<User> selectUser(String name);
}
