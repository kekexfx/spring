package com.atguigu.spring5.aopanno.test;

import com.atguigu.spring5.aopanno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    User user = context.getBean("user", User.class);

    @Test
    public void testAopAnno(){
        user.add();
    }

}
