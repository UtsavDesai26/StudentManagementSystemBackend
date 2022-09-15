package com.example.studentmanagmentsystem.controller;
import org.springframework.web.bind.annotation.*;

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
