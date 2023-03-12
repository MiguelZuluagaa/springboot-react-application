package com.projectstudents.studentsystem.controller;

import com.projectstudents.studentsystem.model.Student;
import com.projectstudents.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @DeleteMapping("/delete/{idStudent}")
    public Boolean deleteStudentById(@PathVariable(value = "idStudent") int idStudent ){
        if(studentService.findById(idStudent) != null){
            return studentService.deleteStudentById(idStudent);
        }
        return false;
    }


}
