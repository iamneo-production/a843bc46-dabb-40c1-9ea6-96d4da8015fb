package com.examly.springapp.repo;

import com.examly.springapp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepo extends JpaRepository<Course, Long> {

    Optional<Course> findCourseById(Long id);

    void deleteCourseById(Long id);
}