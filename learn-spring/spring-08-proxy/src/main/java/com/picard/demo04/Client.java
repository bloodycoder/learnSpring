package com.picard.demo04;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(userService);
        //动态生成代理类。
        UserService realProxy = (UserService) pih.getProxy();
        realProxy.add();
        realProxy.delete();
    }
}
