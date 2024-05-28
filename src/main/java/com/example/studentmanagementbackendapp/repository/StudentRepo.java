package com.example.studentmanagementbackendapp.repository;

import com.example.studentmanagementbackendapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    @Query("SELECT COUNT(s) > 0 FROM Student s WHERE s.id = :id")
    boolean existsById(@Param("id") Integer id);
}
