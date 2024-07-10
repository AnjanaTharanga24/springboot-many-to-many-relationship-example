package com.example.many_to_many_api.service.impl;

import com.example.many_to_many_api.model.Course;
import com.example.many_to_many_api.repository.CourseRepository;
import com.example.many_to_many_api.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }
}
