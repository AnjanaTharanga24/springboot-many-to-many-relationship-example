package com.example.many_to_many_api.repository;

import com.example.many_to_many_api.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student ,Long> {
}
