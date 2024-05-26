package com.example.studentmanagementbackendapp.service.impl;

import com.example.studentmanagementbackendapp.entity.Student;
import com.example.studentmanagementbackendapp.repository.StudentRepo;
import com.example.studentmanagementbackendapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student insertStudentIntoDatabase(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public Student updateStudent(int id, Student student) {
        Student studentFromDB = studentRepo.findById(id).get();
        studentFromDB.setName(student.getName());
        studentFromDB.setAyear(student.getAyear());
        studentRepo.save(studentFromDB);
        return studentFromDB;
    }

    @Override
    public Student deleteStudent(int id) {
        Student student = studentRepo.findById(id).get();
        studentRepo.deleteById(id);
        return student;
    }
}
