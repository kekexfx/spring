package com.atguigu.spring5.dao;

public class UserDao implements UserDaoInterface {

    @Override
    public void update() {
        System.out.println("update....");
    }
}
