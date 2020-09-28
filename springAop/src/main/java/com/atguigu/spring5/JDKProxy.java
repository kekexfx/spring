package com.atguigu.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        // 创建实现类的代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        String add = dao.update("String");
        System.out.println("result:" + add);
    }
}

class UserDaoProxy implements InvocationHandler{

    // 1 把创建的是谁的代理对象，就把谁传递进来
    // 有参数构造传递
    private Object obj;
    public  UserDaoProxy(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method ..." + method.getName() + "args：" + Arrays.toString(args));

        Object res = method.invoke(obj, args);

        System.out.println("after method:" + obj);
        return res;
    }
}
