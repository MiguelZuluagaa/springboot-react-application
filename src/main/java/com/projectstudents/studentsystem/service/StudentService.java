package com.projectstudents.studentsystem.service;

import com.projectstudents.studentsystem.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Optional<Student> findById(int idStudent);
    public boolean deleteStudentById(int idStudent);
}
