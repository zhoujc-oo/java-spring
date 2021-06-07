package com.springboot.mysqldao;

import java.util.List;
import java.util.Map;

@Mapper
public interface MysqlStudentMapper {
    List<Map<String, Object>> getAllStudents();
}