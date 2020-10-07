package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
}
