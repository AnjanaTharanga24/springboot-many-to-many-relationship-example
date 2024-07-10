package com.example.many_to_many_api.controller;

import com.example.many_to_many_api.model.Course;
import com.example.many_to_many_api.repository.CourseRepository;
import com.example.many_to_many_api.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class CourseController {

    private CourseService courseService;
    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourse();
    }
}
