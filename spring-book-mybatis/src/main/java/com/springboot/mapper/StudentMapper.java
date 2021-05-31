package com.springboot.mapper;


import com.springboot.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentMapper {
    @Insert("insert into student(son,sname,ssex) values(#{son},#{name},#{sex})")
        int add(Student student);

    @Update("update student set sname=#{name},ssex=#{sex} where sno=#{sno}")
    int update(Student student);

    @Delete("delete from student where sno=#{sno}")
    int deleteBySno(String son);

    @Select("select * from student where sno=#{sno}")
    @Results(id = "student",value={
            @Result(property = "son", column = "son", javaType = String.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "sex", column = "sex", javaType = String.class)
    })
    Student queryStudentBySno(String son);

}

