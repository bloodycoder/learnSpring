package com.picard.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态生成
public class ProxyInvocationHandler implements InvocationHandler {
    private  Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    //处理代理实例并返回结果。
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理本质就是使用反射实现
        seeHouse();
        Object result = method.invoke(rent,args);
        return result;
    }
    public void seeHouse(){
        System.out.println("看房子");
    }
}
