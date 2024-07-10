package com.example.many_to_many_api.service;

import com.example.many_to_many_api.model.Course;

import java.util.List;

public interface CourseService {

    Course createCourse(Course course);

    List<Course> getAllCourse();
}
