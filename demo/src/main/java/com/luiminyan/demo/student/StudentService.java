package com.luiminyan.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// @Component: to make StudentService class a java bean
// @Service: make it a Service class, semantically better
@Service
public class StudentService {
//    Service functions
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                )
        );
    }
}
