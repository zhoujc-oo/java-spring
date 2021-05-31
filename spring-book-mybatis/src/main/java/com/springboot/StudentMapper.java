package com.springboot;


import com.springboot.Student;
import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Component
@Mapper
public interface StudentMapper {
    @Insert("insert into student(son,sname,ssex) values(#{son},#{name},#{sex})")
        int add(Student student);

    @Update("update student set sname=#{name},ssex=#{sex} where sno=#{sno}")
    int update(Student student);

    @Delete("delete from student where sno=#{sno}")
    int deleteByson(String son);

    @Select("select * from student where sno=#{sno}")


    @Results(id = "student",value={
            @Result(property = "son", column = "son", javaType = String.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "sex", column = "sex", javaType = String.class)
    })
    Student queryStudentBySon(String son);


    int deleteBySno(String sno);

    Student queryStudentBySno(String sno);
}

