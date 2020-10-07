package com.atguigu.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect //生成一个代理对象
@Order(4)
public class UserProxy {


    //抽取公共切入点
    @Pointcut(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void pointdemo(){

    }
    //before表示前置通知
    @Before("pointdemo()")
    public void before(){
        System.out.println("before...");
    }

    @After(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void after(){
        System.out.println("after...");
    }

    @AfterReturning(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    @AfterThrowing(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }

    @Around(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("before around...");
        proceedingJoinPoint.proceed();
        System.out.println("after around...");
    }
}
