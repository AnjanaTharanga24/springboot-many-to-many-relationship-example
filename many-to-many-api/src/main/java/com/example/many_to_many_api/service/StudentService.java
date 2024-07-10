package com.example.many_to_many_api.service;

import com.example.many_to_many_api.model.Student;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);
    List<Student> getAllStudents();

    Student updateStudent(Long studentId , Long courseId);

}
