package service;

import java.util.List;
import java.util.Map;

import bean.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    List<Map<String, Object>> queryStudentListMap();
    Student queryStudentBySno(String sno);

    Student querystudentBtSon(String son);

    List<Map<String, Object>> querystudentListMap();

    int deletestudent(String son);
}