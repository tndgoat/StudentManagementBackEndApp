package com.example.studentmanagementbackendapp.service;

import com.example.studentmanagementbackendapp.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student insertStudentIntoDatabase(Student student);

    Student getStudentById(int id);

    Student updateStudent(int id, Student student);

    Student deleteStudent(int id);

}
