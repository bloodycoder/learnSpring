package com.picard.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //标注是一个切面
public class AnnotationPointcut {
    @Before("execution(* com.picard.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("-----before--------");
    }
    @After("execution(* com.picard.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("-----after---------");
    }
}
