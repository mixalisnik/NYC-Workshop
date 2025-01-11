package com.nyc.studentapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nyc.studentapp.entities.Student;
import com.nyc.studentapp.services.StudentService;

@Controller
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public String index() {
        return "studentIndex";
    }

    // Test endpoints for development
    @GetMapping("/student/test/create")
    @ResponseBody
    public ResponseEntity<Student> testCreateStudent() {
        Student newStudent = new Student();
        newStudent.setFirstName("Mixalis");
        newStudent.setLastName("Nikitaras");
        newStudent.setAge(20);
        newStudent.setEmail("mixalis.nikitarass@example.com");
        Student createdStudent = studentService.createStudent(newStudent);
        return ResponseEntity.ok(createdStudent);
    }

    @GetMapping("/student/test/update/{id}")
    @ResponseBody
    public ResponseEntity<Student> testUpdateStudent(@PathVariable Integer id) {
        try {
            Student student = studentService.getStudentById(id).orElse(null);
            if (student == null) {
                return ResponseEntity.notFound().build();
            }
            student.setFirstName("John");
            Student updatedStudent = studentService.updateStudent(id,student);
            return ResponseEntity.ok(updatedStudent);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/student/test/delete/{id}")
    @ResponseBody
    public ResponseEntity<Void> testDeleteStudent(@PathVariable Integer id) {
        try {
            studentService.deleteStudent(id);
            return ResponseEntity.ok().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Actual CRUD endpoints for the frontend
    @PostMapping("/student/create")
    @ResponseBody
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.createStudent(student);
        return ResponseEntity.ok(createdStudent);
    }

    @GetMapping("/student/read")
    @ResponseBody
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/student/read/{id}")
    @ResponseBody
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id) {
        return ResponseEntity.ok(studentService.getStudentById(id).orElseThrow());
    }

    @PutMapping("/student/update/{id}")
    @ResponseBody
    public ResponseEntity<Student> updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        try {
            student.setId(id);
            Student updatedStudent = studentService.updateStudent(id,student);
            return ResponseEntity.ok(updatedStudent);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/student/delete/{id}")
    @ResponseBody
    public ResponseEntity<Void> deleteStudent(@PathVariable Integer id) {
        try {
            studentService.deleteStudent(id);
            return ResponseEntity.ok().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }
} 