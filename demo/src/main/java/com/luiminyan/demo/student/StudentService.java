package com.luiminyan.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

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
//        check if email exist, if not throw exception
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if (studentByEmail.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
//        if is not present: save student
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId){
        boolean idExist = studentRepository.existsById(studentId);
        if (!idExist) {
            throw new IllegalStateException(
                    "Student with id " + studentId + " does not exist!"
            );
        }
        studentRepository.deleteById(studentId);
    }
}
