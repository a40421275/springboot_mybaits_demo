package com.example.springboot_mybaits_demo.controller;

import com.example.springboot_mybaits_demo.entitys.User;
import com.example.springboot_mybaits_demo.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/save")
    public String save(String name,Integer age){
        int i = userMapper.save(name,age);
        return "save"+i;
    }
}
