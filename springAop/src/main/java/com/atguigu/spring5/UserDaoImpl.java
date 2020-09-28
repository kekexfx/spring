package com.atguigu.spring5;

public class UserDaoImpl implements UserDao {
    public int add(int a, int b) {
        System.out.println("add...");
        return a + b;
    }

    public String update(String id) {
        System.out.println("update...");
        return id;
    }
}
