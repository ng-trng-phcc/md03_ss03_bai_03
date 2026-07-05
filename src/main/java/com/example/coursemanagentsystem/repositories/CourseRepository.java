package com.example.coursemanagentsystem.repositories;

import com.example.coursemanagentsystem.models.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {
    private final List<Course> courses = new ArrayList<>();

    public CourseRepository() {
        courses.add(new Course(1, "Java Spring Boot", "ACTIVE", 1));
        courses.add(new Course(2, "React Fundamentals", "ACTIVE", 2));
        courses.add(new Course(3, "Database Design", "INACTIVE", 3));
    }

    public List<Course> findAll() {
        return courses;
    }

    public Course findById(int id) {
        return courses.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
