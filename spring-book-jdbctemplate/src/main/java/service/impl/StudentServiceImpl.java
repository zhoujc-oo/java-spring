package service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Student;
import dao.StudentDao;
import mapper.StudentMapper;
import service.StudentService;

@Service("studentService")
class StudentServiceImp implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int add(Student student) {
        return this.studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return this.studentDao.update(student);
    }

    @Override
    public int deleteBysno(String sno) {
        return this.studentDao.deleteBysno(sno);
    }

    @Override
    public List<Map<String, Object>> queryStudentListMap() {
        return this.studentDao.queryStudentsListMap();
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return this.studentDao.queryStudentBySno(sno);
    }

    @Override
    public Student querystudentBtSon(String son) {
        return null;
    }

    @Override
    public List<Map<String, Object>> querystudentListMap() {
        return null;
    }

    @Override
    public int deletestudent(String son) {
        return 0;
    }

}

