package com.projectstudents.studentsystem.service;

import com.projectstudents.studentsystem.model.Student;
import com.projectstudents.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(int idStudent) {
        return studentRepository.findById(idStudent);
    }

    @Override
    public boolean deleteStudentById(int idStudent) {
        try {
            studentRepository.deleteById(idStudent);
            return true;
        }catch (Exception exception){
            return false;
        }
    }
}
