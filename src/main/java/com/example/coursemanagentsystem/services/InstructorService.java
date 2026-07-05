package com.example.coursemanagentsystem.services;

import com.example.coursemanagentsystem.models.Instructor;
import com.example.coursemanagentsystem.repositories.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;

    @Autowired
    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }

    public Instructor findById(int id) {
        return instructorRepository.findById(id);
    }
}
