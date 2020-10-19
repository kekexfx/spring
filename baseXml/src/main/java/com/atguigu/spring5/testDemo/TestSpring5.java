package com.atguigu.spring5.testDemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Order;
import com.atguigu.spring5.User;
import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book",Book.class);
        book.buy();
    }

    @Test
    public void testOrder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("orders", Order.class);
        order.show();

    }

    @Test
    public void testUser(){
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testDept(){
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
}
