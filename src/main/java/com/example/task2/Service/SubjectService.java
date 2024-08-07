package com.example.task2.Service;

import com.example.task2.Entity.Student;
import com.example.task2.Entity.Subject;
import com.example.task2.Repository.StudentRepository;
import com.example.task2.Repository.SubjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Subject addSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}