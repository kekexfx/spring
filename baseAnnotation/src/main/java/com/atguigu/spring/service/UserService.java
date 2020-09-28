package com.atguigu.spring.service;


import com.atguigu.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserService {

//    @Autowired
//    @Qualifier("userdddao")
//    private UserDao userDao;

    @Value(value = "xufx-a")
    private String name;

    @Resource(name = "userdddao")
    private UserDao userDao;


    public void add(){
        userDao.add();
        System.out.println(name);
        System.out.println("service add...");
    }
}
