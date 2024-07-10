package com.example.many_to_many_api.service.impl;

import com.example.many_to_many_api.model.Course;
import com.example.many_to_many_api.model.Student;
import com.example.many_to_many_api.repository.CourseRepository;
import com.example.many_to_many_api.repository.StudentRepository;
import com.example.many_to_many_api.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private CourseRepository courseRepository;
    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Long studentId, Long courseId) {
        Student student = studentRepository.findById(studentId).orElseThrow();
        Course course = courseRepository.findById(courseId).orElseThrow();

        student.getLikedCourses().add(course);
        return studentRepository.save(student);
    }
}
