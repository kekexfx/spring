package com.atguigu.spring.dao;

import org.springframework.stereotype.Repository;

@Repository("userdddao")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add...");
    }
}
