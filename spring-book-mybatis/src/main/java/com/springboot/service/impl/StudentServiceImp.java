package com.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Student;
import com.springboot.StudentMapper;

@Service("studentService")
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return this.studentMapper.add(student);
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
