package com.nyc.studentapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nyc.studentapp.entities.Student;
import com.nyc.studentapp.services.StudentService;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Create
    @GetMapping("/student/create")
    public ResponseEntity<Student> createStudent() {
        Student newStudent = new Student();
        newStudent.setFirstName("Mixalis");
        newStudent.setLastName("Nikitaras");
        newStudent.setAge(20);
        newStudent.setEmail("mixalis.nikitaras@example.com");
        Student createdStudent = studentService.createStudent(newStudent);
        return ResponseEntity.ok(createdStudent);
    }

    // Read all
    @GetMapping("/student/read")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    // Read one
    @GetMapping("/student/read/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id) {
        return ResponseEntity.ok(studentService.getStudentById(id).orElseThrow());
    }

    // Update
    @GetMapping("/student/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Integer id) {
        try {
            Student student = studentService.getStudentById(id).orElse(null);
            student.setFirstName("John");
            Student updatedStudent = studentService.updateStudent(id, student);
            return ResponseEntity.ok(updatedStudent);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete
    @GetMapping("/student/delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Integer id) {
        try {
            studentService.deleteStudent(id);
            return ResponseEntity.ok().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }
} 