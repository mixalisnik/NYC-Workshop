package com.nyc.studentapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nyc.studentapp.entities.Student;
import com.nyc.studentapp.repositories.StudentRepository;

@Service
public class StudentService {
    
    private final StudentRepository studentRepository;
    
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    // Create
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
    
    // Read
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    public Optional<Student> getStudentById(Integer id) {
        return studentRepository.findById(id);
    }
    
    // Update
    public Student updateStudent(Integer id, Student updatedStudent) {
        updatedStudent.setId(id);
        return studentRepository.save(updatedStudent);
    }
    
    // Delete
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
} 