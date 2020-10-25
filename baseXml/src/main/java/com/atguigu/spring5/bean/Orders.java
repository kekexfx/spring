package com.atguigu.spring5.bean;

public class Orders {

    private String oname;

    public Orders() {
        System.out.println("wucan gouzao 第一步");
    }

    public void setOname(String oname){
        this.oname = oname;
        System.out.println("dierbu ,diaoyong set fangfa,shezhi zhi");
    }

    public void initMethod(){
        System.out.println("disanbu, zhixingchushihuafangfa");
    }

    public void destoryMethod(){
        System.out.println("最后一步，销毁方法");
    }


}
