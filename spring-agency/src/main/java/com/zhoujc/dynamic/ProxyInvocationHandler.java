package com.zhoujc.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口 //可替换
    private Object target;
    public void setTarget(Object target) {
        this.target = target;
    }
    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的一般性质就是使用反射机制
        Object result = method.invoke(target, args);
        //反射得到方法名
        log(method.getName());
        return null;
    }
    public void  log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
