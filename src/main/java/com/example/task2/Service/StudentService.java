package com.example.task2.Service;

import com.example.task2.Entity.Student;
import com.example.task2.Entity.Subject;
import com.example.task2.Repository.StudentRepository;
import com.example.task2.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addSubjectsToStudent(Long studentId, List<Subject> subjects) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        student.getSubjects().addAll(subjects);
        return studentRepository.save(student);
    }
}