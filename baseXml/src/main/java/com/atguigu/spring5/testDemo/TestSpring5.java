package com.atguigu.spring5.testDemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Order;
import com.atguigu.spring5.User;
import com.atguigu.spring5.aotuwire.XueSheng;
import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.collectiontype.Book1;
import com.atguigu.spring5.collectiontype.Cources;
import com.atguigu.spring5.collectiontype.Stu;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//    @Test
//    public void testAdd(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        User user = context.getBean("user", User.class);
//        user.add();
//    }
//
//    @Test
//    public void testBook(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        Book book1 = context.getBean("book",Book.class);
//        Book book2 = context.getBean("book",Book.class);
//        System.out.println(book1);
//        System.out.println(book2);
//    }
//
//    @Test
//    public void testOrder(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        Order order = context.getBean("orders", Order.class);
//        order.show();
//
//    }
//
//    @Test
//    public void testUser(){
//        UserService userService = context.getBean("userService", UserService.class);
//        userService.add();
//    }
//
//    @Test
//    public void testDept(){
//        Emp emp = context.getBean("emp", Emp.class);
//        emp.add();
//    }
//
//    @Test
//    public void testStu(){
//        Stu stu = context.getBean("stu", Stu.class);
//        stu.show();
//        stu.showKecheng();
//    }
//
//    @Test
//    public void testBookk(){
//        Book1 book = context.getBean("book1", Book1.class);
//        book.show();
//    }
//
//    @Test
//    public void testFactoryBean(){
//        Cources mybean = context.getBean("mybean", Cources.class);
//        System.out.println(mybean.getCname());
//    }

    @Test
    public void testOrders(){
        Orders orders = context.getBean("orderss", Orders.class);
        System.out.println("disibu, huoquchuangjianbeanshiliduixiang");
        System.out.println(orders);
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void testXuesheng(){
        XueSheng xuesheng = context.getBean("xuesheng", XueSheng.class);
        xuesheng.test();
    }
}
