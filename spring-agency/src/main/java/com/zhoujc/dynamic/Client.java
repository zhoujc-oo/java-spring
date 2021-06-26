package com.zhoujc.dynamic;

public class Client {
    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();
        //代理
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置代理的对象，即userService
        pih.setTarget(userService);
        //动态的生成代理对象
        UserService proxy = (UserService) pih.getProxy();
        proxy.query();
    }
}
