package com.atguigu.spring5.collectiontype;

import com.alibaba.druid.support.json.JSONUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //数组
    private String[] cources;

    private List<String> list;

    private Map<String, String> maps;

    private Set<String> sets;

    private List<Cources> kechengs;

    public void setKechengs(List<Cources> kechengs) {
        this.kechengs = kechengs;
    }

    public void setCources(String[] cources) {
        this.cources = cources;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void show(){
        System.out.println(maps);
    }

    public void showKecheng() {
        System.out.println(kechengs.get(0).getCname());
    }
}
