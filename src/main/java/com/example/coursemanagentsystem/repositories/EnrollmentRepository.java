package com.example.coursemanagentsystem.repositories;

import com.example.coursemanagentsystem.models.Enrollment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EnrollmentRepository {
    private final List<Enrollment> enrollments = new ArrayList<>();

    public EnrollmentRepository() {
        enrollments.add(new Enrollment(1, "Student X", 1));
        enrollments.add(new Enrollment(2, "Student Y", 1));
        enrollments.add(new Enrollment(3, "Student Z", 2));
    }

    public List<Enrollment> findAll() {
        return enrollments;
    }

    public Enrollment findById(int id) {
        return enrollments.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Enrollment create(Enrollment enrollment) {
        int nextId = enrollments.stream().mapToInt(Enrollment::getId).max().orElse(0) + 1;

        enrollment.setId(nextId);
        enrollments.add(enrollment);
        return enrollment;
    }

    public Enrollment update(int id, Enrollment enrollment) {
        Enrollment existing = findById(id);

        if (existing == null) return null;
        existing.setStudentName(enrollment.getStudentName());
        existing.setCourseId(enrollment.getCourseId());
        return existing;
    }

    public Enrollment deleteById(int id) {
        Enrollment existing = findById(id);

        if (existing == null) return null;
        enrollments.remove(existing);
        return existing;
    }
}
