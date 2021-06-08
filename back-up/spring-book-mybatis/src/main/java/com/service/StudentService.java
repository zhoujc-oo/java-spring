package com.service;


import com.entity.Student;

/**
 * 业务逻辑处理的方法的具体实现。
 */
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
