package com.example.task2.Controller;

import com.example.task2.Entity.Student;
import com.example.task2.Entity.Subject;
import com.example.task2.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PostMapping("/{studentId}/subjects")
    public Student addSubjectsToStudent(@PathVariable Long studentId, @RequestBody List<Subject> subjects) {
        return studentService.addSubjectsToStudent(studentId, subjects);
    }
}

