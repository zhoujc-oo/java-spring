package com.zhoujc.mybatis.service;

import com.zhoujc.mybatis.bean.Person;

import java.util.List;

public interface PersonService {
    //增加一个Person
    int insertPerson(Person person);
    //删除一个Person
    int deleteByPersonId(Integer id);
    //更改一个Person
    int updateByPersonId(Person record);
    //查询一个Person
    Person selectByPersonId(Integer id);
    //查询所有的Person
    List<Person> selectAllPerson();
}
