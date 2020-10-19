package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoInterface;

public class UserService {

    private UserDaoInterface userDao;

    public void setUserDao(UserDaoInterface userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add ........");
        //原始方式
//        UserDaoInterface dao = new UserDao();
//        dao.update();
        userDao.update();
    }
}
