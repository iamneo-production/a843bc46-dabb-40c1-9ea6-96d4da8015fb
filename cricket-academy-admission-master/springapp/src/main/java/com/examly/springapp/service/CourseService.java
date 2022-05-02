package com.examly.springapp.service;

import com.examly.springapp.exception.CourseNotFoundException;
import com.examly.springapp.model.Course;
import com.examly.springapp.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class CourseService {
    private final CourseRepo courseRepo;

    @Autowired
    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public Course addCourse(Course course){
        return courseRepo.save(course);
    }

    public List<Course> findAllCourses(){
        return courseRepo.findAll();
    }

    public Course updateCourse(Course course){
        return  courseRepo.save(course);
    }

    public Course findCourseById(Long Id){
        return courseRepo.findCourseById(Id)
                .orElseThrow(() -> new CourseNotFoundException("Course by id " + Id + " was not found"));
    }

    public void deleteCourseById(Long Id) {
        courseRepo.deleteCourseById(Id);
    }
}

