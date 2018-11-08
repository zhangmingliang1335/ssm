package com.bright.dao;

import com.bright.model.User;

import java.util.List;

public interface IUserDao {
    List<User> selectUser(String name);
}
