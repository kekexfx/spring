package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect //生成一个代理对象
public class UserProxy {

    //before表示前置通知
    @Before("execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void before(){
        System.out.println("before...");
    }
}
