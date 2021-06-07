package com.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.oracledao.OracleStudentMapper;
import com.springboot.service.StudentService;

import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentServiceImp implements StudentService {

    @Autowired
    private OracleStudentMapper oracleStudentMapper;
    @Autowired
    private OracleStudentMapper mysqlStudentMapper;

    @Override
    public List<Map<String, Object>> getAllStudentsFromOracle(){
        return this.oracleStudentMapper.getAllStudents();
    }

    @Override
    public List<Map<String, Object>> getAllStudentsFromMysql(){
        return this.mysqlStudentMapper.getAllStudents();
    }
}
