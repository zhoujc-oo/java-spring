package com.zhoujc.service.Impl;

import com.zhoujc.service.SomeService;

public class SomeServiceImpl implements SomeService {

    public SomeServiceImpl(){
        System.out.println("someService的无参数构造方法");
    }
    @Override
    public void doSome() {
        System.out.println("执行了SomeServiceImpl的doSome的方法");

    }
}
