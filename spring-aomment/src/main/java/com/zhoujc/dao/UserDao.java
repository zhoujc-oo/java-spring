package com.zhoujc.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//这里这个注解的意思，是说这个类被Spring接管了，也就是注册到了容器中
@Component
public class UserDao {
    @Value("单子健")       //属性注入值
    private  String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
