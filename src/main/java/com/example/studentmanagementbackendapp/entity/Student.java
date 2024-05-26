package com.example.studentmanagementbackendapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Student")
public class Student {

    @Id
    private int id;
    private String name;
    private int ayear;

}
