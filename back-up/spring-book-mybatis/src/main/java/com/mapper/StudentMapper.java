package com.mapper;


import com.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentMapper {
    // CURD, create, Update, Read, Delete  bean
    @Insert("insert into student(s_no, s_name, s_sex) values(#{son},#{name},#{sex})")
    int add(Student student);

    @Update("update student set s_name=#{name},s_sex=#{sex} where s_no=#{sno}")
    int update(Student student);

    @Delete("delete from student where s_no=#{sno}")
    int deleteBySno(String son);

    @Select("select * from student where s_no=#{sno}")
    @Results(id = "student",value={
            @Result(property = "son", column = "s_on", javaType = String.class),
            @Result(property = "name", column = "s_name", javaType = String.class),
            @Result(property = "sex", column = "s_sex", javaType = String.class)
    })
    Student queryStudentBySno(String son);

}

