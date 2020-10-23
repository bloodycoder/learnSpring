package com.picard.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    //method 要执行目标对象的方法
    //objects 参数
    //对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("logbefore:"+target.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
