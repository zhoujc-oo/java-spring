package com.zhoujc;

import com.zhoujc.service.Impl.SomeServiceImpl;
import com.zhoujc.service.SomeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class MyTest {
    @Test

    public void test01(){
        //不使用spring的话需要创建对象:
        SomeService service = new SomeServiceImpl();
            service.doSome();
    }
    @Test
            public void test02() {
        //使用 spring 容器创建的对象
        //1.指定 spring 配置文件的名称
        String config = "beans.xml";
        //2.创建表示 spring 的容器对象，ApplicationContext
        //classPathXmlApplicationContext 表示从路径中加载 spring 的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("config");

        //从容器中获取某个对象，调用对象的方法
        //getBean（“配置文件中 bean 的id值”）
        SomeService service = (SomeService) ac.getBean("someService");

        //通过名字来使用对象
        //使用 spring 创建好的对象
        System.out.println();
        service.doSome();
    }

}
