package com.service.impl;

import com.entity.Student;
import com.mapper.StudentMapper;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@Service("studentService")
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {

        return this.studentMapper.add(student);
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        // Class 类的类 [类的类]的对象   [[StringBuffer] 的类] 的对象
        Class clazz = Class.forName("java.lang.StringBuffer");

        Class clazz2 = ClassLoader.getSystemClassLoader().loadClass("java.lang.StringBuffer");

        // 【[[StringBuffer] 的类] 的对象】的对象。 =  new StringBuffer();
        clazz.newInstance();
        Class clazz1 = Class.forName("java.lang.StringBuilder");
        System.out.println("clazz.getName " + clazz.getSimpleName());
        Method method = clazz.getMethod("charAt", Integer.class);
        method.invoke(clazz.newInstance(), 1);
        clazz.getName();
        Student skdj = new Student();
    }

    @Override
    public int update(Student student) {
        return this.studentMapper.update(student);
    }

    @Override
    public int deleteBySno(String sno) {
        return this.studentMapper.deleteBySno(sno);
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return this.studentMapper.queryStudentBySno(sno);
    }
}
