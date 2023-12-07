package com.luiminyan.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// type of data, and type of id
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
