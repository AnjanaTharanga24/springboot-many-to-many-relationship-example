package com.example.many_to_many_api.controller;

import com.example.many_to_many_api.model.Student;
import com.example.many_to_many_api.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestParam Long studentId, @RequestParam Long courseId){
        return studentService.updateStudent(studentId,courseId);
    }
}
