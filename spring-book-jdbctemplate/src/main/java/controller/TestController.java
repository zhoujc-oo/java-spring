package controller;


import bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

import javax.swing.text.Style;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/querystudent", method = RequestMethod.GET)
    public Student querystudentBtSon(String son){
        return this.studentService.querystudentBtSon(son);
    }

    @RequestMapping(value = "/querystudent")
    public List<Map<String, Object>>queryAllStudent(){
        return this.studentService.querystudentListMap();
    }

    @RequestMapping(value = "/addstudent",method = RequestMethod.GET)
    public int saveStudent(String son,String name,String sex){
        Student student = new Student();
        student.setSno(son);
        student.setName(name);
        student.setSex(sex);
        return this.studentService.add(student);
    }

    @RequestMapping(value = "deletestudent", method = RequestMethod.GET)
    public int deleteStudentBySon(String son){
        return this.studentService.deletestudent(son);
    }




}
