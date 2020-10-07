package com.atguigu.spring5.aopanno.test;

import com.atguigu.spring5.aopanno.User;
import com.atguigu.spring5.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    User user = context.getBean("user", User.class);
    ApplicationContext context1 = new ClassPathXmlApplicationContext("bean2.xml");
    Book book = context1.getBean("book",Book.class);

    @Test
    public void testAopAnno(){
        user.add();
    }

    // 用配置文件的方式实现aop
    @Test
    public void testAopXml(){
        book.buy();
    }

}
