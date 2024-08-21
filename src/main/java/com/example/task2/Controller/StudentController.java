package com.example.task2.Controller;

import com.example.task2.Entity.Student;
import com.example.task2.Entity.Subject;
import com.example.task2.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("save")
    public Student createStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PostMapping("/{studentId}/subjects")
    public ResponseEntity<?> addSubjectsToStudent(@PathVariable Long studentId, @RequestBody List<Subject> subjects) {
         studentService.addSubjectsToStudent(studentId, subjects);
         return new ResponseEntity<>(HttpStatus.CREATED);
    }


}

