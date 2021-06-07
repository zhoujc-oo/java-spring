package com.springboot.service;

import java.util.List;
import java.util.Map;

public interface StudentService {
    public List<Map<String, Object>> getAllStudentsFromOracle();
    public List<Map<String, Object>> getAllStudentsFromMysql();
}
