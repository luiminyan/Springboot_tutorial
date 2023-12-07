package com.luiminyan.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// @Component: to make StudentService class a java bean
// @Service: make it a Service class, semantically better
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //    Service functions
    public List<Student> getStudent(){
//        return a list
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
