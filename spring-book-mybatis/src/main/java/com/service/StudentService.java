package com.service;


import com.entity.Student;

public interface StudentService {
    /**
     *
     * @param student
     * @return
     */
    int add(Student student) throws ClassNotFoundException;
    int update(Student student);
    int deleteBySno(String sno);
    Student queryStudentBySno(String sno);
}
