package com.atguigu.spring5.collectiontype;

import java.util.List;

public class Book1 {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void show(){
        System.out.println(list.get(0));
    }
}
