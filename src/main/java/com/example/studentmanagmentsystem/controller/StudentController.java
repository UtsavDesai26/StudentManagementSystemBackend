package com.example.studentmanagmentsystem.controller;

import com.example.studentmanagmentsystem.model.Student;
import com.example.studentmanagmentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    @GetMapping("/liststudent")
    public String getAllStudent(){
        return "Get All Student";
    }

    @GetMapping("/student/{id}")
    public String getstudent(){
        return "Get";
    }

    @PutMapping("/student/{id}")
    public String updatestudent(){
        return "Update";
    }

    @DeleteMapping("/student/{id}")
    public String deletestudent(){
        return "Delete";
    }

    @PostMapping("/student")
    public String addstudent(){
        return "Post";
    }
}
