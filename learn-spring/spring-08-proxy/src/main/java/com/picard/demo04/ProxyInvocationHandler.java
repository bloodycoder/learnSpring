package com.picard.demo04;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理万能模板
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    //处理代理实例并返回结果。
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理本质就是使用反射
        log(method.getName());
        Object result = method.invoke(target,args);
        return result;
    }
    public void log(String s){
        //just for test
        System.out.println(s);
    }
}
