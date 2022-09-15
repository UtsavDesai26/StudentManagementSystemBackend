package com.example.studentmanagmentsystem.controller;

import com.example.studentmanagmentsystem.model.Student;
import com.example.studentmanagmentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/liststudent")
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public Student getstudent(@PathVariable Integer id){
        return studentRepository.findById(id).get();
    }

    @PutMapping("/student/{id}")
    public List<Student> updatestudent(@RequestBody Student student, @PathVariable Integer id){
        Student studentobj = studentRepository.findById(id).get();
        studentobj.setName(studentobj.getName());
        studentobj.setAddress(studentobj.getAddress());
        studentRepository.save(studentobj);
        return studentRepository.findAll();
    }

    @DeleteMapping("/student/{id}")
    public List<Student> deletestudent(@PathVariable Integer id){
        studentRepository.delete(studentRepository.findById(id).get());
        return studentRepository.findAll();
    }

    @PostMapping("/student")
    public List<Student> addstudent(@RequestBody Student student){
        studentRepository.save(student);
        return studentRepository.findAll();
    }
}
