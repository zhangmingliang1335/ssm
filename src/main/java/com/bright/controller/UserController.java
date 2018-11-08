package com.bright.controller;

import com.bright.model.User;
import com.bright.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<User> listUser(){
        String name = "bright";
        return userService.selectUser(name);
    }
}
