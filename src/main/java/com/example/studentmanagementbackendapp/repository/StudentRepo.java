package com.example.studentmanagementbackendapp.repository;

import com.example.studentmanagementbackendapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
