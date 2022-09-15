package com.example.studentmanagmentsystem.repository;

import com.example.studentmanagmentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
