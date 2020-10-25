package com.atguigu.spring5.aotuwire;

public class XueSheng {

    private BanJi banJi;

    public void setBanJi(BanJi banJi){
        this.banJi = banJi;
    }

    @Override
    public String toString() {
        return "XueSheng{" +
                "banJi=" + banJi +
                '}';
    }

    public void test(){
        System.out.println(banJi);
    }
}
