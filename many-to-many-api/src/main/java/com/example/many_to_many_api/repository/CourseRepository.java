package com.example.many_to_many_api.repository;

import com.example.many_to_many_api.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course , Long> {
}
