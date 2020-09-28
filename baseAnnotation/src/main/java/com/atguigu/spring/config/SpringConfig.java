package com.atguigu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //把当前类作为配置类
@ComponentScan(basePackages = {"com.atguigu"})
public class SpringConfig {
}
