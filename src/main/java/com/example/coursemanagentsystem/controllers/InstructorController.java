package com.example.coursemanagentsystem.controllers;

import com.example.coursemanagentsystem.models.Instructor;
import com.example.coursemanagentsystem.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    private final InstructorService instructorService;

    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping
    public ResponseEntity<List<Instructor>> getAllInstructors() {
        return ResponseEntity.ok(instructorService.getAllInstructors());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Instructor> getInstructorById(@PathVariable int id) {
        Instructor instructor = instructorService.getInstructorById(id);
        if (instructor == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(instructor);
    }

    @PostMapping
    public ResponseEntity<Instructor> createInstructor(@RequestBody Instructor instructor) {
        Instructor created = instructorService.createInstructor(instructor);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Instructor> updateInstructor(@PathVariable int id, @RequestBody Instructor instructor) {
        Instructor updated = instructorService.updateInstructor(id, instructor);
        if (updated == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Instructor> deleteInstructorById(@PathVariable int id) {
        Instructor deleted = instructorService.deleteInstructorById(id);
        if (deleted == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(deleted);
    }
}
