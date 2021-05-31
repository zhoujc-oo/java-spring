package com.springboot.service.impl;

import com.springboot.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBySno(String sno);
    Student queryStudentBySno(String sno);
}
