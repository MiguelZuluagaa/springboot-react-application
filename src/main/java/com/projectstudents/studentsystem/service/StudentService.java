package com.projectstudents.studentsystem.service;

import com.projectstudents.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
