package com.atguigu.spring5.aopanno;


import org.springframework.stereotype.Component;

//对这个类中的方法做增强
@Component
public class User {
    public void add(){
        int a = 8/0;
        System.out.println("add...");
    }
}
