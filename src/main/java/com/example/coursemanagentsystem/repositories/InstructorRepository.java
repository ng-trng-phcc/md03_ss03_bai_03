package com.example.coursemanagentsystem.repositories;

import com.example.coursemanagentsystem.models.Instructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InstructorRepository {
    private final List<Instructor> instructors = new ArrayList<>();

    public InstructorRepository() {
        instructors.add(new Instructor(1, "Nguyen Van A", "a@gmail.com"));
        instructors.add(new Instructor(2, "Tran Thi B", "b@gmail.com"));
        instructors.add(new Instructor(3, "Le Van C", "c@gmail.com"));
    }

    public List<Instructor> findAll() {
        return instructors;
    }

    public Instructor findById(int id) {
        return instructors.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Instructor create(Instructor instructor) {
        int nextId = instructors.stream().mapToInt(Instructor::getId).max().orElse(0) + 1;
        instructor.setId(nextId);
        instructors.add(instructor);
        return instructor;
    }

    public Instructor update(int id, Instructor instructor) {
        Instructor existing = findById(id);
        if (existing == null) return null;
        existing.setName(instructor.getName());
        existing.setEmail(instructor.getEmail());
        return existing;
    }

    public Instructor deleteById(int id) {
        Instructor existing = findById(id);
        if (existing == null) return null;
        instructors.remove(existing);
        return existing;
    }
}
