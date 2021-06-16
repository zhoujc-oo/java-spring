package com.zhoujc.mybatis.mapper;

import com.zhoujc.mybatis.bean.Person;
import lombok.experimental.Delegate;
import org.apache.ibatis.annotations.*;


import java.util.List;
@Mapper
public interface PersonMapper {
    //增加一个Person
    @Insert("insert into person(id,name,son,age,phone,address)" +
            "values(#{id},#{name},#{son},#{age},#{phone},#{address}")
    int insert(Person person);
    //删除一个Person,根据ID删除数据
    @Delete("delete from person where id = #{id}")
    int deleteByPrimaryKey(Integer id);
    //更改一个Person,根据ID修改数据
    @Update("update person set name =#{name},age=#{age} where id=#{id}")
    int updateByPrimaryKey(Person id);
    //查询一个Person,根据ID查询表数据
    @Select("select id,name,age from person where id =#{id}")
    Person selectByPrimaryKey(Integer id);
    //查询所有Person
    @Select("select id,name,age from person")
    List<Person> selectAllPerson();
}
