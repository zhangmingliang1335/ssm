package com.bright.dao;

import com.bright.model.User;

public interface IUserDao {
    User selectUser(long id);
}
