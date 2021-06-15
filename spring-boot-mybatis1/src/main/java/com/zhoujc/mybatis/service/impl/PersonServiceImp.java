package com.zhoujc.mybatis.service.impl;

import com.zhoujc.mybatis.bean.Person;
import com.zhoujc.mybatis.mapper.PersonMapper;
import com.zhoujc.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class PersonServiceImp implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public int insertPerson(Person person){
        return personMapper.insert(person);
    }
    @Override
    public int deleteByPersonId(Integer id){
        return personMapper.deleteByPrimaryKey(id);
    }
    @Override
    public int updateByPersonId(Person record){
        return personMapper.updateByPrimaryKey(record);
    }
    @Override
    public Person selectByPersonId(Integer id){
        return personMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<Person> selectAllPerson(){
        return personMapper.selectAllPerson();
    }
}
