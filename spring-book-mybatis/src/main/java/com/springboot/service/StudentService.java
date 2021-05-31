package com.springboot.service;


import com.springboot.entity.Student;

public interface StudentService {
    /**
     *
     * @param student
     * @return
     */
    int add(Student student);
    int update(Student student);
    int deleteBySno(String sno);
    Student queryStudentBySno(String sno);
}
