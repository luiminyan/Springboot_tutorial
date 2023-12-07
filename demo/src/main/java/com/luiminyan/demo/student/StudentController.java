package com.luiminyan.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// make this class a Restful controller
@RestController
//instead of localhost:8080
@RequestMapping(path = "api/v1/student")
public class StudentController {
//    create student service atttribute
    private final StudentService studentService;

// @Autowired: automatic dependency injection
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent(){
//        controller call service
        return studentService.getStudent();

    }
}
