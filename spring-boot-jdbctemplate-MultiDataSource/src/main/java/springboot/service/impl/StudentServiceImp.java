package springboot.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.dao.MysqlStudentDao;
import springboot.dao.OracleStudentDao;
import springboot.service.StudentService;

@Service("studentService")
public class StudentServiceImp implements StudentService{
    @Autowired
    private OracleStudentDao oracleStudentDao;
    @Autowired
    private MysqlStudentDao mysqlStudentDao;

    @Override
    public List<Map<String, Object>> getAllStudentsFromOralce() {
        return this.oracleStudentDao.getAllStudents();
    }

    @Override
    public List<Map<String, Object>> getAllStudentsFromMysql() {
        return this.mysqlStudentDao.getAllStudents();
    }

}
