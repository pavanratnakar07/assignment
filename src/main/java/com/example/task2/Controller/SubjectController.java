package com.example.task2.Controller;


import com.example.task2.Entity.Subject;
import com.example.task2.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//
//@RestController
//@RequestMapping("/subjects")
//public class SubjectController {
//
//    @Autowired
//    private SubjectService subjectService;
//
//    // Create a new subject
//    @PostMapping
//    public Subject createSubject(@RequestBody Subject subject) {
//        return subjectService.createSubject(subject);
//    }
//
//    // Get all subjects
//    @GetMapping
//    public List<Subject> getAllSubjects() {
//        return subjectService.getAllSubjects();
//    }
//
//    // Get a subject by ID
//    @GetMapping("/{id}")
//    public Subject getSubjectById(@PathVariable Long id) {
//        return subjectService.getSubjectById(id);
//    }
//
//    // Update an existing subject
//    @PutMapping("/{id}")
//    public Subject updateSubject(@PathVariable Long id, @RequestBody Subject subjectDetails) {
//        return subjectService.updateSubject(id, subjectDetails);
//    }
//
//    // Delete a subject
//    @DeleteMapping("/{id}")
//    public void deleteSubject(@PathVariable Long id) {
//        subjectService.deleteSubject(id);
//    }
//
//    // Get students associated with a subject
//    @GetMapping("/{id}/students")
//    public List<Student> getStudentsBySubject(@PathVariable Long id) {
//        return subjectService.getStudentsBySubject(id);
//    }
//}

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.addSubject(subject);
    }

   
}