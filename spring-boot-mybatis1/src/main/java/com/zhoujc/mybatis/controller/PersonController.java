package com.zhoujc.mybatis.controller;

import com.zhoujc.mybatis.bean.Person;
import com.zhoujc.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

public class PersonController {
    @Autowired
    private PersonService personService;
    @RequestMapping(value = "/add")
    public String students(){
        Person person = new Person();
        person.setID(001);
        person.setName("王炜");
        person.setAge(18);
        int result = personService.insertPerson(person);
        System.out.println("插入的结果是：" + result);
        return result + "";
    }
    @RequestMapping(value = "/findAll")
    public String findAll () {
        List<Person> people = personService.selectAllPerson();
        people.stream().forEach(System.out::println);
        return people.toString() + "";
    }
}
