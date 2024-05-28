package com.example.studentmanagementbackendapp.controller;

import com.example.studentmanagementbackendapp.entity.Student;
import com.example.studentmanagementbackendapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudentsController() {
        return studentService.getAllStudents();
    }

    @GetMapping("/exists/{id}")
    public boolean checkIfStudentIdExists(@PathVariable int id) {
        return studentService.checkIfStudentIdExists(id);
    }

    @PostMapping("/insert")
    public Student insertStudentInDb(@RequestBody Student student) {
        return studentService.insertStudentIntoDatabase(student);
    }

    @GetMapping("/find/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public Student deleteStudentById(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }
}
