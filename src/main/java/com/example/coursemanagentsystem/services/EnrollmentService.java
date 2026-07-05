package com.example.coursemanagentsystem.services;

import com.example.coursemanagentsystem.models.Enrollment;
import com.example.coursemanagentsystem.repositories.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    @Autowired
    public EnrollmentService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    public Enrollment getEnrollmentById(int id) {
        return enrollmentRepository.findById(id);
    }

    public Enrollment createEnrollment(Enrollment enrollment) {
        return enrollmentRepository.create(enrollment);
    }

    public Enrollment updateEnrollment(int id, Enrollment enrollment) {
        return enrollmentRepository.update(id, enrollment);
    }

    public Enrollment deleteEnrollmentById(int id) {
        return enrollmentRepository.deleteById(id);
    }
}
