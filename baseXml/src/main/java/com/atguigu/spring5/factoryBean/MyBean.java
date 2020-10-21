package com.atguigu.spring5.factoryBean;

import com.atguigu.spring5.collectiontype.Cources;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Cources> {
    @Override
    public Cources getObject() throws Exception {
        Cources cources = new Cources();
        cources.setCname("adc");
        return cources;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
